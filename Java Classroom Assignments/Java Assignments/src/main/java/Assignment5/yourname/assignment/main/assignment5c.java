package Assignment5.yourname.assignment.main;
import Assignment5.yourname.assignment.data.assignment5a;
import Assignment5.yourname.assignment.singleton.assignment5b;
public class assignment5c
{
    public static void main(String a)
    {
        assignment5a obj1=new assignment5a();
        obj1.print();
        obj1.print1();

        assignment5b obj2=assignment5b.initialize("qwerty");
        obj2.print(obj2.s);



    }
}
