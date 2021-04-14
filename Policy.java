/**
   The Policy class simulates an insurance policy
*/
public class Policy
{
   private String polNumber;
   private String provName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String holderSmoke;
   private double holderHeight;
   private double holderWeight;
   
   /**
      This no-arg contructor sets Policy information at 0.0
      and strings to "Default"
   */
   
   public Policy()
   {
      polNumber = "Default";
      provName = "Default";
      holderFirstName = "Default";
      holderLastName = "Default";
      holderAge = 0;
      holderSmoke = "Default";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   /** 
      This constructor sets all Policy information
      to the value passed as an argument
      @param num The policy number
      @param name The policy provider's name
      @param firstname The policyholder's first name
      @param lastname The policyholder's last name
      @param age The policyholder's age
      @param smoke The policyholder's smoking status
      @param height The policyholder's height
      @param weight The policyholder's weight
   */
   
   public Policy(String num, String name, String firstname, String lastname, int age, String smoke, double height, double weight)
   {
      polNumber = num;
      provName = name;
      holderFirstName = firstname;
      holderLastName = lastname;
      holderAge = age;
      holderSmoke = smoke;
      holderHeight = height;
      holderWeight = weight;
   }
   
   /** 
      The setNumber method stores a value in the 
      polNumber field
      @param num The policy number
   */ 
   
   public void setProviderNumber(String num)
   {
      polNumber = num;
   }
   
   /** 
      The setName method stores a value in the 
      provName field
      @param name The policy provider's name
   */ 
   
   public void setProviderName(String name)
   {
      provName = name;
   }
   
   /** 
      The setFirstName method stores a value in the 
      holderFirstName field
      @param firstname The policyholder's first name
   */ 
   
   public void setFirstName(String firstname)
   {
      holderFirstName = firstname;
   }
   
   /** 
      The setLastName method stores a value in the 
      holderLastName field
      @param lastname The policyholder's last name
   */ 
   
   public void setLastName(String lastname)
   {
      holderLastName = lastname;
   }
   
   /** 
      The setAge method stores a value in the 
      holderAge field
      @param age The policyholder's age
   */ 
   
   public void setAge(int age)
   {
      holderAge = age;
   }
   
   /** 
      The setSmoke method stores a value in the 
      holderSmoke field
      @param smoke The policyholder's smoker status
   */ 
   
   public void setSmoke(String smoke)
   {
      holderSmoke = smoke;
   }
   
   /** 
      The setHeight method stores a value in the 
      holderHeight field
      @param height The policyholder's height in inches
   */ 
   
   public void setHeight(double height)
   {
      holderHeight = height;
   }
   
   /** 
      The setWeight method stores a value in the 
      holderWeight field
      @param weight The policyholder's weight in pounds
   */ 
   
   public void setWeight(double weight)
   {
      holderWeight = weight;
   }
   
   /** 
      The getNumber method returns a Policy
      object's policy number 
      @return the value in the polNumber field
   */ 
   
   public String getProviderNumber()
   {
     return polNumber;
   }
   
   /** 
      The getName method returns a Policy
      object's policy provider name 
      @return the value in the provName field
   */ 
   
   public String getProviderName()
   {
     return provName;
   }
   
   /** 
      The getFirstName method returns a Policy
      object's policyholder first name 
      @return the value in the holderFirstName field
   */ 
   
   public String getFirstName()
   {
     return holderFirstName;
   }
   
   /** 
      The getLastName method returns a Policy
      object's policyholder last name 
      @return the value in the holderLastName field
   */ 
   
   public String getLastName()
   {
     return holderLastName;
   }
   
   /** 
      The getAge method returns a Policy
      object's policyholder age 
      @return the value in the holderAge field
   */ 
   
   public int getAge()
   {
     return holderAge;
   }
   
   /** 
      The getSmoke method returns a Policy
      object's policyholder smoker status
      @return the value in the holderSmoke field
   */ 
   
   public String getSmoke()
   {
     return holderSmoke;
   }
   
   /** 
      The getHeight method returns a Policy
      object's policyholder height
      @return the value in the holderHeight field
   */ 
   
   public double getHeight()
   {
     return holderHeight;
   }
   
   /** 
      The getWeight method returns a Policy
      object's policyholder weight 
      @return the value in the holderWeight field
   */ 
   
   public double getWeight()
   {
     return holderWeight;
   }
   
   /**
      The getBMI method returns a Policy
      object's policyholder BMI
      @return the product of holderWeight times 703 divided by holderHeight squared
   */
   
   public double getBMI()
   {
      return (holderWeight * 703)/(holderHeight * holderHeight);
   }
   
   /**
      The getPrice method returns a Policy
      object's policy price
      @return the calculated 
   */
   
    public double getPrice()
      {
       final double BASE_PRICE = 600;
       final double ADDITIONAL_FEE_AGE = 75;
       final double ADDITIONAL_FEE_SMOKING = 100;
       final double ADDITIONAL_FEE_PER_BMI = 20;
       
       final int AGE_THRESHOLD = 50;
       final int BMI_THRESHOLD = 35;
       
       double price = BASE_PRICE;
       
       if(holderAge > AGE_THRESHOLD) //over 50 years
          price += ADDITIONAL_FEE_AGE; //75
          
       if(holderSmoke.equalsIgnoreCase("smoker")) 
          price += ADDITIONAL_FEE_SMOKING; //100
             
       //call the getBMI method
       if(getBMI() > BMI_THRESHOLD) //BMI over 35
          price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
          
       return price;
   }  
   
}  