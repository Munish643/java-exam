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


// to load
InputFileStream is = new InputFileStream("db.properties");
Properties prop = new Properties;
props.load(is);
is.close();

//to store
OutputFileStream os = new OutputFileStream("db.properties");
Properties prop = new Properties;
props.store (os,"database config");
os.close();


