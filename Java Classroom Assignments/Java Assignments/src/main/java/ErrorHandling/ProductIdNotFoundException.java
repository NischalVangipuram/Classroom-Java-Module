package ErrorHandling;

public class ProductIdNotFoundException extends Exception
{
    ProductIdNotFoundException(String message)
    {
        super(message);
    }
}
