package Assignment.projectStudy_folderviews;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FolderView {

    public static void main(String[] args) {

        ArrayList<String> folderNames =  new ArrayList<>();
        folderNames.addAll(Arrays.asList("Talk", "tasks", "Files", "contacts"));

        List<Integer> sizeOfFolderNames = folderNames.stream().map( folderName -> folderName.length()).collect(Collectors.toList());

        System.out.println("sizeOfFolderNames = " + sizeOfFolderNames);

        System.out.println("Bring me the folders starting with uppercase letter:");

        List<String> foldersStartingUpperCase = folderNames.stream()
                                                .filter( each -> Character.isUpperCase(each.charAt(0)) == true)
                                                .collect(Collectors.toList());

        System.out.println("foldersStartingUpperCase = " + foldersStartingUpperCase);

        
        
        
        
        
        
        
        
        
        
        
        
        
        

        System.out.println("===========================================================");
        System.out.println("sizeOfFolderNames = " + sizeOfFolderNames);

        System.out.println("1-folderNames = " + folderNames);

        List<String> sortedVersion = folderNames.stream().sorted().collect(Collectors.toList());

        System.out.println("2-folderNames (sortedVersion) = " + sortedVersion);

        List<String> reversedVersion = sortedVersion;
        Collections.reverse(reversedVersion);

        System.out.println("3-folderNames (reverseVersion) = " + reversedVersion);


        System.out.println("=================================================");
        System.out.println("Sort with for loop with traditional logic:");

        //"Talk", "Tasks", "Files", "Contacts"
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Mahmut","Ziya","Ahmet","Mehmet"));
        System.out.println("newList = " + newList);

        Comparator myComparator = Collections.reverseOrder();

        Collections.sort(newList,myComparator);

        System.out.println(newList);

        System.out.println("===================================================");

        List<String> strList = new ArrayList<>(Arrays.asList("12","124","15","89"));

        System.out.println("strList = " + strList);

        List<Integer> numbers = strList.stream().map( str -> Integer.parseInt(str)).sorted().collect(Collectors.toList());

        System.out.println("numbers = " + numbers);


    }

    

}
