import java.util.*;
public class QA5{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int numLine =kb.nextInt();
		// some program statements here to set numLine
		for (int i=1; i<=numLine;i++) {
			for (int j = i;j <= i*2-1;j++ )
				System.out.print(j+" ");
			System.out.println();
		}
	}
}