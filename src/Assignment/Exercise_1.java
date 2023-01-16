package Assignment;

import java.util.*;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        countElements(scan.next());
    }
    public static void countElements(String input){
        Map<String ,Integer> resultMap = new HashMap<>();
        List<String[]> wordArrayLines = new ArrayList<>();
        List<String[]> wordArrays = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        int count=0;
        String temp = null;
        if(input.contains("\n")){
            wordArrayLines.add(input.split("\n"));
            for(String sentence : wordArrayLines.get(0)){
                wordArrays.add(sentence.split(" "));
            }
        }else{
            wordArrays.add(input.split(" "));
        }
        for (int i = 0; i < wordArrays.size(); i++) {
            for (int j = 0; j < wordArrays.get(i).length; j++) {
                if(!wordArrays.get(i)[j].equals(" ")) {
                    temp = wordArrays.get(i)[j];
                }
                for (int k = 0; k < wordArrays.size(); k++) {
                    for (int l = j+1; l < wordArrays.get(k).length; l++) {
                        if(wordArrays.get(k)[l].equalsIgnoreCase(temp)){
                            count++;
                            wordArrays.get(k)[l]=" ";
                        }
                    }
                }
                resultMap.put(temp,count);
                count=0;
            }
        }
        List<Map.Entry<String,Integer>> sortedList = new ArrayList<>(resultMap.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());

        resultMap.put("lines",wordArrayLines.size());

        for (String[] arr : wordArrays){
            count += arr.length;
        }
        resultMap.put("words",count);
        count = 0;

        System.out.println("lines "+"= ("+resultMap.get("lines")+")");
        System.out.println("words "+"= ("+resultMap.get("words")+")");

        System.out.print("top-5 = ");
        resultMap.forEach((k,v)->System.out.print(k+" ("+v+"), "));
    }
}
