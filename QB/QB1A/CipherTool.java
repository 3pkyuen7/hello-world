public class CipherTool {

	private char [] keyLower = { // key for lower-case English chars
		'v', 'b', 'o', 'p', 'c', 'd', 'h', 'i', 'g', 'n', 'x', 'y', 'q',
		'r', 't', 'j', 'k', 'l', 'e', 'f', 'm', 'u', 'w', 's', 'z', 'a' };

	private char [] keyUpper = { // key for upper-case English chars
		'X', 'Y', 'Z', 'A', 'Q', 'R', 'T', 'J', 'V', 'B', 'K', 'L', 'E',
		'F', 'M', 'U', 'G', 'N', 'O', 'P', 'C', 'D', 'H', 'I', 'W', 'S' };
	public CipherTool(){ 
		// if this is not created :error in case you only the constructor 
		// CipherTool(char [] keyLower,char [] keyUpper)
		// the test method can't be compiled
		this.keyLower = keyLower;
		this.keyUpper = keyUpper;
	}
	public CipherTool(char [] keyLower,char [] keyUpper){ // the constructor for part c
		this.keyLower = keyLower;
		this.keyUpper = keyUpper;
	}

	public String encode(String plainText) {
	StringBuffer cipher=new StringBuffer();

	for (int i=0; i< plainText.length() ; i++) {
	char c = plainText.charAt(i) ; 		// get a char from plainText
	char e;								// encoded character
	if ( c >='a'&&c <='z' ) { 			// is c lower-case?
	int index = c -'a' ; 				// where to look up in key?
	e = keyLower[index] ; 				// get encrypted char from key
	} else if (c>='A'&&c<='Z') { 		// is c upper-case?
	int index = c -'A'; 				// where to look up in key?
	e = keyUpper[index] ; 				// get encrypted char from key
	} else { 							// non-English character
	e = c; 								// non-English characters are not encoded
	}
	cipher.append(e);
	}

	return cipher.toString();
	}
}
