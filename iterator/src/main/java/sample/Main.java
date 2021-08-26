package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileContentReader fileContentReader = new FileContentReader(new File("C:\\Users\\saeed\\Desktop\\file.txt"));
        Iterator<String> iterator = fileContentReader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
