public class QA6{
	public static void main(String[]args){
		double ans = 0;
		for(int i = 2;i <= 20;i +=2){
			ans += (double)1/i;
			// testing :System.out.println(i);
		}
		System.out.println(ans);
	}
}