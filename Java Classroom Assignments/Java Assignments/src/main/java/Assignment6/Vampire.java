package Assignment6;

import java.util.Arrays;

public class Vampire
{
    private static int numDigits(long num)
    {
        return Long.toString(Math.abs(num)).length();

        // alternate solution

        /*int sum=0;
        while(num>0)
        {
            sum++;
            num/=10;
        }
        return sum;*/

    }

    private static boolean fangCheck(long orig, long fang1, long fang2)
    {
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")){
            return false;
        }

        int origLen = numDigits(orig);
        if(numDigits(fang1) != origLen / 2 || numDigits(fang2) != origLen / 2) {
            return false;
        }
        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }

    public void printVampireNumber(){
        int count = 0;
        for (long i = 10; count <= 100; i++) {
            if ((numDigits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long fang1=2;fang1<=Math.sqrt(i)+1;fang1++) {
                if (i % fang1 == 0){
                    long fang2 = i / fang1;
                    if (fangCheck(i, fang1, fang2) && fang1 <= fang2) {
                        System.out.println(i + ": [" + fang1 + ", " + fang2 + "]");
                        count += 1;
                    }
                }
            }
        }
    }
}