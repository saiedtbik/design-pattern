package usecase;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Saied","Vahid");
        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
