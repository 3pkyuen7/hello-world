public class QA9{
	public static void main(String[]args){
		int [] rawData = {3, 9, 5, 7, 12};
		printBarChart(rawData);
	}

	public static void printBarChart(int [] data){
		for(int i = 0 ;i < data.length;i ++){
			for(int j = data[i];j> 0;j--){
				System.out.print("* "); // " " is added in order to read easier 
			}
		System.out.println();
		}
	}
	
}