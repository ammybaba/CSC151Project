/**
   The Policy class simulates an insurance policy
*/
public class Policy
{
   private String polNumber;
   private String provName;

   
   /**
      This no-arg contructor sets Policy information at 0.0
      and strings to "Default"
   */
   
   public Policy()
   {
      polNumber = "Default";
      provName = "Default";
   }
   
   /** 
      This constructor sets all Policy information
      to the value passed as an argument
      @param num The policy number
      @param name The policy provider's name
   */
   
   public Policy(String num, String name)
   {
      polNumber = num;
      provName = name;
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
   
   //Added toString method  
   
}  