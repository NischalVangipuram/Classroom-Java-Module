package ErrorHandling;

public class colorNotFoundException extends Exception{
    colorNotFoundException(String color)
    {
        super(color);
    }
}
