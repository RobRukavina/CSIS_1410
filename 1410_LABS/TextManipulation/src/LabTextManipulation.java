import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates a list of National Parks and stores them in a String Builder. 
 * Then fixes casing to Title Case and prints the String;
 * 
 * @author Rob R.
 */
public class LabTextManipulation {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> parks = new ArrayList<String>();
        StringBuilder nationalParks = new StringBuilder();
        String userInput = "";
        
        System.out.println("Please enter a name of a national park or DONE to stop: ");
        
        userInput = scnr.nextLine().toLowerCase();
        
        while(!userInput.equals("done")){
                parks.add(userInput);
                System.out.println("Please enter a name of a national park or DONE to stop: ");
                userInput = scnr.nextLine().toLowerCase();
        } 
        
        
        for (int i = 0; i < parks.size(); i++) {
            String park = parks.get(i);
            if(i != parks.size() - 1){
                nationalParks.append(park.concat(" | "));
            } else {
                nationalParks.append(park);
            }
        }
        
        nationalParks = nationalParks.replace(0, nationalParks.length(), updateSpelling(nationalParks.toString()));   
        
        System.out.println("Favorite National Parks: " + nationalParks);
        scnr.close();
    }
    
    /**
     * Corrects casing to Title Case on String Arguments
     * 
     * @param text the string passed
     * @return the String with corrected case to Title Case
     */
    private static String updateSpelling(String text){
        String[] temp = text.split(" | ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < temp.length; i++){
            String w = temp[i];
            if(!w.isEmpty()){
                sb.append(Character.toUpperCase(w.charAt(0)))
                .append(w.substring(1));
            }
            if(i != temp.length - 1){
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
