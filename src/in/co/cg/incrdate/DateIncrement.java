package in.co.cg.incrdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.ValidationException;

//This class increment days Entered by the user
public class DateIncrement {

	/**
	 * @param inputDate
	 * @throws ValidationException
	 */
	public void validDay(String inputDate) throws ValidationException {

		String arrDate[] = inputDate.split("/");

		int day, month, year;
		day = Integer.parseInt(arrDate[0]);
		month = Integer.parseInt(arrDate[1]);
		year = Integer.parseInt(arrDate[2]);

		if (day > 31 || day < 1 || month < 1 || month > 12 || year < 0) {
			throw new ValidationException("Inavlid Date");// throw ValidationException
		}

	}

	public String dayAdd(String inputDate, int noOfDays) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse(inputDate);
		Calendar c = Calendar.getInstance();

		c.setTime(date);
		c.add(Calendar.DATE, noOfDays);
		String newDate = dateFormat.format(c.getTime());
		return newDate;

	}

}
