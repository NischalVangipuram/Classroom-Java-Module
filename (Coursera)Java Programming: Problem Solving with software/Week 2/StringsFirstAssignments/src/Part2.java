import java.util.Scanner;

public class Part2 {
    String startCodon,stopCodon;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        testSimpleGene();
    }
     static String findSimpleGene(String dna, String startCodon, String stopCodon)
    {
        String result="";
        Part2 object= new Part2();
        object.startCodon=startCodon;
        object.stopCodon=stopCodon;
        object.caseConvertLikeDna(dna);
        startCodon= object.startCodon;
        stopCodon=object.stopCodon;
        if(dna.contains(startCodon))
        {
            int indexOfATG=dna.indexOf(startCodon);
            int indexOfTAA=dna.indexOf(stopCodon);
            if(dna.contains(stopCodon) && indexOfATG < indexOfTAA)
            {
                int lengthBetweenAtgAndTaa=indexOfTAA-(indexOfATG+startCodon.length()-1)-1;
                if(lengthBetweenAtgAndTaa % 3==0)
                {
                    for(int i=indexOfATG;i<=indexOfTAA+2;i++)
                    {
                        result+=dna.charAt(i);
                    }

                }
            }
        }
        return result;
    }
    static void testSimpleGene()
    {

        String DnaWithNoATG="sadstaa", DnaWithNoTAA="ATGHHH", DnaWithNoATGandTAA="dsfds", DnaWithATGandTAAandMultipleOf3="ATGJJJTAA", DnaWithATGandTAAandNotMultipleOf3="ATGHHTAA";
        System.out.println(findSimpleGene(DnaWithNoATG,"ATG","TAA"));
        System.out.println(findSimpleGene(DnaWithNoTAA,"ATG","TAA"));
        System.out.println(findSimpleGene(DnaWithNoATGandTAA,"ATG","TAA"));
        System.out.println(findSimpleGene(DnaWithATGandTAAandMultipleOf3,"ATG","TAA"));
        System.out.println(findSimpleGene(DnaWithATGandTAAandNotMultipleOf3,"ATG","TAA"));
    }
    public void caseConvertLikeDna(String string)
    {
        int flag=1;
        for(int i=0;i<string.length();i++)
        {
            if(!(Character.isUpperCase(string.charAt(i))))
            {
                flag=0;break;
            }
        }
     if(flag==0)
     {
         startCodon=startCodon.toLowerCase();
         stopCodon=stopCodon.toLowerCase();
     }
     else
     {
         startCodon=startCodon.toUpperCase();
         stopCodon=stopCodon.toUpperCase();

     }

    }


}
