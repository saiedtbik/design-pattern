package usecase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
         Pattern pattern = Pattern.compile("(<div> | <span> | <p>) (.*?) (</div> | </span> | </p>)");
        var matcher = pattern.matcher("<html> <head></head> <body> <div> <span> Hi Span  </span> <p> Hi Paragraph </p> </div> </body> </html>");
        matcher.find();
        matcher.group();


    }
}
