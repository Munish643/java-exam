import java.io.*;
import java.util.*;

public class props {
    public static void main(String[] args) {
        Properties props = new Properties();

        //to set properties 
        props.setProperty("database.username","root");
        props.setProperty("database.password","admin");

        //to get properties 
        String user = props.getProperty("database.username");
        String pass = props.getProperty("database.password");

        //printing values 
        System.out.println(user);
        System.out.println(pass);


    }
   
}

// import java.io.*;
// import java.util.*;

// public class props {
//     public static void main(String[] args) {
//         Properties props = new Properties();

//         // Set properties 
//         props.setProperty("database.username", "root");
//         props.setProperty("database.password", "admin");

//         // Get properties 
//         String user = props.getProperty("database.username");
//         String pass = props.getProperty("database.password");

//         // Print values
//         System.out.println(user);  // Should print "root"
//         System.out.println(pass);  // Should print "admin"
//     }
// }
