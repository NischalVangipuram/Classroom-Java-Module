package Assignment5.yourname.assignment.singleton;

public class assignment5b {
   public String s;
   public static assignment5b initialize(String s)
    {
        assignment5b obj=new assignment5b();
        obj.s=s;
        return obj;
    }
    public void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String [] a)
    {

    }
}
