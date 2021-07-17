public class Part3 {

    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int indexOfStopCodon = 0;
        while(true)
        {
            indexOfStopCodon = dna.indexOf(stopCodon, startIndex + 3);
            if (indexOfStopCodon == -1 || (indexOfStopCodon - startIndex) % 3 == 0)
            {
                break;
            }
            startIndex += 3;
        }
        if (indexOfStopCodon != -1) {
            return indexOfStopCodon;
        } else {
            return dna.length();
        }
    }

    public String findGene(String dna, int start) {
        final String startCodon = "ATG";
        int startIndex = dna.indexOf(startCodon, start);

        if (startIndex == -1)
        {
            return "";
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));

        if (minIndex == dna.length()) {
            return "";
        } else {
            return dna.substring(startIndex, minIndex + 3);
        }
    }

    public int countGenes(String dna) {
        int start = 0;
        int NoOfGene= 0;
        while (true)
        {
            String gene = findGene(dna, start);
            if (gene.isEmpty())
            {
                break;
            }
            NoOfGene++;
            start = dna.indexOf(gene, start) + gene.length();
        }
        return NoOfGene;
    }

    public void testCountGenes() {
        String dna = "ATGTAAGATGCCCTAGT";
        System.out.println("No of Gene on: " + dna + " = " + countGenes(dna));
    }
public static void main(String[] a)
{
   Part3 object=new Part3();
   object.testCountGenes();
}
}
