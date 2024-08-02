/**
Author: Aaron Dutta
Date: July 9th, 2024
Choose Your Own Adventure: Math Quiz!
**/

//importing the scanner object
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    //declaring the scanner object
    Scanner input = new Scanner(System.in);
    //declaring the string variable strResponse to record user input
    String strResponse;
    //introduction
    System.out.println("Welcome to Choose Your Own Adventure: Math Quiz!");
    //explaining scenario to user
    System.out.println("You are a grade 11 high school student who is writing a math quiz for MCR3U.");
    System.out.println("There is only one question which is a difficult quadratic problem.");
    System.out.println("You must figure out which actions to perform in order to get the highest mark possible!");
    //instructions for user input
    System.out.println("Please enter Yes/yes or No/no when prompted. The first letter can be uppercase or lowercase, but the rest of the letters must be lowercase.");
    //decision point 
    System.out.print("Do you want to grab your scientific calculator first?");
    //assigning strResponse the user input
    strResponse = input.next();
    //checking if user inputs Yes/yes
    if(strResponse.equals("Yes") || strResponse.equals("yes")) 
    { //first nesting
      System.out.println("You grab your scientific calculator.");
      //decision point
      System.out.print("Will you use the Equation function to directly solve for the roots?");
      //assigning strResponse the user input
      strResponse = input.next();
      //checking if user inputs Yes/yes
      if(strResponse.equals("Yes") || strResponse.equals("yes")) 
      { //second nesting
        System.out.println("You use the equation function to directly solve for the roots, and you receive two numbers.");
        //decision point
        System.out.print("Will you write those two numbers as the answer on your exam? ");
        //assigning strResponse the user input
        strResponse = input.next();
        //checking if user inputs Yes/yes
        if(strResponse.equals("Yes") || strResponse.equals("yes")) 
        { //third nesting
          System.out.println("You write those two numbers as the answer on your exam.");
          //decision point
          System.out.print("Will you spend an extra 5 minutes and double check your answer? ");
          //assigning strResponse the user input
          strResponse = input.next();
          //checking if user inputs Yes/yes
          if(strResponse.equals("Yes") || strResponse.equals("yes")) 
          { //fourth nesting
            System.out.println("You spend an extra 5 minutes and double check your answer. You realize that you needed to factor the expression, not solve for the roots");
            //decision point
            System.out.print("Will you spend 2 minutes erasing and changing your answer, and submit your quiz? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You spend 2 minutes erasing and changing your answer, and submit your quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 100%!");
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You do not spend 2 minutes changing your answer and submit your quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 80% because you did not write the expression as your final answer!");
            }
          } 
          //checking if user inputs No/no
          if(strResponse.equals("No") || strResponse.equals("no")) 
          { //fourth nesting
            System.out.println("You do not spend an extra 5 minutes and double check your answer.");
            //decision point
            System.out.print("Will you waste time and sleep until the end of the quiz? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You waste time and sleep until the end of the quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 50% because you did not factor!");
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You hand in the quiz right away.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 50% because you did not factor!");
            }
          }
        } 
        //checking if user inputs No/no
        if(strResponse.equals("No") || strResponse.equals("no")) 
        { //third nesting
          System.out.println("You do not write the two numbers as your answer and continue solving.");
          //decision point
          System.out.print("Will you use the quadratic formula? ");
          //assigning strResponse the user input
          strResponse = input.next();
          //checking if user inputs Yes/yes
          if(strResponse.equals("Yes") || strResponse.equals("yes")) 
          { //fourth nesting
            System.out.println("You use the quadratic formula and find the roots. They match to your answers that you found on your calculator");
            //decision point
            System.out.print("Will you substitute your answer in the equation to double check? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You substitute your answer in the equation to double check, but it does not work. You find out the problem that you accidentally wrote a 2 instead of 3, and submit your quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 80% because you did not write the expression as your final answer!");
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You do not spend 2 minutes changing your answer and submit your quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 50% because one of your roots was wrong, and you did not write the expression as your final answer!");
            }
          } 
          //checking if user inputs No/no
          if(strResponse.equals("No") || strResponse.equals("no")) 
          { //fourth nesting
            System.out.println("You do not use the quadratic formula and factor instead.");
            //decision point
            System.out.print("Will you write the factored expression as your answer? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You write the factored expression as your answer.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 100%!");
            }
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You do not write the factored expression as your answer and instead write the roots.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 90% because you did not write the factored expression as your answer!");
            }
          }
        }
      } 
      //checking if user inputs No/no
      if(strResponse.equals("No") || strResponse.equals("no")) 
      { //second nesting
        System.out.println("You do not use the equation function.");
        //decision point
        System.out.print("Will you remove the cover of the scientific calculator? ");
        //assigning strResponse the user input
        strResponse = input.next();
        //checking if user inputs Yes/yes
        if(strResponse.equals("Yes") || strResponse.equals("yes")) 
        { //third nesting
          System.out.println("You remove the cover of the scientific calculator, see the answer written on it, and copy it on your quiz.");
          //decision point
          System.out.print("Will you erase the answer? ");
          //assigning strResponse the user input
          strResponse = input.next();
          //checking if user inputs Yes/yes
          if(strResponse.equals("Yes") || strResponse.equals("yes")) 
          { //fourth nesting
            System.out.println("You erase your answer and decide to do the problem on your own.");
            //decision point
            System.out.print("Will you use the quadratic formula? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You use the quadratic formula and find the roots. They match to your answers that you found on your calculator");
              //decision point
              System.out.print("Will you substitute your answer in the equation to double check? ");
              //assigning strResponse the user input
              strResponse = input.next();
              //checking if user inputs Yes/yes
              if(strResponse.equals("Yes") || strResponse.equals("yes")) 
              { //sixth nesting
                System.out.println("You substitute your answer in the equation to double check, but it does not work. You find out the problem that you accidentally wrote a 2 instead of 3, and submit your quiz.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 80% because you did not write the expression as your final answer!");
              } 
              //checking if user inputs No/no
              if(strResponse.equals("No") || strResponse.equals("no")) 
              { //sixth nesting
                System.out.println("You do not spend 2 minutes changing your answer and submit your quiz.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 50% because one of your roots was wrong, and you did not write the expression as your final answer!");
              }
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You do not use the quadratic formula and factor instead.");
              //decision point
              System.out.print("Will you write the factored expression as your answer? ");
              //assigning strResponse the user input
              strResponse = input.next();
              //checking if user inputs Yes/yes
              if(strResponse.equals("Yes") || strResponse.equals("yes")) 
              { //sixth nesting
                System.out.println("You write the factored expression as your answer.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 100%!");
              } 
              //checking if user inputs No/no
              if(strResponse.equals("No") || strResponse.equals("no")) 
              { //sixth nesting
                System.out.println("You do not write the factored expression as your answer and instead write the roots.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 90% because you did not write the factored expression as your answer!");
              }
            }
          } 
          //checking if user inputs No/no
          if(strResponse.equals("No") || strResponse.equals("no")) 
          { //fourth nesting
            System.out.println("You do not erase the answer and keep it on your quiz.");
            //decision point

            System.out.print("Will you spend an extra 5 minutes to double check your answer and show your work? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You spend an extra 5 minutes and double check your answer. You realize that you needed to factor the expression, not solve for the roots");
              //decision point
              System.out.print("Will you spend 2 minutes erasing and changing your answer, and submit your quiz? ");
              //assigning strResponse the user input
              strResponse = input.next();
              //checking if user inputs Yes/yes
              if(strResponse.equals("Yes") || strResponse.equals("yes")) 
              { //sixth nesting
                System.out.println("You spend 2 minutes erasing and changing your answer, and submit your quiz.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 100%!");
              } 
              //checking if user inputs No/no
              if(strResponse.equals("No") || strResponse.equals("no")) 
              { //sixth nesting
                System.out.println("You do not spend 2 minutes changing your answer and submit your quiz.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 80% because you did not write the expression as your final answer!");
              }
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You do not spend an extra 5 minutes and double check your answer.");
              //decision point
              System.out.print("Will you waste time and sleep until the end of the quiz? ");
              //assigning strResponse the user input
              strResponse = input.next();
              //checking if user inputs Yes/yes
              if(strResponse.equals("Yes") || strResponse.equals("yes")) 
              { //sixth nesting
                System.out.println("You waste time and sleep until the end of the quiz.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 50% because you did not factor!");
              } 
              //checking if user inputs No/no
              if(strResponse.equals("No") || strResponse.equals("no")) 
              { //sixth nesting
                System.out.println("You hand in the quiz right away.");
                //user receives quiz mark as a percentage
                System.out.println("After a couple of days, you get your quiz back. You received 50% because you did not factor!");
              }
            }
          }
        } 
        //checking if user inputs No/no
        if(strResponse.equals("No") || strResponse.equals("no")) 
        { //third nesting
          System.out.println("You do not remove the cover of the scientific calculator.");
          //decision point
          System.out.print("Will you spend an extra 5 minutes and double check your answer? ");
          //assigning strResponse the user input
          strResponse = input.next();
          //checking if user inputs Yes/yes
          if(strResponse.equals("Yes") || strResponse.equals("yes")) 
          { //fourth nesting
            System.out.println("You spend an extra 5 minutes and double check your answer. You realize that you needed to factor the expression, not solve for the roots");
            //decision point
            System.out.print("Will you spend 2 minutes erasing and changing your answer, and submit your quiz? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You spend 2 minutes erasing and changing your answer, and submit your quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 100%!");
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You do not spend 2 minutes changing your answer and submit your quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 80% because you did not write the expression as your final answer!");
            }
          } 
          //checking if user inputs No/no
          if(strResponse.equals("No") || strResponse.equals("no")) 
          { //fourth nesting
            System.out.println("You do not spend an extra 5 minutes and double check your answer.");
            //decision point
            System.out.print("Will you waste time and sleep until the end of the quiz? ");
            //assigning strResponse the user input
            strResponse = input.next();
            //checking if user inputs Yes/yes
            if(strResponse.equals("Yes") || strResponse.equals("yes")) 
            { //fifth nesting
              System.out.println("You waste time and sleep until the end of the quiz.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 50% because you did not factor!");
            } 
            //checking if user inputs No/no
            if(strResponse.equals("No") || strResponse.equals("no")) 
            { //fifth nesting
              System.out.println("You hand in the quiz right away.");
              //user receives quiz mark as a percentage
              System.out.println("After a couple of days, you get your quiz back. You received 50% because you did not factor!");
            }
          }
        }
      }
    } 
    //checking if user inputs No/no
    if(strResponse.equals("No") || strResponse.equals("no")) 
    { //first nesting
      System.out.println("You do not grab your scientific calculator.");
      //decision point
      System.out.print("Will you use your phone's calculator instead? ");
      //assigning strResponse the user input
      strResponse = input.next();
      //checking if the user inputs Yes/yes
      if(strResponse.equals("Yes") || strResponse.equals("yes")) 
      { //second nesting
        System.out.println("You use your phone's calculator and solve the quadratic problem.");
        //decision point
        System.out.print("Will you double-check your answer? ");
        //assigning strResponse the user input
        strResponse = input.next();
        //checking if the user inputs Yes/yes
        if(strResponse.equals("Yes") || strResponse.equals("yes")) 
        { //third nesting
          System.out.println("You double-check your answer and find it correct. You submit your quiz and receive 100%!");
        } 
        //checking if user inputs No/no
        if(strResponse.equals("No") || strResponse.equals("no")) 
        { //third nesting
          System.out.println("You submit your quiz without double-checking and receive 80% due to a small mistake.");
        }
      } 
      //checking if user inputs No/no
      if(strResponse.equals("No") || strResponse.equals("no")) 
      { //second nesting
        System.out.println("You do not use your phone's calculator.");
        //decision point
        System.out.print("Will you solve the problem manually? ");
        //assigning strResponse the user input
        strResponse = input.next();
        //checking if the user inputs Yes/yes
        if(strResponse.equals("Yes") || strResponse.equals("yes")) 
        { //third nesting
          System.out.println("You solve the problem manually, but it takes too long. You submit your quiz and receive 70% due to lack of time.");
        } 
        //checking if user inputs No/no
        if(strResponse.equals("No") || strResponse.equals("no")) 
        { //third nesting
          System.out.println("You give up on the quiz and submit it blank. You receive 0%.");
        }
      }
    }
  }
}
