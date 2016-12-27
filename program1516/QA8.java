public class QA8{
	public static void main(String[] args){
	int [] data = {3,9,5,7,12};
	printReverseArray(data);
}
	public static void printReverseArray(int []data){
		for(int i = data.length -1;i>= 0;i--){
			System.out.print(data[i]+" ");
		}
	}
}