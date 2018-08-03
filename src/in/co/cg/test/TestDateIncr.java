package in.co.cg.test;

import java.text.ParseException;
import java.util.Scanner;

import javax.xml.bind.ValidationException;

import in.co.cg.incrdate.DateIncrement;

//Test class to implement date increment
public class TestDateIncr {
	public static void main(String[] args) {
		DateIncrement dateIncrement = new DateIncrement();

		Scanner get = new Scanner(System.in);
		int noOfDays = 0;
		System.out.println("Enter the date in (dd/MM/yyyy) format");
		String inputDate = get.next();// Input date

		try {
			try {
				dateIncrement.validDay(inputDate);
				System.out.println("Entered Date: " + inputDate);
				System.out.println("Enter number of days after which future date is to be found: ");
				noOfDays = get.nextInt();
				System.out.println("Future Date: " + dateIncrement.dayAdd(inputDate, noOfDays));
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		} catch (ParseException e) {

			e.printStackTrace();
		}
		get.close();
	}
}
