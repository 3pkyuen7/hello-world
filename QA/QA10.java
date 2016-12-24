public class QA10{
	public static void main(String[]args){
		int [][] table1 = {{1,2,3},{4,5,6},{5,3,7}};
		int [][] table2 = {{4,1,7},{2,2,2},{1,3,3}};
		int [][] result = sum2Tables(table1, table2);
		printTable(table1);	// example out put
		System.out.println("+ ");
		printTable(table2);
		System.out.println("= ");
		printTable(result);
	}
	public static int [][] sum2Tables(int [][] table1, int [][] table2){
		int [][] result = new int [table1.length][table1[0].length];
		for (int i = 0;i < table1.length;i++)
			for (int j = 0;j< table1[1].length;j++){
				result[i][j] = table1[i][j]+table2[i][j];
			}
		return result;
	}
	public static void printTable(int [][] table){
		for (int i = 0;i < table.length;i++){
			for(int j =0;j < table[i].length;j++)
				System.out.print(table[i][j]+" ");
			System.out.println();
		}
	}
}