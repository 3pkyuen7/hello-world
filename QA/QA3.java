import java.util.*;
public class QA3{
	public static void main(String[]args){
		a();
		b();
	}
	public static void a(){
		for (int i=10; i<=100; i+=10)
			System.out.println(i);
	}
	public static void b(){
		Scanner kb = new Scanner(System.in);
		int sum=0;
		int value=1;
		for (; value>0; sum+=value)
			value = kb.nextInt(); 
	}
}