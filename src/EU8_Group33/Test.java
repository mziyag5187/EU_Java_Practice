package EU8_Group33;

import sun.util.resources.LocaleData;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        String s1 = "yes";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        ///////////////////////////////////////

        //LocalDate date = LocaleData.of(2021,4,31);
        //System.out.println(date);
                

        ////////////////////////////////

        int number = 3;
        Long numberLong =(long) number;// gives you compile error

        ////////
        System.out.println("Q7: ================================");

        ArrayList<String> names = new ArrayList<>();

        names.add("Medina");
        names.add(2,"Erhan");
        names.add(1,"Hakan");

        System.out.println(names);
    }





}

