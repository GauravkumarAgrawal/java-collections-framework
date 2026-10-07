package java8learn.functionalinterface;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.function.Predicate;

//for condition check happily use Predicate
public class PredicateDemo {
    public static void main(String[] args) {
        int a[] ={15,26,3,41,53,62,7,8,96,10};
        String s = "sdfghjkl";
        String []g = {"gaurac","haba","jabav","aabaaba","dabb","chabba"};
        System.out.println("==============================================");
        //String length more than 5
        Predicate<String> p1 = s1-> s1.length()>5 ;
        System.out.println(p1.test(s));

        System.out.println("==============================================");
        //Array lenght more than 5
        Predicate<int[]> p2 = s2-> s2.length>5 ;
       System.out.println(p2.test(a));

        System.out.println("==============================================");
        //even or odd
        Predicate<Integer> p3 = s3-> s3%2==0 ;
       System.out.println(p3.test(9));

       System.out.println("==============================================");
        //Print all length more than 5
        Predicate<String>p4 = s4-> s4.length()>6;
        for(String str :g){
            if(p4.test(str)){
                System.out.println(str);
            }
        }

        System.out.println("==============================================");
        //Print all string length even
        Predicate<String>p5 = s5-> s5.length() %2==0;
        for(String str :g){
            if(p5.test(str)){
                System.out.println(str);
            }
        }

        System.out.println("==============================================");
        ArrayList<Employee> l = new ArrayList<Employee>();
        l.add(new Employee("aaaa",1111));
        l.add(new Employee("bbbb",1280));
        l.add(new Employee("cccc",1400));
        l.add(new Employee("dddd",1890));
        l.add(new Employee("eeee",2000));

        Predicate<Employee> p6 = e -> e.salary>1500;
        for(Employee e1 :l){
            if(p6.test(e1)){
                System.out.println(e1.salary);
            }
        }

        System.out.println("==============================================");
        Predicate<Integer>p7 = i->i%2==0;
        Predicate<Integer>p8 = i-> i>90;
        System.out.println(" Number even and grater than 5 ");
            for(int x1 : a){
                if(p7.and(p8).test(x1)){
                    System.out.println(x1);
                }
            }
    }
}
//=============================================
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
