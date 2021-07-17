public class Part3 {
 public static void main(String[] a) {
  if (twoOccurrences("a", "banana")) {
   System.out.println("True");
  } else {
   System.out.println("False");
  }
 }

 static boolean twoOccurrences(String a, String b)
 {
  int i, j;
  int countOfOccurences = 0;
  for (i = a.length(); i < b.length(); i++) {
   if (a.contains(b.substring(i - a.length(), i))) {
    countOfOccurences++;
   }
  }
   if (countOfOccurences >= 2) {
    return true;
   }
   return false;
  }
 }

