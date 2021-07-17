import edu.duke.*;

public class TestCaesarCipher {

    public void simpleTests() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        CaesarCipher2 cc = new CaesarCipher2(18);
        String encrypted = cc.encrypt(message);
        System.out.println("The encryption result is "+ encrypted);
        String decrypted = cc.decrypt(encrypted);
        System.out.println("The decryption outcome is "+ decrypted);

    }

        private int maxIndex(int[] values) {
        int max = 0;
        int position = 0;
        //int maxDex = 0;
        for (int i = 0; i <values.length;i++) {
            if (values[i] > max)
            {
                max = values[i];
                position = i;
                //maxDex = i;
            }
        }
        System.out.println("Index position of Maximum value in an array is :"+ position);
        return position;
    }

    private int[] countLetters(String message) {

        String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for (int k = 0; k < message.length();k++) {
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex!=-1){
                counts[dex]+=1;
            }
        }
        return counts;
    }
    public static void main(String[] args)
    {
        TestCaesarCipher c=new TestCaesarCipher();
        c.simpleTests();
    }

}