public class QA9{
	public static void main(String[] args){
		int i=0;
		int sum=0;
		while (i<5) {
		i++;
		if (i%2==0)
		break; // <--- (*)
		sum+=i;
		}
		System.out.println("sum = " + sum);
	}
}