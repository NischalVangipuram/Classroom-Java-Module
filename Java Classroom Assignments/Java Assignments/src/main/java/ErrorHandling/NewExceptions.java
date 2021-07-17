package ErrorHandling;
import java.util.*;
public class NewExceptions
{ HashSet<String> productName=new HashSet<>();
    HashSet<Integer> productId=new HashSet<>();
    HashSet<String> color=new HashSet<>();
    public void threeExceptions()
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter product name to search");
            String productName=sc.next();
            if(!(productName.contains(productName)))
            {
                throw new ProductNameNotFoundException("Invalid Product Name");
            }
            System.out.println("Enter product id");
            int id=sc.nextInt();
            if(!(productId.contains(id)))
            {
                throw new ProductIdNotFoundException("Invalid product id");
            }
            System.out.println("Enter color");
            String color=sc.next();
            if(!(color.contains(color)))
            {
                throw new colorNotFoundException("color does not exist");
            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
        finally {
            System.out.println("Enter the details again");
        }
    }

    public static void main(String[] args)
    {
        NewExceptions exception=new NewExceptions();
        exception.threeExceptions();
    }
}
