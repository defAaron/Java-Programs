/*
Author: Aaron Dutta
Date: July 16th, 2024
Super Math Calculator
*/

//importing the scanner object
import java.util.Scanner;

public class Main 
{
  /**
  printing menu for the user to select a choice from the various calculations
  **/
  public static void printMenu()
  {
    //declaring an empty string variable strInput
    String strInput = "";
    //declaring an empty string variable strChoice
    String strChoice = "";
    //declaring the scanner object
    Scanner input = new Scanner(System.in);
    //printing the welcome message 
    System.out.println("\n\nWelcome to Aaron's Math Calculators!\n");
    //printing the menu options
    System.out.println("a) Quadratic Calculator");

    System.out.println("b) Frustum Calculator");

    System.out.println("c) Area of Triangle Calculator");

    System.out.println("d) Triangular-Base Pyramid Calculator");

    System.out.println("e) Regular Pentagonal Prism Calculator");

    System.out.println("f) X-intercept Calculator");

    System.out.println("g) Cosine Law Calculator");

    System.out.println("h) Sine Law Calculator");

    System.out.println("i) Factorial Calculator");

    System.out.println("j) Fibonacci Printer");
  }

  /**
  @param intVala is the a value of the quadratic
  @param intValb is the b value of the quadratic
  @param intValc is the c value of the quadratic
  @param intValy is the y value of the quadratic
  @return the array of solutions after calculation
  **/
  public static double [] getArrsol(int intVala, int intValb, int intValc, int intValy)
  {
    //declaring integer variable intNewc and assigning it to intValc - intValy
    int intNewc = intValc - intValy;
    //declaring double variable dblDisc and assigning it to intValb * intValb - 4 * intVala * intNewc
    double dblDisc = intValb * intValb - 4 * intVala * intNewc;
    //declaring double array dblArrres and assigning it 2 values
    double [] dblArrres = new double[2];

    //if discriminant is greater than zero
    if(dblDisc > 0)
    {
      //set first value in dblArrres to first solution
      dblArrres[0] = (-intValb + Math.sqrt(dblDisc)) / (intVala * 2);
      //set second value in dblArrres to second solution
      dblArrres[1] = (-intValb - Math.sqrt(dblDisc)) / (intVala * 2);
    }
    //if discriminant is zero
    else if(dblDisc == 0)
    {
      //set first value in dblArrres to solution
      dblArrres[0] = -intValb / (intVala * 2);
      //set second value in dblArrres to first value
      dblArrres[1] = dblArrres[0];
    }
    //if discriminant is less than zero
    else
    {
      //no solutions
      dblArrres = null;
    }
    //returning the solution array
    return dblArrres;
  }

  /**
  @param intCone is the Cone height
  @param intFrust is the Frustum height
  @param intRadius is the length of the base radius of the cone
  @return the surface area of the frustum after calculation
  **/
  public static double getFrustum(int intCone, int intFrust, int intRadius)
  {
    //declaring double variable dblTopfrust to be the top surface of the frustum and calculating it
    double dblTopfrust = intRadius * (intCone - intFrust) / intCone;
    //declaring double variable dblSlant to be the slant height and calculating it
    double dblSlant = Math.sqrt((intFrust * intFrust) + Math.pow((intRadius - dblTopfrust),2));
    //declaring double variable dblTotalfrust and calculating it
    double dblTotalfrust = (intRadius + dblTopfrust) * dblSlant * Math.PI + Math.pow(intRadius, 2) * Math.PI + Math.pow(dblTopfrust, 2) * Math.PI; 
    //returning the surface area of the frustum
    return dblTotalfrust;
  }

  /**
  @param intX1 is the x-coordinate of first point
  @param intY1 is the y-coordinate of first point
  @param intX2 is the x-coordinate of second point
  @param intY2 is the y-coordinate of second point
  @param intX3 is the x-coordinate of third point
  @param intY3 is the y-coordinate of third point
  @return area of the triangle
  **/
  public static double getTriangle(int intX1, int intY1, int intX2, int intY2, int intX3, int intY3)
  {
    //declaring double variable dblTriangleArea to be the area of the triangle and calculating it
    double dblTriangleArea = Math.abs((intX1 * (intY2 - intY3) + intX2 * (intY3 - intY1) + intX3 * (intY1 - intY2)) / 2.0);
    //returning the area of the triangle
    return dblTriangleArea;
  }
  
  /**
  @param intBaselength is the base length of the pyramid
  @param intHeight is the height of the pyramid
  @return surface area of the pyramid
  **/
  public static double getPyramid(int intHeight, int intBaselength)
  {
    //declaring double variable dblBase to be base area and calculating it
    double dblBase = (Math.sqrt(3) / 4) * Math.pow(intBaselength, 2); 
    //declaring double variable dbltSlant to be slant height  and calculating it
    double dblSlant = Math.sqrt((intBaselength / 2) * (intBaselength / 2) + Math.pow(intHeight, 2));
    //declaring double variable dblFace to be each face area and calculating it
    double dblFace = intBaselength * dblSlant / 2;
    //declaring double variable dblPyramid to be total surface area and calculating it
    double dblPyramid = dblBase + (dblFace * 3);
    //returning total surface area of pyramid
    return dblPyramid;
  }
  /**
  @param intLength is the base length of the prism
  @param intDistvertex is the distance from the center of the base to any vertex
  @param intHeight is the height of the pyramid
  @return surface area of the pyramid
  **/
  public static double getPrism(int intLength, int intDistvertex, int intHeight)
  {
    //declaring double variable dblPerm to be perimeter and calculating it
    double dblPerm = intLength * 5;
    //declaring double variable dblApothem to be the apothem and calculating it
    double dblApothem = Math.sqrt((intDistvertex * intDistvertex) - ((intLength / 2) * (intLength / 2))); 
    //declaring double variable dblBase to be base area and calculating it
    double dblBase = dblPerm * dblApothem / 2;
    //declaring double variable dblPrism to be the volume and calculating it
    double dblPrism = dblBase * intHeight;
    //returning volume of prism
    return dblPrism;
  }
  /**
  @param intX1 is the x-coordinate of first point
  @param intY1 is the y-coordinate of first point
  @param intX2 is the x-coordinate of second point
  @param intY2 is the y-coordinate of second point
  @return x-intercept
  **/
  public static double getIntercept(int intX1, int intY1, int intX2, int intY2)
  {
    double dblSlope = (intY2 - intY1) / (intX2- intX1);

    double dblYcept = (intY1 - (dblSlope * intX1));

    double dblXcept = -dblYcept / dblSlope;

    return dblXcept;
  }
  /**
  @param intSide1 is a side
  @param intSide2 is a side
  @param intAngle is the angle formed between AB
  @return side 3
  **/
  public static double getCoslaw(int intSide1, int intSide2, int intAngle)
  {
    double dblAnglerad = Math.toRadians(intAngle);
    
    double dblSide3 = Math.sqrt(intSide1 * intSide1 + intSide2 * intSide2 - 2 * intSide1 * intSide2 * Math.cos(dblAnglerad));

    return dblSide3;
    
  }
  /**
  @param intSide1 is a side
  @param intSide2 is a side
  @param intAngle is the angle formed between AB
  @return angle 2
  **/
  public static double getSinelaw(int intSide1, int intSide2, int intAngle)
  {
    double dblAnglerad = Math.toRadians(intAngle);

    double dblAngle2 = Math.sin(dblAnglerad) * intSide2 / intSide1;

    return dblAngle2;
  }
  
  /**
  @param intNum is the input number
  @return the factorial of intNum
  **/
  public static double getFactorial(int intNum)
  {
    int intFactorial = 1;
    for(int i = 1; i <= intNum; i++)
    {
       intFactorial = intFactorial * i;
    }
    
    return intFactorial;
  }

  /**
  @param intNum is input
  @return intNum numbers of fiibnacci sequence
  **/
  public static void getFibonacci(int intNum)
  {
    int intA = 0;
    int intB = 1;
    int intNext = 0;
    for(int i = 1; i <= intNum; i++)
    {
      intNext = intA + intB;
      intA = intB;
      intB = intNext;
      System.out.println(intA);
    }
  }
  
  public static void main(String[] args) 
  {
    //calling printMenu method
    printMenu();
    //printing message to tell user to pick option
    System.out.print("\nChoose a calculator by entering the letter of it: ");
    //assigning strChoice to their option and reading it
    strChoice = input.next();


    if(strChoice.equalsIgnoreCase("a"))
    {
      //print instructions for input
      System.out.println("You will be prompted 4 times to input integer values.\n");
      System.out.println("For your quadratic equation ax^2 + bx + c = y:.\n");
      System.out.println("\t Your first input will be the value of a\n");
      System.out.println("\t Your second input will be the value of b\n");
      System.out.println("\t Your third input will be the value of c\n");
      System.out.println("\t Your fourth input will be the value of y\n");
      System.out.println("For example, if your quadratic is 3x^2 - 2x + 1 = 0, your inputs will be 3, -2, 1, and 0 respectively.\n");
      System.out.println("To exit, enter n at any stage when asked.\n");

      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
      {
        int intVala;
        int intValb;
        int intValc;
        int intValy;
        int [] intArrval = new int[4];
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        
        System.out.print("Enter the value of a: ");
        intVala = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        System.out.print("Enter the value of b: ");
        intValb = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        System.out.print("Enter the value of c: ");
        intValc = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        System.out.print("Enter the value of y: ");
        intValy = input.nextInt();
    
        intArrval[0] = intVala;
        intArrval[1] = intValb;
        intArrval[2] = intValc;
        intArrval[3] = intValy;
    
        double [] dblArrsol = getArrsol(intArrval[0], intArrval[1], intArrval[2], intArrval[3]);
    
        if(dblArrsol != null)
        {
          System.out.println("Your equation has real solutions " + dblArrsol[0] + " and " + dblArrsol[1]);
        }
        else
        {
          System.out.println("\nYour equation has no real solutions.");
        }
        printMenu();
      }
    }

    if(strChoice.equalsIgnoreCase("b"))
    {
      //print instructions for input
      System.out.println("You will be prompted 3 times to input integer values.\n");
      System.out.println("For inputting your cone dimensions: \n");
      System.out.println("\t Your first input will be the height of the cone");
      System.out.println("\t Your second input will be the height of the frustum");
      System.out.println("\t Your third input will be the radius of the base of the original one");
      System.out.println("To exit, enter n at any stage when asked.\n");
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
        {
          int intCone;
          int intFrust;
          int intRadius;
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Frustum Calculator!");
            break;
          }

          System.out.print("Enter the value of cone height: ");
          intCone = input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Frustum Calculator!");
            break;
          }
          System.out.print("Enter the value of frustum height: ");
          intFrust = input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Frustum Calculator!");
            break;
          }
          System.out.print("Enter the value of base radius: ");
          intRadius = input.nextInt();

          double dblFrustsol = getFrustum(intCone, intFrust, intRadius);

          System.out.println("\nThe surface area of your frustum is " + dblFrustsol);
          
        }
      }
    if(strChoice.equalsIgnoreCase("c"))  
    {
      //print instructions for input
      System.out.println("You will be prompted 6 times to input integer values.\n");
      System.out.println("For your triangle with coordinates (x1, y1), (x2, y2), (x3, y3)\n");
      System.out.println("\t Your first input will be the value of x1\n");
      System.out.println("\t Your second input will be the value of y1\n");
      System.out.println("\t Your third input will be the value of x2\n");
      System.out.println("\t Your fourth input will be the value of y2\n");
      System.out.println("\t Your third input will be the value of x3\n");
      System.out.println("\t Your fourth input will be the value of y3\n");
      System.out.println("To exit, enter n at any stage when asked.\n");
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
      {
        int intX1;
        int intY1;
        int intX2;
        int intY2;
        int intX3;
        int intY3;
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }

        System.out.print("Enter the value of X1 : ");
        intX1 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }
        System.out.print("Enter the value of Y1 : ");
        intY1 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }
        System.out.print("Enter the value of X2 : ");
        intX2 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }
        System.out.print("Enter the value of Y2 : ");
        intY2 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }
        System.out.print("Enter the value of X3 : ");
        intX3 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }
        System.out.print("Enter the value of Y3 : ");
        intY3 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Area of a Triangle Calculator!");
          break;
        }
        

        double dblTrianglesol = getTriangle(intX1, intY1, intX2, intY2, intX3, intY3);

        System.out.println("\nThe area of your triangle is " + dblTrianglesol);

      }
    }

    if(strChoice.equalsIgnoreCase("d"))
    {
      //print instructions for input
      System.out.println("You will be prompted 2 times to input integer values.\n");
      System.out.println("For inputting your pyramid dimensions: \n");
      System.out.println("\t Your first input will be the height of the pyramid");
      System.out.println("\t Your second input will be the base length");
      System.out.println("To exit, enter n at any stage when asked.\n");
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
        {
          int intHeight;
          int intBaselength;
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Triangular-Based Pyramid Calculator!");
            break;
          }

          System.out.print("Enter the value of height: ");
          intHeight = input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Triangular-Based Pyramid Calculator!");
            break;
          }
          System.out.print("Enter the value of base length: ");
          intBaselength = input.nextInt();


          double dblPyramidsol = getPyramid(intHeight, intBaselength);

          System.out.println("\nThe surface area of your Triangular-Based Pyramid is " + dblPyramidsol);

        }
    }

    if(strChoice.equalsIgnoreCase("e"))
    {
      //print instructions for input
      System.out.println("You will be prompted 3 times to input integer values.\n");
      System.out.println("For inputting your prism dimensions: \n");
      System.out.println("\t Your first input will be the side length of the pentagonal base.");
      System.out.println("\t Your second input will be the distance from the center of the base to any vertex of the base.");
      System.out.println("\t Your third input will be the height of the prism.");
      System.out.println("To exit, enter n at any stage when asked.\n");
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
        {
          int intLength;
          int intDistvertex;
          int intHeight;
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Pentagonal Prism Calculator!");
            break;
          }

          System.out.print("Enter the value of side length: ");
          intLength = input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("\nThanks for using Aaron's Pentagonal Prism Calculator!");
            break;
          }
          
          System.out.print("Enter the value of distance from center of base to any vertex of base: ");
          intDistvertex= input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Pentagonal Prism Calculator!");
            break;
          }

          System.out.print("Enter the value of height: ");
          intHeight = input.nextInt();

          double dblPrismsol = getPrism(intLength, intDistvertex, intHeight);

          System.out.println("\nThe volume of your pentagonal prism is " + dblPrismsol);

        }
    }

    if(strChoice.equalsIgnoreCase("f"))
    {
      //print instructions for input
      System.out.println("You will be prompted 4 times to input integer values.\n");
      System.out.println("For your line with points (X1, Y1) and (X2, Y2): ");
      System.out.println("\t Your first input will be the value of X1\n");
      System.out.println("\t Your second input will be the value of X2\n");
      System.out.println("\t Your third input will be the value of Y1\n");
      System.out.println("\t Your fourth input will be the value of Y2\n");
      System.out.println("To exit, enter n at any stage when asked.\n");
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
      {
        int intX1;
        int intY1;
        int intX2;
        int intY2;
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }

        System.out.print("Enter the value of X1: ");
        intX1 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        System.out.print("Enter the value of Y1: ");
        intY1 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        System.out.print("Enter the value of X2: ");
        intX2 = input.nextInt();
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Quadratic Calculator!");
          break;
        }
        System.out.print("Enter the value of Y2: ");
        intY2 = input.nextInt();

        double dblXceptsol = getIntercept(intX1, intY1, intX2, intY2);

        System.out.println("\nThe x-intercept of your line is " + dblXceptsol);
      }
    }

    if(strChoice.equalsIgnoreCase("g"))
    {
      //print instructions for input
      System.out.println("You will be prompted 3 times to input integer values.\n");
      System.out.println("For inputting your triangle values: \n");
      System.out.println("\t Your first input will be side A.");
      System.out.println("\t Your second input will be side B.");
      System.out.println("\t Your third input will be the angle formed between A and B.");
      System.out.println("To exit, enter n at any stage when asked.\n");
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
        {
          int intSide1;
          int intSide2;
          int intAngle;
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Cosine Law Calculator!");
            break;
          }

          System.out.print("Enter the value of side A: ");
          intSide1 = input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Cosine Law Calculator!");
            break;
          }

          System.out.print("Enter the value of side 2: ");
          intSide2= input.nextInt();
          //prompt if user wants to continue
          System.out.print("Would you like to continue: ");
          strInput = input.next();
          if(strInput.equals("n") || strInput.equals("N"))
          {
            System.out.println("Thanks for using Aaron's Cosine Law Calculator!");
            break;
          }

          System.out.print("Enter the value of the angle: ");
          intAngle = input.nextInt();

          double dblSidesol = getCoslaw(intSide1, intSide2, intAngle);

          System.out.println("\nThe value of side 3 is " + dblSidesol);
      }
    }
    if(strChoice.equalsIgnoreCase("h"))
      {
        //print instructions for input
        System.out.println("You will be prompted 3 times to input integer values.\n");
        System.out.println("For inputting your triangle values: \n");
        System.out.println("\t Your first input will be side A.");
        System.out.println("\t Your second input will be side B.");
        System.out.println("\t Your third input will be the angle formed between A and B.");
        System.out.println("To exit, enter n at any stage when asked.\n");
        //while user does not choose to exit
        while(!strInput.equals("n") || !strInput.equals("N"))
          {
            int intSide1;
            int intSide2;
            int intAngle;
            //prompt if user wants to continue
            System.out.print("Would you like to continue: ");
            strInput = input.next();
            if(strInput.equals("n") || strInput.equals("N"))
            {
              System.out.println("Thanks for using Aaron's Sine Law Calculator!");
              break;
            }

            System.out.print("Enter the value of side 1: ");
            intSide1 = input.nextInt();
            //prompt if user wants to continue
            System.out.print("Would you like to continue: ");
            strInput = input.next();
            if(strInput.equals("n") || strInput.equals("N"))
            {
              System.out.println("Thanks for using Aaron's Sine Law Calculator!");
              break;
            }

            System.out.print("Enter the value of side 2: ");
            intSide2= input.nextInt();
            //prompt if user wants to continue
            System.out.print("Would you like to continue: ");
            strInput = input.next();
            if(strInput.equals("n") || strInput.equals("N"))
            {
              System.out.println("Thanks for using Aaron's Sine Law Calculator!");
              break;
            }

            System.out.print("Enter the value of the angle 1: ");
            intAngle = input.nextInt();

            double dblAnglesol = getSinelaw(intSide1, intSide2, intAngle);

            System.out.println("\nThe value of angle 2 is " + dblAnglesol);
        }
      }
    if(strChoice.equalsIgnoreCase("i"))
    {
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
      {
        int intNum;
        //print instructions for input
        System.out.println("You will be prompted 1 time to input a positive integer value.\n");
        System.out.println("To exit, enter n at any stage when asked.\n");
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Factorial Calculator!");
          break;
        }

        System.out.print("Enter the value of your number: ");
        intNum = input.nextInt();

        double dblFactorialsol = getFactorial(intNum);

        System.out.println("\nThe result is " + dblFactorialsol);
      }
    }
    if(strChoice.equalsIgnoreCase("j"))
    {
      //while user does not choose to exit
      while(!strInput.equals("n") || !strInput.equals("N"))
      {
        int intNum;
        //print instructions for input
        System.out.println("You will be prompted 1 time to input a positive integer value.\n");
        System.out.println("To exit, enter n at any stage when asked.\n");
        //prompt if user wants to continue
        System.out.print("Would you like to continue: ");
        strInput = input.next();
        if(strInput.equals("n") || strInput.equals("N"))
        {
          System.out.println("Thanks for using Aaron's Fibonacci Printer!");
          break;
        }
        
        System.out.print("Enter the value of your number: ");
        intNum = input.nextInt();

        getFibonacci(intNum);
      }
    }
  }
}
