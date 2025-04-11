import java.util.Arrays;  
import java.util.List;  

public class main2 {  

    public static void main(String[] args) {  
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};  
        String targetName = "Charlie";  

        // Using lambda expression with streams to find the name  
        boolean found = Arrays.stream(names)  
                .anyMatch(name -> name.equals(targetName));  

        if (found) {  
            System.out.println(targetName + " found in the array.");  
        } else {  
            System.out.println(targetName + " not found in the array.");  
        }  

        //Alternative: Using a List and lambda  

        List<String> nameList = Arrays.asList(names);  

        boolean foundAlternative = nameList.stream()  
                .anyMatch(name -> name.equals(targetName));  

        if (foundAlternative) {  
            System.out.println(targetName + " found in the list.");  
        } else {  
            System.out.println(targetName + " not found in the list.");  
        }  
    }  
}  