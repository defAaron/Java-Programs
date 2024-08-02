/*
Author: Aaron Dutta
Start Date: July 22, 2024
Aaron's Battleship Game
*/


//import scanner object
import java.util.Scanner;

public class Main 
{

  //method to print the intro message and the rules of the game, as well as the instructions for input
  public static void printIntro()
  {
    //declare scanner object
    Scanner input = new Scanner(System.in);
    //declare string variable strUserplay
    String strUserplay;
    //print welcome message
    System.out.println("Welcome to Aaron’s Battleship Game!\n");
    //print that program is based off of board game
    System.out.println("This program is meant to resemble the original board game.\n");
    //prompt user if they have played battleship before
    System.out.print("Have you played battleship before (yes/no): ");
    //assign strUserplay to user input and read input
    strUserplay = input.next();
    //if user enters yes
    if(strUserplay.equalsIgnoreCase("yes"))
    {
      //print that computer understands they know how to play
      System.out.println("\nVery well then! Looks like you already know the rules then.");
    }
    //if user enters no
    if(strUserplay.equalsIgnoreCase("no"))
    {
      //print that the rules will be printed
      System.out.println("\nWell then, I’ll show you the rules!");
      //print the different types of ships and the numbers
      System.out.println("\nYou have three different types of ships: the cruisers with 3 coordinates, the submarines with 3 coordinates, and the biggest of them all: the carriers with 5 coordinates!");
      //print how the user will be prompted
      System.out.println("\nYou will be prompted for the coordinates of those ships respectively.");
      //print size of grid and that computer also has it
      System.out.println("\nThe computer also has those ships that will be placed randomly on a 5x5 coordinate grid.");
      //print how to win
      System.out.println("\nTo win, you must guess the coordinates of all the ships! When you guess a coordinate right, it means you have hit their ship. Otherwise, you miss and your missile lands in the water.");
      //print that coordinate input guide will be printed
      System.out.println("\n\nNow that you are familiar with the rules, let’s learn how to input our coordinates!");
      //print line for aesthetics 
      System.out.println("-------------------------------------------------------------------------------------");
  }

    //if user enters something other than yes and no
    if(!strUserplay.equals("yes") && !strUserplay.equals("no"))
      {
        //print that instructions will not be printed
        System.out.println("\nI do not understand that, so I won't print the instructions for you!\n");
      }

    //print input instructions
    System.out.println("\nYou will be inputting your coordinates in the form of a letter followed by a number.");
    //print what letter and number means
    System.out.println("\nThe letter will be the row of your move and the number will be the column.");
    //print example
    System.out.println("\nFor example, if I wanted to launch a missile at the coordinate in the very center, I would enter “c3”.");
    //print visual of board
    System.out.println("\nFor visual aid, here is a representation of the board:");
    System.out.println("\n         1       2       3       4       5");
    System.out.println("         |       |       |       |       |");
    System.out.println("a -------+-------+-------+-------+-------+----");
    System.out.println("         |       |       |       |       |");
    System.out.println("b -------+-------+-------+-------+-------+----");
    System.out.println("         |       |       |       |       |");
    System.out.println("c -------+-------+-------+-------+-------+----");
    System.out.println("         |       |       |       |       |");
    System.out.println("d -------+-------+-------+-------+-------+----");
    System.out.println("         |       |       |       |       |");
    System.out.println("e -------+-------+-------+-------+-------+----");
    System.out.println("         |       |       |       |       |");
  }
  
  /* method to print message for asking player to enter coordinates
  @param input is the user input when they are prompted for their ship coordinates
  @param strArrplboard is the player's board
  @return nothing as this method is a void method
  */
  
  public static void getPlayerships(Scanner input, String[] strArrplboard) 
  {
    //prompt user to enter coordinates for their cruisers
    System.out.println("\n\nEnter your coordinates for your cruisers:\n");
    //call the getCords() method to get coordinates for the cruisers (3 cells)
    getCords(input, strArrplboard, 3); 
    //prompt user to enter coordinates for their submarines
    System.out.println("\nEnter your coordinates for your submarines:\n");
    //call the getCords() method to get submarines for the cruisers (3 cells)
    getCords(input, strArrplboard, 3); 
    //prompt user to enter coordinates for their carriers
    System.out.println("\nEnter your coordinates for your carriers:\n");
    //call the getCords() method to get coordinates for the carriers (5 cells)
    getCords(input, strArrplboard, 5); 
  }

  /* method to get computer's random ship placement
  @param strArrcmpship is the computer's ship placement
  @return nothing as this method is a void method
  */
  public static void getCompplace(String [] strArrcmpship)
  {
    //place 3 cells for cruisers
    getCompcord(strArrcmpship, 3);
    //place 3 cells for submarines
    getCompcord(strArrcmpship, 3);
    //place 3 cells for carriers
    getCompcord(strArrcmpship, 5);
  }

  /*
  @param strArrboard is the general board
  @param intSize is the size of the ship that will be placed
  @return nothing as this method is a void method
  */
  public static void getCompcord(String [] strArrboard, int intSize)
  {
    //declare boolean variable isPlace to check if the ship placement is ok or not
    boolean isPlace = false;
    //loop until the placement is ok
    while(!isPlace)
    {
      //declare integer variable intStart and set it to a random number from 0 to 24
      int intStart = (int)(Math.random() * 25);
      //declare boolean variable isHorizontal to randomly decide if ship is placde horizontal or vertical
      boolean isHorizontal = Math.random() < 0.5;
      //if it is placed horizontal
      if(isHorizontal)
      {
        //check if the ship fits within 5 cells
        if((intStart % 5) + intSize <= 5)
        {
          //place the ship on the board horizontally
          for(int i = 0; i < intSize; i++)
          {
            //mark it as S for ship
            strArrboard[intStart + i] = "S";
          }
          //set isPlace to true because the placement is ok
          isPlace = true;
        }
      }
      //if it is placed vertical
      else
      {
        //check if the ship fits within 5 cells
        if(intStart / 5 + intSize <= 5)
        {
          //place the ship on the board vertically
          for(int i = 0; i < intSize; i++)
          {
            //mark it as S for ship
            strArrboard[intStart + 5 * i] = "S";
          }
          //set isPlace to true because the placement is ok
          isPlace = true;
        }
      }
    }
  }

  /* method to set the initial board to cells that have no ships
  @param strArrboard is the board
  @return nothing as method is void method
  */
  public static void getInitialboard(String [] strArrboard)
  {
    //loop until i is less than 25 (0 to 24 so 25 times total) adding i by 1 each time
    for(int i = 0; i < strArrboard.length; i++)
    {
      //add a dot for each spot
      strArrboard[i] = ".";
    }
  }

  /* method to get ship coordinates from the user
  @param input is the user input when prompted for their coordinate
  @param strArrplboard is the player's board
  @param intSize is the size of the ship that will be placed
  */
  public static void getCords(Scanner input, String [] strArrplboard, int intSize)
  {
    //loop until i is less than the size of the ship (0 to intSize - 1 so intSize times) adding i by 1 each time
    for(int i = 0; i < intSize; i++)
    {
      //declare boolean variable isValid and assign it to false
      boolean isValid = false;
      
      //loop until the valid input is entered
      while(!isValid)
      {
        //prompt user to enter coordinate
        System.out.print("Enter coordinate " + (i + 1) + ": ");
        //declare string variable strCord and assign it to user input and read it
        String strCord = input.next();
        //declare integer variable intIndex, call the parseCord method
        int intIndex = parseCord(strCord);
        
        //if coordinate is invalid
        if(intIndex == -1)
        {
          //prompt user again for user input
          continue; 
        }

        //if the cell is empty
        if(strArrplboard[intIndex].equals("."))
        {
          //mark the cell with S for ship
          strArrplboard[intIndex] = "S";
          //set isValid to true 
          isValid = true;
        }

        //if the cell has already been chosen
        else
        {
          //print message asking user to re-enter their coordinate
          System.out.println("\nYou have already chosen this coordinate. Please choose another one.\n");
        }
      }
    }
  }

  /*
  @param strCord is the user's input from entering coordinates
  @return -1 if user input is not valid, return the index value of the coordinate
  */
  public static int parseCord(String strCord) 
  {
      // Check if the coordinate length is exactly 2 characters
      if (strCord.length() != 2) 
      {
        //print message saying coordinate must be 2 characters long
        System.out.println("\nCoordinate must be 2 characters long.\n");
        // return -1 that symbolizes error
        return -1; 
      }

      //declare string variable strRow and strCol and extract the row and column as strings
      String strRow = strCord.substring(0, 1);
      String strCol = strCord.substring(1, 2);

      //declare integer variable intRow
      int intRow;

      //if user's coordinate has row a  
      if (strRow.equals("a")) 
      {
        //assign 0 to intRow
        intRow = 0;
      } 
        
      //if user's coordinate has row b
      else if (strRow.equals("b")) 
      {
        //assign 1 to intRow
        intRow = 1;
      } 

      //if user's coordinate has row c
      else if (strRow.equals("c")) 
      {
        //assign 2 to intRow
        intRow = 2;
      } 

      //if user's coordinate has row d
      else if (strRow.equals("d")) 
      {
        //assign 3 to intRow
        intRow = 3;
      } 

      //if user's coordinate has row e
      else if (strRow.equals("e")) 
      {
        //assign 4 to intRow
        intRow = 4;
      } 

      //if user's coordinate has invalid row
      else 
      {
        //print message saying coordinate is not on the 5x5 plane
        System.out.println("\nCoordinate is not on the given plane.\n");
        //return -1 symbolizing error
        return -1; 
      }

      // Convert column string to integer index
      int intCol;

      //if user's coordinate has column 1
      if (strCol.equals("1")) 
      {
        //assign 0 to intCol
        intCol = 0;
      } 
        
      //if user's coordinate has column 2
      else if (strCol.equals("2")) 
      {
        //assign 1 to intCol
        intCol = 1;
      } 
        
      //if user's coordinate has column 3
      else if (strCol.equals("3")) 
      {
        //assign 2 to intCol
        intCol = 2;
      } 
        
      //if user's coordinate has column 4
      else if (strCol.equals("4")) 
      {
        //assign 3 to intCol
        intCol = 3;
      } 
        
      //if user's coordinate has column 5
      else if (strCol.equals("5")) 
      {
        //assign 4 to intCol
        intCol = 4;
      } 
        
      //if user's coordinate has invalid column
      else 
      {
        //print message saying coordinate is not on the 5x5 plane
        System.out.println("\nCoordinate is not on the given plane.\n");
        //return -1 symbolizing error
        return -1; 
      }

      //return the index of the coordinate: for example if coordinate is c3 --> c is row index 2, 3 is column index 2, so 2 * 5 + 2 = 12 which should be the 12th index of the board array
      return intRow * 5 + intCol;
  }

  
  /* method for printing the updated board at every stage
  @param strArrboard is the general board
  @return nothing since it is a void method
  */
  public static void getBoard(String [] strArrboard)
  {
    //print column numbers
    System.out.println("\t   1   2   3   4   5");
    //loop for each row (5 rows)
    for (int i = 0; i < 5; i++) 
    {
      //print space to separate rows
      System.out.print("    ");
      //loop for each column (5 columns)
      for (int j = 0; j < 5; j++)
      {
        //print the cell value
        System.out.print("   " + strArrboard[i * 5 + j]); 
      }
      //print an empty line after each row is finished printing
      System.out.println();
    }
  }

  /*method for converting the board index to a string for coordinate
  @param intIndex is an index of a board
  @return the concatenation of the coordinate row and column as a string
  */
  public static String cordString(int intIndex) 
  {
      //declare integer variables intRow and intCol and calculate row and column from index
      int intRow = intIndex / 5;
      int intCol = intIndex % 5;

      //declare string variable strRow
      String strRow;

      //if coordinate lies in first row
      if (intRow == 0) 
      {
        //assign strRow a value of a
        strRow = "a";
      } 

      //if coordinate lies in second row
      else if (intRow == 1) 
      {
        //assign strRow a value of b
        strRow = "b";
      } 

      //if coordinate lies in third row
      else if (intRow == 2) 
      {
        //assign strRow a value of c
        strRow = "c";
      } 

      //if coordinate lies in fourth row
      else if (intRow == 3) 
      {
        //assign strRow a value of d
        strRow = "d";
      } 

      //if coordinate lies in fifth row
      else if (intRow == 4) 
      {
        //assign strRow a value of e
        strRow = "e";
      } 

      //if coordinate lies in invalid row
      else 
      {
        //strRow is assigned to empty value
        strRow = ""; 
      }

      //declare string variable strCol
      String strCol;

      //if intCol is between 0 and 4 inclusive
      if (intCol >= 0 && intCol < 5) 
      {
        //assign strCol to the string equivalent of intCol + 1
        strCol = Integer.toString(intCol + 1);
      } 

      //if intCol lies outside of 0 to 4
      else 
      {
        //strCol is assigned to empty value
        strCol = ""; 
      }
      //return the concatenation of strRow and strCol
      return strRow + strCol;
  }

  /* method to display the statistics at the end of the game
  @param intHits is the number of hits the user gets
  @param intTotal is the total number of moves the user makes
  @return nothing because method is a void method
  */
  public static void printStatistics(int intHits, int intTotal)
  {
    //print line for aesthetics
    System.out.println("------------------------------------------");
    //print header row of chart with titles for hits, misses, and total moves
    System.out.println("Hits\t | \tMisses\t | \tTotal moves");
    //print line for aesthetics
    System.out.println("------------------------------------------");
    //print row containing hits, misses, and total moves
    System.out.println(intHits + "    \t | \t" + (intTotal - intHits) + "    \t | \t" + intTotal); 
  }

  public static void main(String[] args) 
  {
    //declare scanner object
    Scanner input = new Scanner(System.in);
    //call the printIntro() method
    printIntro();
    //declare string array strArrplboard with 25 elements
    String [] strArrplboard = new String [25];
    //declare string array strArrcmpboard with 25 elements
    String [] strArrcmpboard = new String [25];
    //declare string array strArrcmpship with 25 elements
    String [] strArrcmpship = new String [25];
    //call getInitialboard for strArrplboard
    getInitialboard(strArrplboard);
    //call getInitialboard for strArrcmpboard
    getInitialboard(strArrcmpboard);
    //call getInitialboard for strArrcmpship
    getInitialboard(strArrcmpship);
    //call getPlayerships() method for the user input and strArrplboard
    getPlayerships(input, strArrplboard);
    //call the getCompplace method for strArrcmpship
    getCompplace(strArrcmpship);
    //declare boolean variable isGame and assign it to value of false
    boolean isGame = false;
    //declare integer variable intPlayhits and assign it to value of 0 to record hits by player
    int intPlayhits = 0;
    //declare integer variable intCmphits and assign it to value of 0 to record hits by computer
    int intCmphits = 0;
    //declare integer variable intTotal and assign it to value of 0 to record total moves by player
    int intTotal = 0;
    
    //while the game does not end
    while(!isGame)
    {
      //call getBoard() method for strArrplboard, printing the board
      getBoard(strArrplboard);
      //declare boolean variable isValidinput and assign it to value of false
      boolean isValidinput = false;
      //loop until user enters a valid move
      while(!isValidinput)
      {
        //prompt user to make a move
        System.out.print("\nPlease enter a coordinate to make a move: ");
        //declare string variable strMove and assign it to user input and read it
        String strMove = input.next();
        //try the following function
        try
        {
          //declare integer variable intIndex, call parseCord() method for strMove and assign it
          int intIndex = parseCord(strMove);
          //check if user hits a ship
          if(strArrcmpship[intIndex].equals("S"))
          {
            //print message saying user hits ship
            System.out.println("\nYour move was a hit!\n");
            //replace the hit coordinate with H symbolizing a hit
            strArrcmpboard[intIndex] = "H";
            //add 1 to intPlayhits counter
            intPlayhits++;
          }

          //if user does not hit a ship
          else
          {
            //print message saying user misses
            System.out.println("\nYour move was a miss!\n");
            //replace the missed coordinate with M symbolizing a miss
            strArrcmpboard[intIndex] = "M";
          }
          //add 1 to intTotal counter
          intTotal++;
          //assign isValidinput to true
          isValidinput = true;
          //if user hits all 11 coordinates of computer ships
          if(intPlayhits == 11)
          {
            //print congrats message
            System.out.println("\nCongrats! You have successfully sunk all of the computer’s ships!\n");
            //assign isGame to true because game has ended
            isGame = true;
            //terminate the loop
            break;
          }
          //declare boolean variable isValidmove and assign it to value of false
          boolean isValidmove = false;
          
          //loop until computer decides a valid move
          while (!isValidmove) 
          {
            //declare integer variable compIndex and assign it to random itneger from 0 to 24
            int compIndex = (int)(Math.random() * 25); 
              //check if the position is not already hit or missed
              if (!strArrplboard[compIndex].equals("H") && !strArrplboard[compIndex].equals("M")) 
              {
                  //if the computer move is a hit
                  if (strArrplboard[compIndex].equals("S")) 
                  {
                    //print message saying computer hit user's ship
                    System.out.println("Computer's move was a hit at " + cordString(compIndex) + "!\n");
                    //replace the hit coordinate with an H symbolizing hit
                    strArrplboard[compIndex] = "H"; 
                    //add one to intCmphits
                    intCmphits++; 
                  } 
                  //if computer misses
                  else 
                  {
                    //print message saying computer missed
                    System.out.println("Computer's move was a miss at " + cordString(compIndex) + ".\n");
                    //replace the missed coordinate with an M symbolizing miss
                    strArrplboard[compIndex] = "M"; 
                  }
                  //assign isValidmove a value of true, exiting the loop
                  isValidmove = true; 
              }
          }
          //if computer hits all of user's ships
          if(intCmphits == 11)
          {
            //print message saying user lost
            System.out.println("\nThe computer sunk all of your ships. You lose!\n");
            //assign isGame a value of true to end the game
            isGame = true;
          }
      }
      //if the user enters an invalid coordiante, catching exception
      catch (Exception e)
      {
        //print message telling user to re-enter their coordinate
        System.out.println("Invalid coordinate format! Please enter a coordinate in the form of a letter from a to e followed by a number from 1 to 5.\n");
      }
    }
  }

    //call the printStatistics() method for intPlayhits and intTotal
    printStatistics(intPlayhits, intTotal);

    //print thank you message
    System.out.println("\nThanks for playing Aaron’s Battleship Game! Hope you had fun 😀"); 
  }
}
