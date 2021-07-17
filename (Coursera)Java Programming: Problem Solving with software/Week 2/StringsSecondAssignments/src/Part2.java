public class Part2
{
public static void main(String[] args)
{
    System.out.println(howMany("AA","ATAAAA"));
}
public static int howMany(String a, String b)
{
    int i, j;
    int countOfOccurences = 0;
    for (i = a.length(); i <=b.length(); i++) {
        if (a.equals(b.substring(i - a.length(), i))) {
            countOfOccurences++;
            i+=a.length()-1;
        }
    }
    return countOfOccurences;
}
}
