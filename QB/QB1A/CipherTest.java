import java.util.*;
public class CipherTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Text to encode:");
		String plain = input.nextLine();
		CipherTool cipherTool = new CipherTool();
		String cipher = cipherTool.encode(plain);
		System.out.println("Cipher text:");
		System.out.println(cipher);
	}
}