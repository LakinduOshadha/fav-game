import java.io.*;
import java.util.*;

/**
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class FavoriteGame {
    // Initializing global variables
    public TreeSet<String> nameToSport = new TreeSet<>();//name to sport
    public HashMap<String, Integer> sportToCount = new HashMap<>();//sport to freq
    public int countMax = 0;
    public String sportMax = "";

    /**
     * Gets input from the user &
     * finds the Popular sport
     *
     * @return  Popular sport
     * @throws IOException
     */
    public String findPopularSport() throws IOException {
        System.out.print("This program will find the name of sport liked by most number of people and " +
                "the number of people having football as their favorite game.\n" +
                "Enter data to the given format : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // Getting user input and adding them to hashmap
        for(int i = 0; i < n; i++) {
            StringTokenizer newStringTokenizer = new StringTokenizer(reader.readLine());
            String name = newStringTokenizer.nextToken();
            name = name.toUpperCase();
            String sport = newStringTokenizer.nextToken();
            sport = sport.toUpperCase();
            // Adding the name if it is already not added
            if(nameToSport.contains(name)) {
                continue;
            } else {
                nameToSport.add(name);  //using add method to add the name
                // Putting the current input sport to the hashmap and increasing the count by 1
                sportToCount.put(sport, sportToCount.containsKey(sport) ? sportToCount.get(sport)+1:1);
            }
            // Setting the sportMax if it is empty
            if(sportMax == "") {
                sportMax = sport;
                countMax = 1;
            }
            // Finds whether the input sport's count is greater then the current max count
            if(sportToCount.get(sport) > countMax) {
                sportMax = sport;   // setting the sportMax to the current input sport
                countMax = sportToCount.get(sport); // setting the countMax to the count of current input sport
            } else if(sportToCount.get(sport) == countMax && sport.compareTo(sportMax) < 0) {
                sportMax = sport;
                countMax = sportToCount.get(sport);
            }
        }
        return sportMax;    // Returns sportMax
    }

    /**
     * Prints the count of FOOTBALL
     *
     */
    public void printFootball() {
        if(sportToCount.get("FOOTBALL") == null) {
            System.out.println("No people having football as their favorite game ! \n");
        } else {
            System.out.println("No. of people having football as their favorite game : " + sportToCount.get("FOOTBALL"));
        }
    }

    /**
     * main
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Creating a object of FavoriteGame
        FavoriteGame test1 = new FavoriteGame();
        // Prints sport liked by most number of people
        System.out.println("The sport liked by most number of people : " + test1.findPopularSport());
        //Prints the No. of people having football as their favorite game
        test1.printFootball();
    }
}

