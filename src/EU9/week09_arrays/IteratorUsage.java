package EU9.week09_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {
    public static void main(String[] args) {

        String[] cars = {"BWM","Mercedes","HacıMurat"};

        ArrayList<String> carsList = new ArrayList<>();

        carsList.addAll(Arrays.asList(cars));

        System.out.println(carsList);

        Iterator<String> it = carsList.iterator();

        while(it.hasNext()){
            String each = it.next();
            if(each.length()>3){
                it.remove();
            }
        }

        System.out.println(carsList);
    }
}
