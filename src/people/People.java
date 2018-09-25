
package people;

public class People
{
       
    public static void main(String[] args)
    {
        
        Customer cust = new Customer();
        cust.setLastName("Jones");
        cust.setFirstName("Bob");
        
        System.out.print("This customer is ");
        System.out.println(cust.getFirstName() + " " + cust.getLastName());
    }
    
}