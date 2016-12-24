import java.util.*;
public class RewriteQA4{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int val =kb.nextInt();	//val must be initialized 
		int ans =0;	//asume ans is 0 ,must be initialized
		switch(val){
			case 1:	
			case 2:	ans += 3;
					break;
			case 3:	ans += 10;
					break;
			case 4:	ans += 20;
					System.out.println("Max");
					break;
			default:ans = 0;
					System.out.println("Invalid value");
		}
	}
}