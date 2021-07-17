
public class Part1
{
    String[] stopCodons={"TAA”,“TAG”,“TGA"};
    public static void main(String[] args)
    {

    }
    public int findStopCodon(String dna, int startIndex, String stopCodon)
    {
        if(dna.contains("TAA"))
        {
            return dna.indexOf("TAA");
        }
        if(dna.contains("TAG"))
        {
            return dna.indexOf("TAG");
        }
        if(dna.contains("TGA"))
        {
            return dna.indexOf("TGA");
        }
        return dna.length();
    }
    public void testFindStopCodon()
    {
     System.out.println(findStopCodon("ATGJHTAA",0,"TAA"));
    }
}
