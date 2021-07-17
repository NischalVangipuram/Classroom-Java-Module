import edu.duke.*;

public class CaesarCipher {

    public String encrypt (String input, int key) {

        StringBuilder encrypted = new StringBuilder (input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String shiftedAlphabet = alphabet.substring(key)+ alphabet.substring(0,key);
        for ( int i = 0; i < encrypted.length();i++){
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx !=-1){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
    }


    public String encrypt_changed(String input, int key) {
        StringBuilder encrypted = new StringBuilder (input);
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = Alphabet.toLowerCase();

        String ShiftedAlphabetsInUpperCase = Alphabet.substring(key)+ Alphabet.substring(0,key);
        String shiftedAlphabetsInLowerCase = alphabet.substring(key)+ alphabet.substring(0,key);

        for (int i = 0; i < encrypted.length();i++){

            char currChar = encrypted.charAt(i);
            if (Character.isLowerCase(currChar)) {

                int idx = alphabet.indexOf(currChar);

                if (idx !=-1){

                    char newChar = shiftedAlphabetsInLowerCase.charAt(idx);

                    encrypted.setCharAt(i,newChar);
                }
            }
                        else {
                int idx = Alphabet.indexOf(currChar);
                if (idx !=-1){
                    char newChar = ShiftedAlphabetsInUpperCase.charAt(idx);
                    encrypted.setCharAt(i,newChar);
                }
            }
        }
        return encrypted.toString();
    }

    public String encryptTwoKeys(String input, int key1, int key2)
    {
        StringBuilder encrypted = new StringBuilder (input);
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String ShiftedAlphabetUpperCase1 = Alphabet.substring(key1)+ Alphabet.substring(0,key1);
        String shiftedAlphabetLowerCase1 = alphabet.substring(key1)+ alphabet.substring(0,key1);
        String ShiftedAlphabetUpperCase2 = Alphabet.substring(key2)+ Alphabet.substring(0,key2);
        String shiftedAlphabetLowerCase2 = alphabet.substring(key2)+ alphabet.substring(0,key2);

        for (int i = 0; i <encrypted.length();i+=2){
            char currChar = encrypted.charAt(i);
            if ((i %2 == 0) && (Character.isLowerCase(currChar))) {
                int idx = alphabet.indexOf(currChar);
                if (idx!= 0)
                {
                   char newChar = shiftedAlphabetLowerCase1.charAt(idx);
                   encrypted.setCharAt(i,newChar);
                }
            }
            else if ((i %2 == 0) && (Character.isUpperCase(currChar)))
            {
                int idx = Alphabet.indexOf(currChar);
                if (idx != 0)
                {
                    char newChar = ShiftedAlphabetUpperCase1.charAt(idx);
                    encrypted.setCharAt(i,newChar);
                }
            }
        }
        for (int i = 1; i <encrypted.length();i+=2){
            char currChar = encrypted.charAt(i);
            if ((i %2 != 0) && (Character.isLowerCase(currChar)))
            {

                int idx = alphabet.indexOf(currChar);

                if (idx != 0)
                {

                    char newChar = shiftedAlphabetLowerCase2.charAt(idx);
                     encrypted.setCharAt(i,newChar);
                }
            }

            else if ((i %2 != 0) && (Character.isUpperCase(currChar))) {

                int idx = Alphabet.indexOf(currChar);

                if (idx != 0)
                {
                    char newChar = ShiftedAlphabetUpperCase2.charAt(idx);
                    encrypted.setCharAt(i,newChar);
                }
            }
        }
        return encrypted.toString();
    }
    public void testCaesar()
    {
        int key = 23;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message,key);
        System.out.println("Key is"+ key+"\n"+encrypted);
    }

    public void encryptTwoKeys()
    {
        int key = 14;
        int key2 = 24;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encryptTwoKeys(message,key,key2);
        System.out.println("Key1 is "+ key + " and Key2 is "+ key2 +"\n"+encrypted);

    }
    public static  void main(String[] a)
    {
       CaesarCipher c=new CaesarCipher();
       c.testCaesar();
       c.encryptTwoKeys();
    }

}