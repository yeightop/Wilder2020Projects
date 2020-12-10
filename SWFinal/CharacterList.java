import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class CharacterList
{
  private static ArrayList<Character> chars = new ArrayList<Character>();

  



  /**
   * Constructor for the CharacterList class. Loads data from the AlteredSW.txt file
   * and populates the ArrayList chars.
   */
  public CharacterList()
  {
    System.out.println("CharacterList Begins");
    // Try scanning in the starwars file
    int i=0;
    try
    {
      Scanner sc = new Scanner(new File("AlteredSW.txt"));
      System.out.println("File scannered in");
      while (sc.hasNextLine())
      {
       
        // String method trim removes whitepsace from the beginning
        // and end of strings
        String temp = sc.nextLine().trim();
        
        //System.out.println("temps are created");
        // String method split splits this string based on the
        // specified token and returns an array of individual substrings
        String[] tokens = temp.split(",");
        //Seperate all of the information taken in to feed it in to the character constructor
        String name = String.valueOf(tokens[0]);
        String isJedi = String.valueOf(tokens[1]);
        String isDroid = String.valueOf(tokens[2]);
        String isHumanLike = String.valueOf(tokens[3]);
        String isWookie = String.valueOf(tokens[4]);
        String isDarkSide = String.valueOf(tokens[5]);
        String isLightSide = String.valueOf(tokens[6]);
        String isBountyHunter = String.valueOf(tokens[7]);
        String isSmuggler = String.valueOf(tokens[8]);
        String 	kesselSpeed = String.valueOf(tokens[9]);
        String isEmpire = String.valueOf(tokens[10]);
        String isRebel = String.valueOf(tokens[11]);
        String isResistance = String.valueOf(tokens[12]);
        String isFirstOrder = String.valueOf(tokens[13]);
        String isSeparatist = String.valueOf(tokens[14]);
        String isGalacticRepublic = String.valueOf(tokens[15]);
        String isEwok = String.valueOf(tokens[16]);
        String	isFluffy = String.valueOf(tokens[17]);
        String isSlimey = String.valueOf(tokens[18]);
        String	lightSaberColor = String.valueOf(tokens[19]);
        String isTall = String.valueOf(tokens[20]);
        String isShort = String.valueOf(tokens[21]);
        String isPilot = String.valueOf(tokens[22]);
        String isAnnoying = String.valueOf(tokens[23]);
        String	isCute = String.valueOf(tokens[24]);
        String isBanderFav = String.valueOf(tokens[25]);
        String	isGotButtWhooped = String.valueOf(tokens[26]);
        String isInsideATauntaun = String.valueOf(tokens[27]);
        String isStillLiving = String.valueOf(tokens[28]);
        String	isLostALimb = String.valueOf(tokens[29]);
        String isSpaceBallsCharacter = String.valueOf(tokens[30]);
        
        //Use info brought in to create 50 characters and add them to chars ArrayList
        chars.add(new Character( name,  isJedi,  isDroid,  isHumanLike,	 isWookie,  isDarkSide,  isLightSide,  isBountyHunter,	 isSmuggler, 	kesselSpeed,  isEmpire,  isRebel,	 isResistance,	 isFirstOrder,  isSeparatist,  isGalacticRepublic, isEwok, 	isFluffy,  isSlimey, 	lightSaberColor,  isTall,  isShort,  isPilot,  isAnnoying, 	isCute,	 isBanderFav, 	isGotButtWhooped,  isInsideATauntaun,  isStillLiving,  isLostALimb,  isSpaceBallsCharacter));
        
        
        i++;
	    }
    } catch (Exception e) { System.out.println("Error reading or parsing file " + e); }
    
    System.out.println("CharacterList Ends");
  }

  /**
   * Returns the current list of childrens books in the library.
   * 
   * @return the ArrayList of characters
   */
   //Getter to be able to retrieve all of the characters in thier new 'constructed' form
  public static ArrayList<Character> getCharacters()
  {
    return chars;
  }
//remove if i wanted to remove a character(isnt used)
  public void remove(int index){
    chars.remove(index);
  }

}
