package usecases;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class Client {
    public static void main(String[] args) {


        /* calendar uses factory method design pattern*/
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("1"), Locale.ENGLISH);

        /* NumberFormat uses factory method design pattern*/
        NumberFormat format1 = NumberFormat.getInstance();
        NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.CANADA);


        /* ResourceBundle uses factory method design pattern*/
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
        System.out.println("Message in :" + Locale.US + " is : " + bundle.getString("greeting") );

        Locale.setDefault(new Locale("in", "ID"));
        bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in :"+Locale.getDefault()+" : "+bundle.getString("greeting"));
    }
}
