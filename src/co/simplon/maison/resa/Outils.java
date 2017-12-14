package co.simplon.maison.resa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Outils {

	
	
	public static java.sql.Date stringToDate(String dateStr)  {  
		
		
		DateFormat format = new SimpleDateFormat("d/mm/yyyy", Locale.FRANCE);
		format = new SimpleDateFormat("yyyy-mm-d");
		java.sql.Date date = null;
		try {
			date = (java.sql.Date) format.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(date); 
		
		
		return date;
}
}