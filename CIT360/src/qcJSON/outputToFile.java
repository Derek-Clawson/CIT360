package qcJSON;
import qcJSON.org.quickconnectfamily.json.*;

import java.io.*;
import java.util.*;


public class outputToFile {

    public static void main(String[] args) {

        // Write Object to command line
    	// This Uses the qcJson JSONUtilities.stringify(),JSONOutputStream, JSONInputStream from the qcJson Library
        Person bill = new Person(29, "1234567890", "bill", "Hammelton");

        try {
            String jsonString = JSONUtilities.stringify(bill);
            System.out.println(jsonString);
        }catch(JSONException e)
        {
            e.printStackTrace();
        }

        // Write Object to file
        Person linda = new Person(29, "1234567890", "linda", "Hammelton");

        File personFile = new File("personFile.json");

        try {
            FileOutputStream fileOut = new FileOutputStream(personFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileOut);
            jsonOut.writeObject(linda);
            jsonOut.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        // Read Object from file

        try {
            FileInputStream fileIn = new FileInputStream(personFile);
            JSONInputStream jsonIn = new JSONInputStream(fileIn);

            HashMap jsonMap = (HashMap)jsonIn.readObject();
            jsonIn.close();

            Person fred = new Person();
            long age = (long)jsonMap.get("age");
            fred.setAge((int)age);
            fred.setPhone((String)jsonMap.get("phone"));
            fred.setFirstName((String)jsonMap.get("firstName"));
            fred.setLastName((String)jsonMap.get("lastName"));

            String jsonString1 =  JSONUtilities.stringify(fred);
            System.out.println(jsonString1);


        }catch(Exception e)
        {
            e.printStackTrace();
        }


//        // Write to File without permissions - Does'nt work

        try {

            FileOutputStream fileOut = new FileOutputStream("noPerm.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fileOut);
            jsonOut.writeObject(linda);
            jsonOut.close();

        }catch(Exception e)
        {
            System.out.println("Error: Could not write to file // Permission Denied");
        }



//        // Read Image - Does'nt Work

        try {
            FileInputStream fileOut = new FileInputStream("img.jpg");
            JSONInputStream jsonIn = new JSONInputStream(fileOut);

            // Always close files.
            jsonIn.close();

        }catch(Exception e)
        {
            System.out.println("Error: Could not read file: IMG");
        }



        // Read object null - Does'nt Work

        try {
            FileInputStream fileIn = new FileInputStream("text.txt");
            JSONInputStream jsonIn = new JSONInputStream(fileIn);

            HashMap jsonMap = (HashMap)jsonIn.readObject();
            jsonIn.close();


        }catch(Exception e)
        {
            System.out.println("Error: Can't read NULL file/object");
        }

    }
}
