
//Import needed tools
import java.util.ArrayList;
import java.util.Scanner;



public class GuessWho{

  //Intitialize array of questions that the computer can read in
  static String[] questions = {"Is their name [insert name]?","Are they Jedi?","Are they a droid?","Are they humanoid?","Are they a wookie?","Are they Dark?","Are they Light?","Are they a bounty hunter?","Are they a smuggler?","Are they Empire?","Are they a rebel?","Are they resitence?","Are they separatist?","Are they republic?","Are they fluffy?","Are they slimey?","Are they tall?","Are they short?","Are they a pilot?","Are they cute?","Are they Bander's favorite?","Are they whooped?","Are they inside tauntaun?","Are they alive?","Have they lost a limb?","Are they in Space Balls?","Do they have a light saber?"};
  //Ceate a new arrayList to act as the board item and can be changed
  static ArrayList<String> boardNames1 = new ArrayList<String>(); 
  //Create a new characterList object
  static CharacterList characters = new CharacterList();  
  //Set a character arrayList full of the character objects inside of the character list object
  static ArrayList<Character> characterList = characters.getCharacters(); 
  //Select a random character from the characterList
  static Character randChar = RandomPermutation.getRandomElement(characterList);
  static Scanner sc = new Scanner(System.in);
  //the index of the question grabed by the computer in single player
  static int botIn = 1;
  //Get a random integer see how many question the bot will ask before he gets it
  static int[] rand = RandomPermutation.next(15);
  //just what i use when I make the user hit enter to continue
  static String enter;


  public static void main(String[] arg){

  
    

    System.out.println();

    
    
    
    
    int num = 0;
    //loop to add all the character object names to the board arrayList
    for(Character c: characterList){
      boardNames1.add(c.getName());

     // System.out.println(c.getName());
      num++;
    }
    System.out.println("Welcome to guess who starwars edition!!!");

    

    
  // Set the game mode
   System.out.println("\nDo you want single player or 2 player(enter 1 or 2)\n");
    int mode = sc.nextInt();
    
    //condition telling what to do if the mode is 2 player or single player
    if (mode == 2 ){


    System.out.println("DIRECTIONS:\nFirst, player 1 will go through and guess a random character that player 2 will know and then player 2 will go through and guess a random character that player 1 will know and the person at the end with the lowest amount of guesses wins!!\n For a list of *recommended* questions type in 'help' when playing\n\n");
    System.out.println("ATTENTION: Player 2 must now be the only one looking at the screen and hit enter to see the character player 1 will be guessing \n");
    //THIS IS UNNECESSARY BUT I WANTED IT TO HELP THE USER FOLLOW THE PRINT OUT A BIT BETTER. THEY JUST HIT ENTER TO CONTINUE ON
    enter = sc.nextLine();
    enter = sc.nextLine();
    //Sets the random charcter the player 1 will be trying to guess
    randChar = RandomPermutation.getRandomElement(characterList);
    System.out.println("\nOK player 2 the character is "+randChar.getName()+". Now hit enter and give the computer back to player 1.");
    enter = sc.nextLine();
    enter = sc.nextLine();
    //Move the name of the character off screen
    for (int i = 0;i<=50;i++){
      System.out.println();
    }
    System.out.println("Alright player 1 it's time to start guessing.\n For a list of *recommended* questions type in 'help' when playing\n\n");
    //Now it will run the function to get the user to guess the character and return how many guesses it took
    int p1guess = questionInput(2);
    System.out.println("P1's guesses: "+p1guess+"\n  It is now player 2's turn");
    //resets the board names
    for(int i = 0; i<boardNames1.size(); i++){
      boardNames1.set(i,characterList.get(i).getName());
    }
    System.out.println("\nATTENTION: Player 1 must now be the only one looking at the screen and hit enter to see the character player 2 will be guessing \n");
    enter = sc.nextLine();
    enter = sc.nextLine();
    randChar = RandomPermutation.getRandomElement(characterList);
    System.out.println("\nOK player 1 the character is "+randChar.getName()+". Now hit enter and give the computer back to player 2.");
    for (int i = 0;i<=50;i++){
      System.out.println();
    }
    System.out.println("Alright player 2 it's time to start guessing.\n For a list of *recommended* questions type in 'help' when playing\n\n");
    //Conditional to compare the guess taken by each and tell them who won
    int p2guess = questionInput(2);
    System.out.println("P2's guesses: "+p2guess);
    if (p1guess<p2guess){
      System.out.println("P1 wins!!!");
    }
    else if(p2guess<p1guess){
      System.out.println("P2 wins!!!");
    }
    else{
      System.out.println("Wow it was a tie!\nThank you for play this game beta");
    }
    }
    //This else tells what to do if the mode is single player(has a lot of the same code as pvp)
    else
    {
    System.out.println("DIRECTIONS:\nFirst, player 1 will go through and guess a character selected by the computer and then the computer will go through and guess a random character that player 1 will know and the one at the end with the lowest amount of guesses wins!!\nHit enter when youre ready to begin\n\n");
    enter = sc.nextLine();
    enter = sc.nextLine();
    //get a random character
    randChar = RandomPermutation.getRandomElement(characterList);
    
    for (int i = 0;i<=10;i++){
      System.out.println();
    }
    System.out.println("Alright player 1 it's time to start guessing.\n For a list of *recommended* questions type in 'help' when playing\n\n");
    int p1guess = questionInput(2);
    System.out.println("P1's guesses: "+p1guess+"\n  It is now the computer's turn");
    System.out.println("\nOK. hit enter when you're ready for the computer to start guessing\nThe charcater the computer will be trying to guess is "+randChar.getName());
    enter = sc.nextLine();
    enter = sc.nextLine();
    //compare user and bot scores and tell who won
    int p2guess = questionInput(1);
    System.out.println("Computer's guesses: "+p2guess);
    if (p1guess<p2guess){
      System.out.println("P1 wins!!!");
    }
    else if(p2guess<p1guess){
      System.out.println("Computer wins!!!");
    }
    else{
      System.out.println("Wow it was a tie!\nThank you for play this game beta");
    }
    }
}

  

  public static int questionInput(int mode){
    //Intitialize the question string
    String q = "";
    //mode 2 basically means means to look for player input rather than a bot
    if (mode == 2){
    //System.out.println(boardNames1+"\n");
    q = sc.nextLine();
    
    }
    //this part of the conditional is triggered if the mode is 1, and basically just says to as random questions until it feels like it can guess
    else{
      if (botIn!=rand[5]+1){
      q = questions[botIn];
      }
      else{
        System.out.println(botIn+" : "+rand[1]+1);
      q = "Is their name "+randChar.getName()+"?";
      }
    }
    //Intitialize the number of guesses taken
    int guess1 = 0;
    //start loop(exit with quit)
    while(!q.equals("quit")){
      //Conditional check if you try to guess the character name and give you feedback
      if (q.equals("Is their name "+randChar.getName()+"?")){
        for(int i = 0; i<boardNames1.size(); i++){
          if(!boardNames1.get(i).equals(randChar.getName())){
            boardNames1.set(i,"------");
            if (mode == 1){
              System.out.println("The computer asked if thier name was "+randChar.getName()+"\n is this true?\n");
              String answer0 = sc.nextLine();
            }
            System.out.println("Nice job you got it.");
            q="quit";
            guess1++;
            return guess1;
            
          }
        }
        
      }
      else{
        System.out.println("\nThat is not who it is. Sorry :(\n");
      }

      
      // if help is entered then list the possible questions that could be asked
      if (q.equals("help")){
        System.out.println("\n Some possible questions are:\n"+java.util.Arrays.toString(questions));
      }




      //The follow loops on use this same logic except kessel and saber which will have their own comments
      /*
      Check to see if they enter an answerable question
      if so then check the property assciated with that question
      and return a yes or a no result depending on if that property is true or false
      Then go through the name board and mark out all the characters that have the opposite of the selected character
      */
//-----------------------------------------------
      else if (q.equals("Are they Jedi?")){
          if(randChar.getIsJedi() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsJedi()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are Jedi\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsJedi()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not Jedi\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they a droid?")){
          if(randChar.getIsDroid() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsDroid()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are a droid\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsDroid()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not a droid\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they humanoid?")){
          if(randChar.getIsHumanLike() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsHumanLike()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are humanoid\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsHumanLike()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not humanoid\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they a wookie?")){
          if(randChar.getIsWookie() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsWookie()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are Wookie\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsWookie()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not Wookie\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they Dark?")){
          if(randChar.getIsDarkSide() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsDarkSide()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are Dark\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsDarkSide()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not Dark\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they Light?")){
          if(randChar.getIsLightSide() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsLightSide()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are Light \n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsLightSide()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not Light\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they a bounty hunter?")){
          if(randChar.getIsBountyHunter() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsBountyHunter()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are a Bounty Hunter\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsBountyHunter()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not bounty hunter\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they a smuggler?")){
          if(randChar.getIsSmuggler() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSmuggler()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are smuggler\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSmuggler()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not smuggler\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they Empire?")){
          if(randChar.getIsEmpire() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsEmpire()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are Empire\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsEmpire()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not Empire\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they a rebel?")){
          if(randChar.getIsRebel() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsRebel()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are rebel\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsRebel()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not rebel\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they resitence?")){
          if(randChar.getIsResistence() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsResistence()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are resistence\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsResistence()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not resistence\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they separatist?")){
          if(randChar.getIsSeparatist() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSeparatist()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are separatist\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSeparatist()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not separatist\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they republic?")){
          if(randChar.getIsGR() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsGR()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are republic\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsGR()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not republic\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they fluffy?")){
          if(randChar.getIsFluffy() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsFluffy()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are fluffy\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsFluffy()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not fluffy\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they slimey?")){
          if(randChar.getIsSlimey() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSlimey()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are slimey\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSlimey()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not slimey\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they tall?")){
          if(randChar.getIsTall() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsTall()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are tall\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsTall()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not tall\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they short?")){
          if(randChar.getIsShort() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsShort()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are Jedi\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsShort()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not short\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they a pilot?")){
          if(randChar.getIsPilot() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsPilot()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are pilot\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsPilot()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not pilot\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they cute?")){
          if(randChar.getIsCute() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsCute()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are cute\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsCute()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not cute\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they Bander's favorite?")){
          if(randChar.getIsBF() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsBF()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are his fav\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsBF()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not his fav\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they whooped?")){
          if(randChar.getIsGBW() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsGBW()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they got whooped\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsGBW()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not whooped\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they inside tauntaun?")){
          if(randChar.getIsIAT() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsIAT()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsIAT()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not\n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they alive?")){
          if(randChar.getIsStillLiving() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsStillLiving()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are alive\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsStillLiving()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not aliven\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Have they lost a limb?")){
          if(randChar.getIsLostALimb() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsLostALimb()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they have\n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsLostALimb()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they have not \n\n");
        }
      }
//------------------------------------------------
//-----------------------------------------------
      else if (q.equals("Are they in Space Balls?")){
          if(randChar.getIsSBC() == true){
            for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSBC()==false){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("Yes they are \n\n");
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getIsSBC()==true){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they are not \n\n");
        }
      }
//-----------------------------------------------
//-----------------------------------------------

      else if (q.equals("Do they have a light saber?")){
          if(!randChar.getLSC().equals("0")){
            System.out.println("Yes they have a "+randChar.getLSC()+" saber");
            for (int i = 0; i<characterList.size(); i++){
              if((characterList.get(i)).getLSC().equals("0")){
                boardNames1.set(i,"------");
              }
            }
            
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(!characterList.get(i).getLSC().equals("0")){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they do not \n\n");
        }
      }
//-----------------------------------------------

/*
Kessel and saber follow similar logic to other but now it just checks to see if they have a kessel speed or saber color and if so it tells the user what it is, if not then say no
*/
//-----------------------------------------------

      else if (q.equals("Did they do the kessel run")){
          if(randChar.getKesselSpeed()!=0){
            System.out.println("Yes their kessel speed is "+randChar.getKesselSpeed()+"!");
            for (int i = 0; i<characterList.size(); i++){
              if((characterList.get(i)).getKesselSpeed()==0){
                boardNames1.set(i,"------");
              }
            }
            
          }
        else{
          for (int i = 0; i<characterList.size(); i++){
              if(characterList.get(i).getKesselSpeed()!=0){
                boardNames1.set(i,"------");
              }
            }
            System.out.println("No they do not \n\n");
        }
      }
//-----------------------------------------------
      //after a question is asked add to guesses
      guess1++;
      //Let the user answer the question asked with yes or no(conditional also changes output based on the mode)
      if (mode != 2 && q!="help"){
        System.out.println("The computer has asked "+q+"\nIs this true (Yes or No)");
        String answer = sc.nextLine();
        //System.out.println("\nAlright as another question\n");
        System.out.println("\nPossible chararcters left:\n"+boardNames1+"\n");
        
        
      }
      else if (mode==2 && q!="help"){
        System.out.println("They asked "+q+"\nIs this true (Yes or No)");
        String answer = sc.nextLine();
        System.out.println("\nAlright as another question\n");
        System.out.println("\nPossible chararcters left:\n"+boardNames1+"\n");
        
        
      }

      
      
      //if mode is 2(player input) then expect a new question input, if mode is 1(computer) then asks questions selected from the questions array question
      if (mode == 2){
    //System.out.println(boardNames1+"\n");
    q = sc.nextLine();
    
    }
    else{
      if (botIn==rand[1]+1){
      q = questions[botIn];
      }
      else{
      System.out.println(botIn+" : "+rand[1]+1);
      q = "Is their name "+randChar.getName()+"?";
      }
    }
    //bot index so it asks new questions
    botIn++;
    
    }
    //return how many guesses were taken
    return guess1;
}
}





