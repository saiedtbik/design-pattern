package usecase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url  = new URL("https", "github.com",443,"/gitFile");
        BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = input.readLine()) != null){
            System.out.println(inputLine);
        }
        input.close();
    }
}
