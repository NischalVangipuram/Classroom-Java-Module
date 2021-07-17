import edu.duke.*;
import java.io.*;
import java.lang.*;

public class CaesarBreaker {

    public int[] CountLetters(String message)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for(int k=0; k < message.length();k++) {
            char ch = Character.toLowerCase(message.charAt(k));
            int index = alphabet.indexOf(ch);
            if(index!=-1)
            {
                counts[index]++;
            }
        }
        return counts;
    }

    //maxIndex
    public int maxIndex(int[] values)
    {

        int max = 0;
        int indexOfMax = 0;
        for(int k = 0;k<values.length;k++)
        {
            if (values[k]> max) {
                max = values[k];
                indexOfMax = k;
            }

        }
        //System.out.println("The Array maxIndex is :"+ indexOfMax);
        return indexOfMax;
    }

    public String decrypt(String encrypted, int Key)
    {
        CaesarCipher cc = new CaesarCipher();
        String decrypted = cc.encrypt(encrypted, 26 - Key);
        return decrypted;

    }


    public String decryptTwoKeys(String encryptedMessage)
    {

        CaesarCipher cc = new CaesarCipher();
        String evenIndexedMessage = halfOfString(encryptedMessage,0);
        String oddIndexedMessage = halfOfString(encryptedMessage,1);
        StringBuilder decrypt_two = new StringBuilder(encryptedMessage);
        int key1= 2;
        int key2= 3;

        String decryptMessage1=cc.encrypt(evenIndexedMessage,(26-key1));
        String decryptMessage2=cc.encrypt(oddIndexedMessage,(26-key2));

        //build up the final answer

        for (int k=0; k<(evenIndexedMessage.length());k++)
        {
            decrypt_two.setCharAt((2*k), decryptMessage1.charAt(k) );
        }
        //k1=2,k2=3
        //     dcfbad-> ggifch
        //     abcdefghi
        // k1= cefghijkl
        // k2= efghijklm

        for (int k=0; k<(oddIndexedMessage.length());k++)
        {
            decrypt_two.setCharAt((2*k)+1, decryptMessage2.charAt(k) );
        }

        System.out.println("The first key is "+key1+"\n"+"The second Key is: "+ key2);
        System.out.println("The message decrypted with two keys :"+"\n" + decrypt_two.toString());
        return decrypt_two.toString();


    }

    public String halfOfString(String message, int start)
    {
        String result = new String();
        for (int k = start; k< message.length();k = k+2)
        {
            result+=message.charAt(k);
        }
        return result;
    }


    public void halfOfStringTest()
    {

        FileResource resource = new FileResource("data/wordsLotsOfEs.txt");
        String message = resource.asString();
        //System.out.println(message);
        System.out.println("half of String starts with 0"+ halfOfString(message, 0));
        System.out.println("half of String starts with 1"+ halfOfString(message, 1));

        CaesarCipher cc = new CaesarCipher();
        String encrypted = cc.encrypt(halfOfString(message, 0), 20);
        String decrypted = decrypt(encrypted,26 - 20);
        System.out.println(encrypted);
        System.out.println(decrypted);

    }


    public void testDecrypt()
    {
        int key = 23;
        FileResource fr = new FileResource("wordsLotsOfEs.txt");
        String message = fr.asString();
        CaesarCipher cc = new CaesarCipher();
        String decrypted = cc.encrypt(message, 26 - key);
        System.out.println("Key is"+ key+"\n"+decrypted);

    }

    public void decryptTwoKeysTest()
    {

        FileResource resource = new FileResource();
        String message = resource.asString();

        String decrypted_message = decryptTwoKeys(message);
        System.out.println(message);
        System.out.println(decrypted_message);
    }
    public static void main(String[] a)
    {
        CaesarBreaker object=new CaesarBreaker();
        object.decryptTwoKeysTest();
    }

}