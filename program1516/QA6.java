public class QA6{
	public static void main(String[] args){
	long answer = 0;
	for (int i =2 ; i <= 14; i+=2){
		answer += Math.pow(3,i);
		System.out.println(i+"  "+answer);
	}
	}
}