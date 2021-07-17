package Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Assignment12 {
    public void printAllDepartments(ArrayList<Student> al){
        al.stream().map(student-> student.engDepartment).distinct().forEach(x->System.out.println(x));
    }

    public void studentsEnrolledAfter2018(ArrayList<Student> al, int year){
        al.stream().filter(student->student.yearOfEnrollment > year).map(student->student.name).forEach(System.out::println);
    }

    public void maleStudentsInDepartment(ArrayList<Student> al, String department){
        al.stream().filter(student -> student.gender.equals("Male")).filter(student -> student.engDepartment.equals(department)).forEach(System.out::println);
    }


    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        al.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        al.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        al.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        al.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        al.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        al.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        al.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        al.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        al.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        al.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        al.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        al.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        al.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        al.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        al.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        al.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        Assignment12 obj = new Assignment12();
        System.out.println("Names of all Departments in the College : ");
        obj.printAllDepartments(al);
        System.out.println("Students enrolled after 2018 are : ");
        obj.studentsEnrolledAfter2018(al, 2018);
        System.out.println("Details of Male Students in Computer Science Department");
        obj.maleStudentsInDepartment(al, "Computer Science");
    }
}