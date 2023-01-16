package Assignment.InterviewQs;

import java.util.*;

public class Question_1 {

    public static void main(String[] args) {

        String allItems = "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent',32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK',29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter',13000";

        //split the string by "samsung"
        String[] itemsAsArray = allItems.split("samsung,");

        //parse the string by "samsung" keyword
        //and put all products into an array (as String)
        for (int i = 1; i < itemsAsArray.length; i++) {
            itemsAsArray[i] = "samsung ".concat(itemsAsArray[i]);
            System.out.println( "item: " + itemsAsArray[i] );
        }

        //put prices into an array (as integer)
        int[] pricesAsArray = new int[itemsAsArray.length];
        for (int i = 1; i < itemsAsArray.length; i++) {
            String[] s = itemsAsArray[i].split(",");
            pricesAsArray[i] = Integer.parseInt(s[s.length - 1].trim());
            System.out.println( "price: " + pricesAsArray[i] );
        }

        //first solution
        //put all prices and products in a map
        Map<Integer, String> priceAndItemMap = new HashMap<>();
        for (int i = 1; i < pricesAsArray.length; i++) {
            priceAndItemMap.put(pricesAsArray[i], itemsAsArray[i]);
        }

        ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(priceAndItemMap.entrySet());
        list.sort(Map.Entry.comparingByKey());

        for (Map.Entry<Integer, String> element : list) {
            System.out.println(element);
        }

        System.out.println("-------------------------");

        //second solution
        //put all prices and products in a map
        Map<Integer, String> priceAndItemMap2 = new TreeMap<>();
        for (int i = 1; i < pricesAsArray.length; i++) {
            priceAndItemMap2.put(pricesAsArray[i], itemsAsArray[i]);
        }

        for (Map.Entry<Integer, String> element : priceAndItemMap2.entrySet()) {
            System.out.println(element);
        }


    }
}
