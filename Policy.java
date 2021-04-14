/**
   The Policy class simulates an insurance policy
*/
public class Policy
{
   private String polNumber;
   private String provName;
   private PolicyHolder policyHolder; //Information of the policyholder

   private static int instanceCount = 0;
   
   /**
      This no-arg contructor sets Policy information at 0.0
      and strings to "Default", as well as increments the static
      field instanceCount to keep track of the number of instances of this
      class that are created
   */
   
   public Policy()
   {
      polNumber = "Default";
      provName = "Default";
      policyHolder = new PolicyHolder();
      instanceCount++;
   }
   
   /** 
      This constructor sets all Policy information
      to the value passed as an argument, as well as increments the static
      field instanceCount to keep track of the number of instances of this
      class that are created
      @param num The policy number
      @param name The policy provider's name
   */
   
   public Policy(String num, String name, PolicyHolder policyHolderObject)
   {
      polNumber = num;
      provName = name;
      policyHolder = new PolicyHolder(policyHolderObject);
      instanceCount++;
   }
   
   /** 
      The setProviderNumber method stores a value in the 
      polNumber field
      @param num The policy number
   */ 
   
   public void setProviderNumber(String num)
   {
      polNumber = num;
   }
   
   /** 
      The setProviderName method stores a value in the 
      provName field
      @param name The policy provider's name
   */ 
   
   public void setProviderName(String name)
   {
      provName = name;
   } 
   
   /** 
      The getProviderNumber method returns a Policy
      object's policy number 
      @return the value in the polNumber field
   */
   
   public String getProviderNumber()
   {
     return polNumber;
   }
   
   /** 
      The getProviderName method returns a Policy
      object's policy provider name 
      @return the value in the provName field
   */ 
   
   public String getProviderName()
   {
     return provName;
   }
   
   /** 
      The getInstanceCount method returns
      the number of instances of this class
      that have been created
      @return The value in the instanceCount field
   */
   
   public int getInstanceCount()
   {
      return instanceCount;
   }
   
   //Added toString method 
   
   public String toString()
   {
      String str = "Policy number: " + polNumber +
                   "\nProvider name: " + provName;
      return str;
   } 
   
}  