// is there any direct regex for this?
//regex=(.)(?=.*\\1)

import java.util.HashSet;
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] arg) {

        Scanner sc=new Scanner(System.in);
        String input=sc.next();
       System.out.println(checkAllAlphabets(input));
System.out.println("Sdf");

    }
    static boolean checkAllAlphabets(String input)
    {
        input=input.toLowerCase().replaceAll("[^a-z]","");

        HashSet<Character> hashSet=new HashSet<Character>();
        for(int i=0;i<input.length();i++)
        {
            hashSet.add(input.charAt(i));
        }
        return hashSet.size()==26;
    }
}
