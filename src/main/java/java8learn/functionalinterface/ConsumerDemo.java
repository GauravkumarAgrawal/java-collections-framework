package java8learn.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {
    public static void main(String[] args) {

        Function<Students,String> s = s1-> {
            int marks = s1.marks;
            String grades = "";
            if (marks >= 80) grades = "A[Distinction]";
            else if (marks > 60) grades = "B[First Class]";
            else if (marks > 55) grades = "C[Pass]";
            else grades= "F[Fail]";
            return grades;
        };
        Predicate<Students> p1 = sm-> sm.marks>90;

        Consumer<Students> c = sm1->{
            System.out.println("student Name: "+sm1.name);
            System.out.println("student Marks: "+sm1.marks);
            System.out.println("student Grade: "+s.apply(sm1));
            System.out.println(" ");

        };
        Students []st = {
                new Students("Gaurav",97),
                new Students("Agrawal",65),
                new Students("Kumar",40)
        };
//        for(Students s2:st){
//            if(p1.test(s2))
//            {
//                System.out.println("student Name: "+s2.name);
//                System.out.println("student Marks: "+s2.marks);
//                System.out.println("student Grade: "+s.apply(s2));
//                System.out.println(" ");
//            }
//        }

        for(Students s3 :st){
            if(p1.test(s3))
            c.accept(s3);
        }

//        System.out.println("====#####=========");
//        Function<Integer, Integer> g1 = z1->2*z1;
//        Function<Integer, Integer> g2 = z1->z1*z1*z1;
//        System.out.println(g1.andThen(g2).apply(4));
//        System.out.println(g1.compose(g2).apply(4));



    }
}

//===================
class Students{
    String name;
    int marks;

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

