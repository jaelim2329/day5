import java.util.Scanner;

import exception.BadDayException;
import exception.BadMonthException;

public class ExceptionCreation {
	
	private static int[] days = {31, 28, 31, 30, 31, 30, 31, 30, 30, 31, 30, 31};

	public enum months{
		JANUARY, FEBURARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}
	
	public static void main(String[] args) throws BadMonthException, BadDayException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in 'quit' at beginning to cancel the program");
		boolean quit = false;
		
		while(!quit){
			System.out.println("Enter month:");
			String month = sc.nextLine();
			
			if(month.equalsIgnoreCase("quit")){
				break;
			}
			
			System.out.println("Enter day:");
			int day;
			while(true){
				try {
					day = Integer.valueOf(sc.nextLine());
					break;
				} catch (NumberFormatException e){
					System.out.println("Not a number, try again!");
				}
			}
			System.out.println("Result: " + testException(month, day));
			System.out.println("Type 'quit' in order to stop");
		}

	}
	
	public static boolean testException(String s, int i) throws BadMonthException, BadDayException{
		int monthCount;
		try{
			for (monthCount = 0; monthCount < months.values().length; monthCount ++){
				if (months.values()[monthCount].name().equalsIgnoreCase(s)) {
					break;
				}
			}
			
			if (monthCount == months.values().length){
				throw new BadMonthException();
			}
		} catch (BadMonthException be){
			System.out.println("Bad Month!");
			return false;
		}

		try {
			if (i > days[monthCount]) {
				throw new BadDayException();
			}
		} catch (BadDayException bd){
			System.out.printf("Date: %d is not a valid date for month:%d \n", i, (monthCount + 1));
//			System.out.println("Invalid date for month: " + (monthCount + 1));
			return false;
		}
		return true;
	}

	

}
