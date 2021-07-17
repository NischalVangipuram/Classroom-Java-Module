import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class assignment4
{
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        Date startDate, endDate;
        for(i=0;i<n;i++)
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            String signUp=sc.next();
            String presentDay=sc.next();

            Date signUpDate = dateFormat.parse(signUp);
            Date currentDate = dateFormat.parse(presentDay);

            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(signUpDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(currentDate);

            if (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)) {
                System.out.println("No dates range");
            } else {
                calendar1.add(Calendar.DATE, -30);
                calendar1.set(Calendar.YEAR, calendar2.get(Calendar.YEAR));
                startDate = calendar1.getTime();
                calendar1.add(Calendar.DATE, 60);
                endDate = calendar1.getTime();
                if (currentDate.after(endDate)) {
                    System.out.println(dateFormat.format(startDate) + " " + dateFormat.format(endDate));
                } else {
                    System.out.println(dateFormat.format(startDate) + " " + dateFormat.format(currentDate));
                }
            }
        }
        sc.close();
    }
}
