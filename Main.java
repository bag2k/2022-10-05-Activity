import java.util.Scanner;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        List<Student> student = new ArrayList<Student>();

        String firstname, Secondname;
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.println("Enter 1st student's name: ");
            firstname = scan.nextLine();
            System.out.println("Enter 2st student's name: ");
            Secondname = scan.nextLine();
            System.out.println("Enter 1st student's age: ");
            int firstage = scan.nextInt();
            System.out.println("Enter 2st student's age: ");
            int Secondage = scan.nextInt();
            
            students.add(new Student(firstname, firstage));
            student.add(new Student(Secondname, Secondage));

              
            System.out.println(students);
            System.out.println(student);

                // System.out.println("My name is " + firstname + ". "+ firstage + " years old");
                // System.out.println("My name is " + Secondname + ". "+ Secondage + " years old");
        }
        catch(Exception e){
            System.out.println("nothing's here");
        }scan.close();
     
    }
}
