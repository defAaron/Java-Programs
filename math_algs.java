/*
Author: Aaron Dutta
Start Date: July 20, 2024
Algorithm Design
*/


//importing scanner object
import java.util.Scanner;

public class Main 
{

  //method for printing the menu
  public static void printMenu()
  {
    //print options
    System.out.println("a) Factorial");
    System.out.println("b) Prime");
    System.out.println("c) Fibonacci");
    System.out.println("d) EXIT");
    //prompt user to input option
    System.out.println("Select: ");
  }

  /*
  @param intNum is the user input that will be used for the factorial
  @return intFactorial is the factorial result of the user input
  */
  public static Integer getFactorial(int intNum)
  {
    //declare integer variable intFactorial and assign it to value of 1
    int intFactorial = 1;
    //loop from i = 0 to i < intNum, adding 1 to i each time
    for(int i = 0; i < intNum; i++)
    {
      //multiply intFactorial by i+1
      intFactorial = (i + 1) * intFactorial;
    }
    //return the factorial value
    return intFactorial;
  }

  /*
  @param intNum is the user input that will be determined if it is prime or not
  @return boolean variable isPrime determining if the user input is prime or not
  */
  public static boolean getPrime(int intNum)
  {
    //declaring boolean variable isPrime and assigning it to true
    boolean isPrime = true;
    //if user input is 0 or 1
    if(intNum == 0 || intNum == 1)
    {
      //set isPrime to false because 0 and 1 are not prime numbers
      isPrime = false;
    }
    //loop from i = 2 to i < (intNum/2) because intNum cannot have factors greater than half its value, adding 1 to i each time
    for(int i = 2; i < (intNum / 2); i++)
    {
      //if i is a factor of intNum
      if(intNum % i == 0)
      {
        //set isPrime to false 
        isPrime = false;
        //terminate loop
        break;
      }
    }
    //return boolean variable isPrime
    return isPrime;
  }

  /*
  @param intNum is the user input that will be the term number
  @return intFibonacci is the intNum'th term
  */
  public static int getFibonacci(int intNum)
  {
    //declare double variable dblSqrt5 and assign it to square root of 5
    double dblSqrt5 = Math.sqrt(5);
    //declare double variable dblPsi and assign it to 1 - square root of 5 over 2
    double dblPsi = (1 - dblSqrt5) / 2;
    //declare double variable dblPhi and assign it to 1 + square root of 5 over 2
    double dblPhi = (1 + dblSqrt5) / 2;
    //declare integer variable intFibonacci and set it to the integer result of Binet's formula
    int intFibonacci = (int) Math.round((Math.pow(dblPhi, intNum) - Math.pow(dblPsi, intNum)) / dblSqrt5);
    //return the value of intFibonacci
    return intFibonacci;
  }


  
  public static void main(String[] args) 
  {
    //declaring scanner object
    Scanner input = new Scanner(System.in);
    //declare integer variable intNum
    int intNum;
    //declare boolean variable isExit and set it to false
    boolean isExit = false;
    //print welcome message
    System.out.println("Welcome to Numbers");

    //while user does not choose to exit
    while(!isExit)
    {
      //call printMenu() function
      printMenu();
      //declare string variable strChoice and assign it to the user input after user is prompted to enter their option
      String strChoice = input.next();

      //switch block for multiple options
      switch(strChoice.toLowerCase())
      {
        //if user chooses option a
        case "a":
          //prompt user for their integer
          System.out.print("Enter your integer value: ");
          //assign intNum to user input
          intNum = input.nextInt();
          //call the getFactorial method inside string output
          System.out.println("The value of " + intNum + " factorial is " + getFactorial(intNum));
          //terminate loop
          break;

        //if user chooses option b
        case "b":
          //prompt user for their integer
          System.out.print("Enter your integer value: ");
          //assign intNum to user input
          intNum = input.nextInt();
          //call getPrime() method, if true is returned
          if(getPrime(intNum))
          {
            //print that user input is a prime number
            System.out.println(intNum + " is a prime number!");
          }
          //if false is returned
          else
          {
            //print that user input is not a prime number
            System.out.println(intNum + " is not a prime number!");
          }
          //terminate loop
          break;

        //if user chooses option c
        case "c":
          //prompt user for their integer
          System.out.print("Enter your integer position: ");
          //assign intNum to user input
          intNum = input.nextInt();
          //call the getFibonacci method inside string output
          System.out.println("The number at position " + intNum + " is " + getFibonacci(intNum));
          //terminate loop
          break;

        //if user chooses option d
        case "d":
          //assign isExit a value of true
          isExit = true;
          //print thank you message
          System.out.println("Thanks for using Numbers! Exiting...");
          //terminate loop
          break;
          
        //if user inputs anything other than given options
        default:
          //print message that tells user to re-input their choice
          System.out.println("Sorry, I did not understand your input. Please enter the letter of the option you would like to choose.");
          
      }
    }
    
  }
}