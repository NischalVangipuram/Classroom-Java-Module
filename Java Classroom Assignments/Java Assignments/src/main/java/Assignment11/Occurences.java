package Assignment11;
import java.io.*;
import java.util.HashMap;
public class Occurences
{
    public void characterCount(File file) throws IOException {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c = 0;
        while((c = bufferedReader.read()) != -1)
        {
            char ch = (char) c;
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }
            else
            {
                hm.put(ch,hm.get(ch)+1);
            }
        }
        FileWriter fileWriter = new FileWriter("/home/nischv/Desktop/Java Assignments/src/main/java/Assignment11/Output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(Character ch : hm.keySet()){
            bufferedWriter.append(String.valueOf(ch)).append(": ").append(String.valueOf(hm.get(ch)));
            bufferedWriter.append("\n");
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        //String filepath=args[0];
        File file = new File("/home/nischv/Desktop/Java Assignments/src/main/java/Assignment11/Test.txt");
        Occurences lc = new Occurences();
        lc.characterCount(file);
    }
}

