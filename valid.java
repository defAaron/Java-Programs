/*
Author: Aaron Dutta
Start Date: July 18th, 2024
Validating Data Software
*/

//importing scanner object
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    //declaring scanner object
    Scanner input = new Scanner(System.in);
    //declaring boolean isValid and assigning it to true
    boolean isValid = true;
    //declaring string variable strInput
    String strInput;
    //declaring integer variable intInput
    int intInput;

    //stage 1
    while(isValid = true)
    {
      //prompt user to enter string for stage 1
      System.out.print("Stage 1: Please enter a string that is greater than 6 characters long: ");
      //assigning user input to strInput
      strInput = input.nextLine();
      //if input does not follow instructions
      if(strInput.length() <= 6)
      {
        //print message that tells user their input is incorrect
        System.out.println("The string you entered is not greater than 6 characters long.\n");
      }
      //if input matches instructions
      else
      {
        //print congrats message
        System.out.println("Congrats! You have passed stage 1 and moved on to stage 2!");
        //end the stage 1 loop
        break;
      }
    }

    //stage 2
    while(isValid = true)
    {
      //prompt user to enter string for stage 2
      System.out.print("\nStage 2: Please enter a string that contains at least one lowercase 'a': ");
      //assigning user input to strInput
      strInput = input.nextLine();
      //if input does not follow instructions
      if(!strInput.contains("a"))
      {
        //print message that tells user their input is incorrect
        System.out.println("The string you entered does not contain at least one lowercase 'a'.\n");
      }
      //if input matches instructions
      else
      {
        //print congrats message
        System.out.println("Congrats! You have passed stage 2 and moved on to stage 3!");
        //end the stage 2 loop
        break;
      }
    }

    //stage 3
    while(isValid = true)
    {
      //prompt user to enter string for stage 3
      System.out.print("\nStage 3: Please enter a string that is between 5 and 15 characters long, and does not contain the letter 'z': ");
      //assigning user input to strInput
      strInput = input.nextLine();
      //if input matches instructions
      if(!strInput.contains("z") && strInput.length() >= 5 && strInput.length() <= 15)
      {
        //print congrats message
        System.out.println("Congrats! You have passed stage 3 and moved on to stage 4!");
        //end the stage 3 loop
        break;
      }
      //if input does not follow instructions
      else
      {
        //print message that tells user their input is incorrect
        System.out.println("The string you entered does not follow the given instructions.\n");
      }
    }
    
    //stage 4
    while(isValid = true)
    {
      //prompt user to enter string for stage 4
      System.out.print("\nStage 4: Please enter an integer between 5 and 500: ");
      //checking to see if user input matches instructions
      try
      {
        //read and assigning user input to strInput
        strInput = input.nextLine();
        //converting strInput to an integer and assigning it to intInput
        intInput = Integer.parseInt(strInput);
        //if input matches instructions
        if(intInput >= 5 && intInput <= 500)
        {
          //print congrats message
          System.out.println("Congrats! You have passed stage 4 and moved on to stage 5!");
          //end the stage 4 loop
          break;
        }
        //if input is not between 5 and 500
        else
        {
          //print message that tells user their integer does not follow instructions
          System.out.println("The integer you entered does not follow the given instructions.\n");
        }
        
      }
      //if input is not an integer
      catch(Exception e)
      {
        //print message that tells user their input is incorrect
        System.out.println("Your input does not follow the given instructions.\n");
      }
    }

    //stage 5
    while(isValid = true)
    {
      //prompt user to enter string for stage 5
      System.out.print("\nStage 5: Please enter a negative integer: ");
      //checking to see if user input matches instructions 
      try
      {
        //read and assigning user input to strInput
        strInput = input.nextLine();
        //converting strInput to an integer and assigning it to intInput
        intInput = Integer.parseInt(strInput);
        //if input matches instructions
        if(intInput < 0)
        {
          //print congrats message
          System.out.println("Congrats! You have passed stage 5 and moved on to stage 6!");
          //end the stage 5 loop
          break;
        }
        //if input is not negative
        else
        {
          //print message that tells user their integer does not follow instructions
          System.out.println("The integer you entered does not follow the given instructions.\n");
        }

      }
      //if input is not an integer
      catch(Exception e)
      {
        //print message that tells user their input is incorrect
        System.out.println("Your input does not follow the given instructions.\n");
      }
    }

    //stage 6
    while(isValid = true)
    {
      //prompt user to enter string for stage 6
      System.out.print("\nStage 6: Please enter a positive and odd integer: ");
      //checking to see if user input matches instructions 
      try
      {
        //read and assigning user input to strInput
        strInput = input.nextLine();
        //converting strInput to an integer and assigning it to intInput
        intInput = Integer.parseInt(strInput);
        //if input matches instructions
        if(intInput % 2 != 0 && intInput > 0)
        {
          //print ending congrats message
          System.out.println("Congrats! You have passed stage 6 and completed all of the stages!");
          //end the stage 6 loop
          break;
        }
        //if input is not positive and/or is not odd
        else
        {
          //print message that tells user their integer does not follow instructions
          System.out.println("The integer you entered does not follow the given instructions.\n");
        }

      }
      //if input is not an integer
      catch(Exception e)
      {
        //print message that tells user their input is incorrect
        System.out.println("Your input does not follow the given instructions.\n");
      }
    }
  }
}