package Assignment6;

public class Main {
    public static void main(String[] args)
    {
        Vampire vampireNumbers = new Vampire();
        vampireNumbers.printVampireNumber();
        new Overloaded();
        Constructor[] arr = new Constructor[3];
        for(int i=0;i<3;i++)
        {
            arr[i] = new Constructor("Creating Object " + (i+1));
        }
    }
}