package Assignment12;

public class HackerEarth {

 int aa;
    int getValue() {

        int returnValue = 10;
        try {
            String[] Languages = {"Java", "Ruby"};
            System.out.println(Languages[5]);
        } catch (Exception e) {
            System.out.println("Catch Block :" + returnValue);
            return returnValue;
        } finally {
            returnValue += 10;
            System.out.println("Finally block: " + returnValue);
        }
        return  returnValue;
    }
    public static void main(String[] a)
    {int aa;
        System.out.println(aa);
        HackerEarth var=new HackerEarth();
        System.out.println("Main Block:"+ var.getValue());
    }
}

