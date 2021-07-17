import java.io.File;
import java.io.FileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

public class assignment1
{
 public static String pattern="[a-zA-Z]+.java";
 public static FileFilter filter = new RegexFileFilter(pattern);
 public static void main(String[] arg)
 {
  File directory = new File("/home/nischv/Desktop/Java Assignments/src/main");

  File[] files = directory.listFiles();
  System.out.println("All files and directories:");
  displayFiles(files);



  System.out.println("\nFiles that match regular expression: " + pattern);

  File[] files1 = directory.listFiles(filter);
  displayFiles(files1);
  RecursiveFile(files,0,0);

 }
 static void RecursiveFile(File[] arr,int index,int level)
 {
   if(index == arr.length)
   return;

  for (int i = 0; i < level; i++)
   System.out.print("\t");


 if(arr[index].isDirectory())
  {
  // System.out.println("isdir");
   File files[] = arr[index].listFiles(filter);
   displayFiles(files);
   RecursiveFile(arr[index].listFiles(), 0, level + 1);
  }
  RecursiveFile(arr,++index, level);
 }

 public static void displayFiles(File[] files) {
  for (File file : files) {
   System.out.println("Match found: "+file.getName());
  }
 }

}
