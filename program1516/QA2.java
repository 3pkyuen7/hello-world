public class QA2{
	public static void main(String[]args){
		int x = 1, y = 2, z = 3;
		ai(x,y,z);
		aii(x,y,z);
		aiii(x,y,z);
		aiv(x,y,z);
	}
	public static void ai(int x, int y, int z){
		System.out.print("Answer of \"" + x + y + z);
	}
	public static void aii(int x, int y, int z){
		System.out.print("\" should be = " + x * y * z);
	}
	public static void aiii(int x, int y, int z){
		System.out.print("\nx++ - --y + ++z = ");
	}
	public static void aiv(int x, int y, int z){
		System.out.print(x++ - --y + ++z);
	}
}
