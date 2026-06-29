import java.util.Scanner;

public class Object_making {
    public static void main(String[] args)
    {
        //object creation
        Student s1=new Student();
        Scanner s=new Scanner(System.in);
        //calling and initializing object
s1.name="himanshu singh";
s1.rollno=21;
        System.out.println("enter cgpa");
s1.cgpa=s.nextDouble();
//objects are real world entity
        //class are blueprint
        //obj are real entity
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.cgpa);
    }

    private  static class Student {
          int rollno;
          String name;
          double cgpa;
      }
}

