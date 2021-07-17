import java.util.Scanner;
public class Part1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String dna=sc.next();
        testSimpleGene();

    }
static String findSimpleGene(String dna)
{
    String result="";
     if(dna.contains("ATG"))
     {
         int indexOfATG=dna.indexOf("ATG");
         int indexOfTAA=dna.indexOf("TAA");
         if(dna.contains("TAA") && indexOfATG < indexOfTAA)
         {
             int lengthBetweenAtgAndTaa=indexOfTAA-indexOfATG-1;
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
    String DnaWithNoATG="sadsTAA", DnaWithNoTAA="ATGhjd", DnaWithNoATGandTAA="dsfds", DnaWithATGandTAAandMultipleOf3="ATGhhhTAA", DnaWithATGandTAAandNotMultipleOf3="ATGhhTAA";
    System.out.println(DnaWithNoATG);
    System.out.println(DnaWithNoTAA);
    System.out.println(DnaWithNoATGandTAA);
    System.out.println(DnaWithATGandTAAandMultipleOf3);
    System.out.println(DnaWithATGandTAAandNotMultipleOf3);
}
}
