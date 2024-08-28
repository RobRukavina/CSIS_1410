import java.util.ArrayList;
import java.util.Scanner;

public class LabTextManipulation {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> parks = new ArrayList<String>();
        String userInput = "";
        
        System.out.println("Please enter a name of a National Park. If done enter done, DONE or dOnE");
        while(userInput != "done" || userInput != "DONE" || userInput != "dOnE"){ 
            userInput = scnr.nextLine();
            if(userInput != "done" || userInput != "DONE" || userInput != "dOnE"){
                parks.add(userInput);
                userInput = "";
            } 
        } 
        scnr.close();
        
        for (String string : parks) {
            System.out.println(string);
        }
    }
}
