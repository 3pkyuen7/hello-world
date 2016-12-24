import java.util.*;
public class QA4{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int val=kb.nextInt();
		int ans=0;
		if (val==1 || val==2)
		ans += 3;
		else if (val==3)
		ans += 10;
		else if (val==4) {
		ans += 20;
		System.out.println("Max");
		} else {
		ans = 0;
		System.out.println("Invalid value");
		}
	}
}