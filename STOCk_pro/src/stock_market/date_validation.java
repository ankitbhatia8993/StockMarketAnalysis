
package stock_market;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
 
public class date_validation {

    static class isThisDateValid {

        public isThisDateValid() {
        }
    }
 
	public boolean isThisDateValid(String dateToValidate, String dateFromat){
 
		if(dateToValidate == null){
			return false;
		}
 
		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);
 
		try {
 
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);
 
		} catch (ParseException e) {
 
			e.printStackTrace();
			return false;
		}
 
		return true;
	}
 
}
