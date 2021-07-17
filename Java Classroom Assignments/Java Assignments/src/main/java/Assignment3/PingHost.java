package Assignment3;

import java.io.*;
import java.util.*;
import java.lang.Process;
//ping   ProcessBuilder  ping -c 10 www.google.com
class PingHost
{

    public static long findMedian(ArrayList<Long> al)
  {

    Collections.sort(al);
    int len=al.size();
    if(len%2==0)
    {
      int fMid = len/2;
      int sMid = fMid-1;

      long sum=(al.get(fMid)+al.get(sMid))/2;
      return sum;

    }
    return al.get(len/2);

  }

  public static ArrayList<Long> ping(String hostName,int times)
              throws IOException
  {
    String[] pingIt={"ping",hostName};
    long start =0;
    long end=0;
    ArrayList<Long> quantas =new ArrayList<Long>();
    ProcessBuilder pcb;
    try
    {
      for(int i=0;i<times;i++)
      {
      start=System.currentTimeMillis();
      pcb=new ProcessBuilder(pingIt);
      end=System.currentTimeMillis();
      quantas.add(end-start);

      System.out.println(end-start);
      }
    }

    catch(Exception e)
    {
      e.printStackTrace();
    }

    return quantas;
  }


    public static void pingHost(String command,int epochs) {
        int count = 0, i = 0,epochCount=0;
        double[] timesArray = new double[10];
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = bufferedReader.readLine()) != null && epochCount<10)
            {
                System.out.println(s);
                int index1 = s.lastIndexOf("=");
                int index2 = s.lastIndexOf("ms");
                if(index1 != -1 && index2 != -1 && count < 10){
                    count++;
                    double time = Double.parseDouble(s.substring(index1+1,index2-1));
                    timesArray[i++] = time;
                    epochCount++;
                }
            }
            Arrays.sort(timesArray);
            System.out.println("Median Time to ping : "+(timesArray[4] + timesArray[5])/2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
            throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String hostName=sc.next();
        int epochs=sc.nextInt();
        pingHost("ping "+hostName,epochs);

    int times=sc.nextInt();
    ArrayList<Long> timeList = ping(hostName,times);
    System.out.println("median time to ping a host is: "+findMedian(timeList));


    }
}