/**
Author: Aaron Dutta
Start Date: July 16th, 2024
Advanced Rock Paper Scissors
**/

//importing scanner object
import java.util.Scanner;

public class Main 
{
  /*
  printing menu and welcome message for the user to refer to the rules, scenarios, and user input instructions
  */
  public static void printMenu()
  {
    //print welcome message
    System.out.println("\nWelcome to Aaron's Advanced Rock Paper Scissors!\n");
    System.out.println("I am sure you have played regular rock paper scissors, but this version is surely new to you.\n");
    //print input options
    System.out.println("In this version, you can choose rock, paper, scissors, fire, air, or earth!\n");
    //print line to separate menu from other information (for aesthetics)
    System.out.println("---------------------------------------------------------------------------\n");
    
    //print scenarios for user guidance:
    System.out.println("Refer to the following for each interaction result: \n");
    //paper wins
    System.out.println("-\tPaper covers Rock");
    //rock wins
    System.out.println("-\tRock crushes Scissors");
    //scissors wins
    System.out.println("-\tScissors cuts Paper");
    //rock wins
    System.out.println("-\tRock puts out Fire");
    //air wins
    System.out.println("-\tAir erodes Rock");
    //neutral
    System.out.println("-\tRock blends with Earth");
    //fire wins
    System.out.println("-\tFire burns Paper");
    //paper wins
    System.out.println("-\tPaper floats on Air");
    //neutral
    System.out.println("-\tPaper lies on Earth");
    //fire wins
    System.out.println("-\tFire melts Scissors");
    //air wins
    System.out.println("-\tAir rusts Scissors");
    //scissors wins
    System.out.println("-\tScissors crack open Earth");
    //air wins
    System.out.println("-\tAir extinguishes Fire");
    //fire wins
    System.out.println("-\tFire scorches Earth");
    //Earth wins
    System.out.println("-\tEarth blocks Air\n");
    //print line to separate menu from other information (for aesthetics)
    System.out.println("---------------------------------------------------------------------------\n");
    //printing input instructions for user
    System.out.println("Please enter the word of your move in full form or enter the first letter of your move.\n");

    //rock defeated by 2 items
    //paper defeated by 2 items
    //scissors defeated by 3 items
    //fire defeated by 2 items
    //air defeated by 2 items
    //earth defeated by 2 items and neutral with 2 item
  }

  /*
  @param strArrmoves is the array of possible moves that the computer can choose from
  @return the computer's random choice of move
  */
  public static String getRandom(String [] strArrmoves)
  {
    //declaring string variable strCompmove
    String strCompmove;
    //declare int variable intIndexmove and assign it to random integer from 0 to 5
    int intIndexmove = (int)(Math.random()*6);
    //assign strCompmove to intIndexmove index of strArrmoves
    strCompmove = strArrmoves[intIndexmove];
    //print message containing strCompmove
    System.out.print("The computer chose " + strCompmove + "!\n");
    //return strCompmove
    return strCompmove;
  }

  /*
  @param strMove is the user's move
  @param strCompmove is the computer's random move
  @return the string that tells the outcome of the game
  */
  
  public static String getResult(String strMove, String strCompmove)
  {
    //declare string variable strResult and assign it to empty string
    String strResult = "";
    //if user chooses rock
    if(strMove.equalsIgnoreCase("rock") || strMove.equalsIgnoreCase("r"))
    {
      //if computer chooses rock
      if(strCompmove.equals("rock"))
      {
        //assign strResult to string containing outcome
        strResult = "Rock against " + strCompmove + " is a tie!";
      }
      //if computer chooses paper
      else if(strCompmove.equals("paper"))
      {
        //assign strResult to string containing outcome
        strResult = "Rock falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses scissors
      else if(strCompmove.equals("scissors"))
      {
        //assign strResult to string containing outcome
        strResult = "Rock beats " + strCompmove + "! You win!";
      }
        //if computer chooses fire
      else if(strCompmove.equals("fire"))
      {
        //assign strResult to string containing outcome
        strResult = "Rock beats " + strCompmove + "! You win!";
      }
        //if computer chooses air
      else if(strCompmove.equals("air"))
      {
        //assign strResult to string containing outcome
        strResult = "Rock falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses earth
      else if(strCompmove.equals("earth"))
      {
        //assign strResult to string containing outcome
        strResult = "Rock against " + strCompmove + " is a tie!";
      }
    }

    if(strMove.equalsIgnoreCase("paper") || strMove.equalsIgnoreCase("p"))
    {
      //if computer chooses rock
      if(strCompmove.equals("rock"))
      {
        //assign strResult to string containing outcome
        strResult = "Paper beats " + strCompmove + "! You win!";
      }
      //if computer chooses paper
      else if(strCompmove.equals("paper"))
      {
        //assign strResult to string containing outcome
        strResult = "Paper against " + strCompmove + " is a tie!";
      }
        //if computer chooses scissors
      else if(strCompmove.equals("scissors"))
      {
        //assign strResult to string containing outcome
        strResult = "Paper falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses fire
      else if(strCompmove.equals("fire"))
      {
        //assign strResult to string containing outcome
        strResult = "Paper falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses air
      else if(strCompmove.equals("air"))
      {
        //assign strResult to string containing outcome
        strResult = "Paper beats " + strCompmove + "! You win!";
      }
        //if computer chooses earth
      else if(strCompmove.equals("earth"))
      {
        //assign strResult to string containing outcome
        strResult = "Paper against " + strCompmove + " is a tie!";
      }
    }

    if(strMove.equalsIgnoreCase("scissors") || strMove.equalsIgnoreCase("s"))
    {
      //if computer chooses rock
      if(strCompmove.equals("rock"))
      {
        //assign strResult to string containing outcome
        strResult = "Scissors falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses paper
      else if(strCompmove.equals("paper"))
      {
        //assign strResult to string containing outcome
        strResult = "Scissors beats " + strCompmove + "! You win!";
      }
        //if computer chooses scissors
      else if(strCompmove.equals("scissors"))
      {
        //assign strResult to string containing outcome
        strResult = "Scissors against " + strCompmove + " is a tie!";
      }
        //if computer chooses fire
      else if(strCompmove.equals("fire"))
      {
        //assign strResult to string containing outcome
        strResult = "Scissors falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses air
      else if(strCompmove.equals("air"))
      {
        //assign strResult to string containing outcome
        strResult = "Scissors falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses earth
      else if(strCompmove.equals("earth"))
      {
        //assign strResult to string containing outcome
        strResult = "Scissors beats " + strCompmove + "! You win!";
      }
    }

    if(strMove.equalsIgnoreCase("fire") || strMove.equalsIgnoreCase("f"))
    {
      //if computer chooses rock
      if(strCompmove.equals("rock"))
      {
        //assign strResult to string containing outcome
        strResult = "Fire falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses paper
      else if(strCompmove.equals("paper"))
      {
        //assign strResult to string containing outcome
        strResult = "Fire beats " + strCompmove + "! You win!";
      }
        //if computer chooses scissors
      else if(strCompmove.equals("scissors"))
      {
        //assign strResult to string containing outcome
        strResult = "Fire beats " + strCompmove + "! You win!";
      }
        //if computer chooses fire
      else if(strCompmove.equals("fire"))
      {
        //assign strResult to string containing outcome
        strResult = "Fire against " + strCompmove + " is a tie!";
      }
        //if computer chooses air
      else if(strCompmove.equals("air"))
      {
        //assign strResult to string containing outcome
        strResult = "Fire falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses earth
      else if(strCompmove.equals("earth"))
      {
        //assign strResult to string containing outcome
        strResult = "Fire beats " + strCompmove + "! You win!";
      }
    }

    if(strMove.equalsIgnoreCase("air") || strMove.equalsIgnoreCase("a"))
    
    {
      //if computer chooses rock
      if(strCompmove.equals("rock"))
      {
        //assign strResult to string containing outcome
        strResult = "Air beats " + strCompmove + "! You win!";
      }
        //if computer chooses paper
      else if(strCompmove.equals("paper"))
      {
        //assign strResult to string containing outcome
        strResult = "Air falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses scissors
      else if(strCompmove.equals("scissors"))
      {
        //assign strResult to string containing outcome
        strResult = "Air beats " + strCompmove + "! You win!";
      }
        //if computer chooses fire
      else if(strCompmove.equals("fire"))
      {
        //assign strResult to string containing outcome
        strResult = "Air beats " + strCompmove + "! You win!";
      }
        //if computer chooses air
      else if(strCompmove.equals("air"))
      {
        //assign strResult to string containing outcome
        strResult = "Air against " + strCompmove + " is a tie!";
      }
        //if computer chooses earth
      else if(strCompmove.equals("earth"))
      {
        //assign strResult to string containing outcome
        strResult = "Air falls to " + strCompmove + "! You lose!";
      }
    }

    if(strMove.equalsIgnoreCase("earth") || strMove.equalsIgnoreCase("e"))
    {
      //if computer chooses rock
      if(strCompmove.equals("rock"))
      {
        //assign strResult to string containing outcome
        strResult = "Earth against " + strCompmove + " is a tie!";
      }
        //if computer chooses paper
      else if(strCompmove.equals("paper"))
      {
        //assign strResult to string containing outcome
        strResult = "Earth against " + strCompmove + " is a tie!";
      }
        //if computer chooses scissors
      else if(strCompmove.equals("scissors"))
      {
        //assign strResult to string containing outcome
        strResult = "Earth falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses fire
      else if(strCompmove.equals("fire"))
      {
        //assign strResult to string containing outcome
        strResult = "Earth falls to " + strCompmove + "! You lose!";
      }
        //if computer chooses air
      else if(strCompmove.equals("air"))
      {
        //assign strResult to string containing outcome
        strResult = "Earth beats " + strCompmove + "! You win!";
      }
        //if computer chooses earth
      else if(strCompmove.equals("earth"))
      {
        //assign strResult to string containing outcome
        strResult = "Earth against " + strCompmove + " is a tie!";
      }
    }
    return strResult;
  }

  public static void main(String[] args) 
  {
    //declare scanner object
    Scanner input = new Scanner(System.in);
    //declare integer variable intWincount and assign it to a value of zero
    int intWincount = 0;
    //call the printMenu() method
    printMenu();
    //declare string array strArrmoves and assign it to the array of possible moves
    String [] strArrmoves = {"rock", "paper", "scissors", "fire", "air", "earth"};
    //while user does not have 3 wins yet
    while(intWincount < 3)
    {
      //declare string variable strMove
      String strMove;
      //declare string variable strResult
      String strResult;
      //print exit rule message
      System.out.println("\nBefore exiting, you must win 3 games.\n");
      //prompt user for their move
      System.out.print("\nEnter your move: ");
      //assign strMove to user input and read strMove
      strMove = input.next();
      //call getRandom method with strArrmoves and assign it to string variable strCompmove
      String strCompmove = getRandom(strArrmoves);
      //call getResult(strMove, strCompmove) and assign it to strResult
      strResult = getResult(strMove, strCompmove);
      //Print strResult
      System.out.println("\n" + strResult);
      //if user wins a game
      if (strResult.contains("! You win!"))
        {
          //add 1 to intWincount
          intWincount++;
        }
        //if user has 3 wins
        if (intWincount == 3)
        {
          //print congrats message
          System.out.println("\nCongratulations! You've won 3 games!");
        }
    }
  }
}