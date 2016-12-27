public class QA2{
	public static void main(String[]args){
		int x = 1, y = 2, z = 3;
		System.out.print("Answer of \"" + x + y + z);
		System.out.print("\" should be = " + x * y * z);
		System.out.print("\nx++ - --y + ++z = ");
		System.out.print(x++ - --y + ++z);
	}
}
