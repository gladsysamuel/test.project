
import java.util.*;
import java.lang.Thread;

public class CustomerInfo {

public static void main(String[] args) {
	  Scanner input = new Scanner (System.in);
	  System.out.println("Enter Count of Customers: ");
      int count = input.nextInt();
   int i;
   int x=0;
   int[] cus_id = new int[30];
   String[] cus_name = new String[30];
   int[] cus_age = new int[30];
   int[] cus_accno = new int[30];
   int menuChoice;

 

   start:
   do{

       System.out.println("\t\t\tCustomer Data:");
       System.out.println("\t\t1.Add Customer Details \t2. "
       		+ "Display Customer Details\t3. Exit");
       System.out.println("Enter a choice: ");
       menuChoice = input.nextInt();

       if (menuChoice==1)
       {
    	 
    	   
           for (i=0; i<=count;i++)
           {
        	   System.out.println("Customer Id:");
               cus_id[i] = input.nextInt();
               System.out.println("Customer name:");
               cus_name[i] = input.next();
               System.out.println("Customer Age:");
               cus_age[i] = input.nextInt();
               System.out.println("Customer Account number:");
               cus_accno[i] = input.nextInt();
               
              // x++;
               continue start;
           }
       }
               else if (menuChoice==2)
               {
                   for (i=0; i<count; i++)
                   {
                       System.out.println("  Customer ID: " +cus_id[i]+ "  Customer Name:  "  +cus_name[i]+  "  Customer Age: " +cus_age [i] + "  Customer Account Number: " +cus_accno[i] );
                   }
               }

   } while (menuChoice<3);

}
// alloting account numbers:





}