import java.util.*;
public class WeekTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your day in week:");
		int day = input.nextInt();
		System.out.println(convertWeek(day));
	}
	public static String convertWeek(int day){
		switch(day){
			case 0:
				return "Your Day is a Week End";
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				return "Your Day is a Week Day";
			case 6:
				return "Your Day is a Week End";
			default:
				return "Your Day is a Invalid Day";
		}

	}
}