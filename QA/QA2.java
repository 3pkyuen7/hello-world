public class QA2{
	public static void main(String[]args){
		int i = 3,j = 4, k = 5;
		System.out.println("Answer = " + j + k);
		System.out.println("Answer = " + (j+5)*3);
		System.out.println("Answer = " + (j*k));
		// process in different method so i remember that the variable would not be changed
		// in the main method
		// even there are i++ or something(not sure)
		bI(i,j,k);
		bII(i,j,k);
		bIII(i,j,k);
		bIIII(i,k);
	}
	
	public static void bI(int i ,int j,int k){
		System.out.println((j / i + ++k - j));
	}

	public static void bII(int i,int j,int k){
		System.out.println(k + i / (double) j);
	}

	public static void bIII(int i,int j,int k){
		System.out.println((--i + j++ + k) / 3);
	}

	public static void bIIII(int i,int k){
		System.out.println((char) (k*k*i-8));
	}

}