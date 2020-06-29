package FlowStep.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmailHelper {

    private static SimpleDateFormat df;

    public static String generateEmail(String email){

        email = email + generateDateNow("yyyyMMddHHmmss") + "@mailinator.com";

        return email;
    }

    public static String generateDateNow(String dateFormat){
        df = new SimpleDateFormat(dateFormat);
        Date dateNow = new Date();

        return df.format(dateNow);
    }
}
