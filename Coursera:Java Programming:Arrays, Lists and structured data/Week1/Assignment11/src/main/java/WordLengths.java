import java.lang.*;
import edu.duke.*;
public class WordLengths {


    public void countWordLengths(FileResource file, int[] counts)
    {

        for (String word : file.words()){
            int Wordlength = word.length();
            for (int i=0; i<word.length();i++)
            {
                char currChar = word.charAt(i);
                if ( (i==word.length()-1) || (i==0))
                {
                    if (!Character.isLetter(currChar)) Wordlength--;
                }
            }
            counts[Wordlength]++;
            System.out.println(" Words of length "+ Wordlength +" "+ word);
        }

    }


    public void indexOfMax(int[] values) {

        int max = 0;
        int position = 0;
        for (int i = 0; i <values.length;i++)
        {
            if (values[i] > max)
            {
                max = values[i];
                position = i;
            }
        }

        System.out.println("The most common word is :"+ position);

    }


    void testCountWordLengths(){
        int [] counts = new int[31];
        FileResource file = new FileResource();

        countWordLengths(file,counts);
        indexOfMax(counts);
    }
    public static  void main(String[] a)
    {
     WordLengths object=new WordLengths();
     object.testCountWordLengths();
    }
}
                                     