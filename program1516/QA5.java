import java.util.* ;
public class QA5{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int numLine = kb.nextInt();
		for (int i=1; i<=numLine ; i++ ) {
		for (int j=1; j<=numLine -i ; j++ )
		System.out.print( " " );
		for (int k=1; k<= i*2-1 ; k++ )
		System.out.print( i );
		System.out.println();
		}

	}
}