import java.util.Scanner;

public class PolicyDemo
{
   public static void main(String[] args)
   {
      //Used to store user input to pass to the Policy object
      String[] number;
      String[] name;
      String[] firstName;
      String[] lastName;
      int[] age;
      String[] smoke;
      double[] height;
      double[] weight;
      
      //Create a Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Ask the user for the Policy information
      System.out.print("Please enter the Policy Number: ");
      number = keyboard.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      name = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoke = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();      
      /**
         Create an instance of the Policy class,
         passnig the data that was entered as arguments
         to the constructor
      */
      Policy quote = new Policy(number, name, firstName, lastName, age, smoke, height, weight);
      
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
      