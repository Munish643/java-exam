import java.util.ArrayList;//yeh ya ha 
import java.util.Collections;//or yeh bhi 

public class coll {
    public static void main(String[] args) {
        ArrayList<String>students = new ArrayList<>();
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice");
        System.out.println("students : " + students);

        Collections.sort(students);
        System.out.println("after sorting : " + students);

        System.out.println("check if Alice is in List ? " + students.contains("Alice"));

        students.clear();
        System.out.println("after clearing list : " + students);

    }
    
}
