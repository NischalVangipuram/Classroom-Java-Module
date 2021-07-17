public class WordPlay {

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u' || ch == 'y')
            return true;
        else if (ch == 'A' || ch =='E' || ch =='I' || ch =='O'|| ch =='U' || ch =='Y')
            return true;
        else
            return false;

    }

    public boolean isVowelA(char ch) {
        if (ch == 'a')
            return true;
        else if (ch == 'A')
            return true;
        else
            return false;

    }

    public String replaceVowels(String phrase, char ch) {

        StringBuilder original = new StringBuilder(phrase);

        for (int i = 0; i < original.length();i++) {
            char currChar = original.charAt(i);
            if (isVowel(currChar))
            {
                original.setCharAt(i, ch);
            }

        }
        return original.toString();
    }

    public String emphasize(String phrase, char ch ){
        StringBuilder tempStringBuilder = new StringBuilder(phrase);

        for (int i = 0; i < tempStringBuilder.length();i++) {
            char currChar = tempStringBuilder.charAt(i);

            if ((currChar == ch) && (i %2 == 0))
            {
                tempStringBuilder.setCharAt(i, '*');
            }

            else if ((currChar == ch) && (i %2 != 0))
            {
                tempStringBuilder.setCharAt(i, '+');
            }

        }
        return tempStringBuilder.toString();
    }

    public void tester () {
        System.out.println("value returned is"+ " " + isVowel('F'));
        System.out.println("value returned is"+ " " + isVowel('a'));
        System.out.println("replace Vowels "+ " " + replaceVowels("Hello World",'*'));
        System.out.println("emphasize example1"+ " " + emphasize("dna ctgaaactga",'a'));
        System.out.println("emphasize example2"+ " " + emphasize("Mary Bella Abracadabra",'a'));
    }
    public static void main(String[] a)
    {
        WordPlay object=new WordPlay();
        object.tester();
    }

}