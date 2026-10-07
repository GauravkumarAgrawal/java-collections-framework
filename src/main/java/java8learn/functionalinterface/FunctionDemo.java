package java8learn.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<Integer,Integer> f = i -> i*i;
        System.out.println(f.apply(5));

        Function<String,Integer> f1 = i -> i.length();
        System.out.println(f1.apply("GAuRAV"));

        Function<String,String> f2 = i -> i.toUpperCase();
        System.out.println(f2.apply("gaurav"));

        Function<Student,String> s = s1-> {
            int marks = s1.marks;
            String grades = "";
            if (marks >= 80) grades = "A[Dictintion]";
            else if (marks > 60) grades = "B[First Class]";
            else if (marks > 55) grades = "C[Pass]";
            else grades= "F[Fail]";
            return grades;
        };
        Predicate<Student> p1 = sm->sm.marks>90;
        Student []st = {
                new Student("gaurav",97),
                new Student("agrawal",65),
                new Student("kumar",40)
        };
        for(Student s2:st){
            if(p1.test(s2))
            {
                System.out.println("student Name: "+s2.name);
                System.out.println("student Marks: "+s2.marks);
                System.out.println("student Grade: "+s.apply(s2));
                System.out.println(" ");
            }
        }

        System.out.println("====#####=========");
        Function<Integer, Integer> g1 = z1->2*z1;
        Function<Integer, Integer> g2 = z1->z1*z1*z1;
        System.out.println(g1.andThen(g2).apply(4));
        System.out.println(g1.compose(g2).apply(4));



    }
}

//===================
class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}