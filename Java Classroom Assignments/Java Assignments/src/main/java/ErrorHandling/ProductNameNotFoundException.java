package ErrorHandling;

public class ProductNameNotFoundException extends Exception
{
    ProductNameNotFoundException(String message)
    {
        super(message);
    }
}
