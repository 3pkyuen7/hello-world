public class QA7{
	public static void main(String[]args){
		String s1 = "Java Programming";
		String s2 = "Java is object-oriented";
		//String s1 = s1 + s2; --> it part if the question
		//b(i) --> cause error : variable s1 is already defined in method main(String[])//
		//b(ii) immutable means can not be changed //
		//String s1 = s1 + s2 defines String s1 one more time//
		System.out.println(s1.indexOf('P')); 
		System.out.println(s1.substring(4, 10));
		System.out.println(s2.lastIndexOf('o'));
	}
}