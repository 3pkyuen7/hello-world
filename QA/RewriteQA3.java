import java.util.*;
public class RewriteQA3{
	public static void main(String[]args){
		qA3a();
		qA3b();
	}
	public static void qA3a(){
		int i = 10;
		while(i<=100){
			System.out.println(i);
			i += 10;
		}
	}
	public static void qA3b(){
		Scanner kb = new Scanner(System.in);
		int sum = 0;
		int value = 1;
		while(value >0){
			value=kb.nextInt();
			sum += value;
		}
	}
}