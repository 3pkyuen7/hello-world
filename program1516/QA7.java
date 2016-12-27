public class QA7{
	public static void main(String[] args){
	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	System.out.println(findAverage(num1,num2,num3));
	}
	public static double findAverage(int num1,int num2,int num3){
		double ans = (double)(num1 + num2 +num3)/3;	// return statment can't in the same line
		return ans;
	}
}
