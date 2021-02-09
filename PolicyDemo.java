import java.util.Scanner;

public class PolicyDemo
{
   public static void main(String[] args)
   {
      //Used to store user input to pass to the Policy object
      int testNumber;
      String testProvName;
      String testFirstName;
      String testLastName;
      int testAge;
      String testSmoke;
      double testHeight;
      double testWeight;
      
      //Create a Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Ask the user for the Policy information
      System.out.println("Please enter the Policy Number:");
      testNumber=keyboard.nextInt(); 
      System.out.println("Please enter the Provider Name:");
      testProvName=keyboard.nextLine();
      System.out.println("Please enter the Policyholder’s First Name:");
      testFirstName=keyboard.nextLine();
      System.out.println("Please enter the Policyholder’s Last Name:");
      testLastName=keyboard.nextLine();
      System.out.println("Please enter the Policyholder's Age:");
      testAge=keyboard.nextInt();
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker):");
      testSmoke=keyboard.nextLine();
      System.out.println("Please enter the Policyholder's Height (in inches)");
      testHeight=keyboard.nextDouble();
      System.out.println("Please enter the Policyholder's Weight (in pounds)");
      testWeight=keyboard.nextDouble();
      
      /**
         Create an instance of the Policy class,
         passnig the data that was entered as arguments
         to the constructor
      */
      Policy quote = new Policy(testNumber, testProvName, testFirstName, testLastName, testAge, testSmoke, testHeight, testWeight);
      
      //Get the data and display it
      System.out.println();
      System.out.println("Policy Number: " + quote.getNumber());
      System.out.println("Provider Name: " + quote.getName());
      System.out.println("Policyholder's First Name: " + quote.getFirstName());
      System.out.println("Policyholder's Last Name: " + quote.getLastName());
      System.out.println("Policyholder's Age: " + quote.getAge());
      System.out.println("Policyholder's Smoking Status: " + quote.getSmoke());
      System.out.println("Policyholder's Height: " + quote.getHeight());
      System.out.println("Policyholder's Weight: " + quote.getWeight());
      System.out.println("Policyholder's BMI: " + quote.getBMI());
      System.out.println("Policy Price: " + quote.getPrice());
   }
}
      