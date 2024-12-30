import java.util.ArrayList; // importing collection which is an ARRAYLIST 
import java.util.Collections; //importing collections 

public class coll {
    public static void main(String[] args) {
        ArrayList<String>students = new ArrayList<>(); 
        // adding elements in list
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice");
        System.out.println("students : " + students);

        // sorting them 
        Collections.sort(students);
        System.out.println("after sorting : " + students);
        
        // using contain() method to check if list contains specific element or not
        System.out.println("check if Alice is in List ? " + students.contains("Alice"));

        //clearing the list 
        students.clear();
        System.out.println("after clearing list : " + students);
    } 
}
