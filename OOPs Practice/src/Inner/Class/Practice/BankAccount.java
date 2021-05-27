package Inner.Class.Practice;

import java.io.*;

class BankDetails
{  private double bal;
   BankDetails(double m) 
   {
       bal=m;
    
    }
   public void contact(double rate) throws IOException
   {
       String psw="xyz23";
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the password to see the Bank Details");
       String pass=br.readLine();
       if (pass.equals(psw))
       {
	   Interest ir=new Interest(rate);
	   ir.calculateInterest();
	   
       }
       else
       {System.out.println("Sorry You are not authorized to See the Details");
       return ;}
   }
   private class Interest
  {  private double r;
   Interest(double rate)
   {  r=rate;
       
   }
   void calculateInterest()
   {
       double intr=(bal*r)/100;
       bal+=intr;
       System.out.println("Updaed Balance after adding Interest is : "+bal);
   }
       
   }
   }




public class BankAccount {
    

    public static void main(String[] args) throws IOException {
	    BankDetails bd=new BankDetails(1000000);
	    bd.contact(12);

	

    }

}
