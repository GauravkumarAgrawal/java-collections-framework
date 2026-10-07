package allcollectionsexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(98);
//        list.add(28);
//        list.add(81); list.add(58); list.add(8);
//        System.out.println(list);
//        System.out.println("============");
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println("=========");
//        Collections.sort(list);
//        System.out.println(list);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Gaurav",42,100000));
        employees.add(new Employee(2,"Shreyas",24,500000));
        employees.add(new Employee(3, "Atharv",8,300000));
        employees.add(new Employee(4, "Agarwal",40,400000));

        //Old traditional way to work
//        Collections.sort(employees,new MySort());
//        System.out.println(employees);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int)(o1.getSalary() - o2.getSalary());
//            }
//        });
        System.out.println("============ Lambda====================");
        System.out.println("============ ==========sort salary====================");
        Collections.sort(employees,(o1,o2) ->(int) (o1.getSalary()-o2.getSalary()));
        System.out.println(employees);

        System.out.println("=========================sort age=======================");
        Collections.sort(employees,(o3,o4)->(int)(o3.getAge() - o4.getAge()));
        System.out.println(employees);

        System.out.println("============ sort name===============================");
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println(employees);

        System.out.println("============ sort name another way ====================");
        Collections.sort(employees, (e1,e2)->e1.getName().compareTo(e2.getName()));
        System.out.println(employees);
    }

}

//Old way to use comparator
//class MySort implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int)(o1.getSalary() - o2.getSalary());
//    }
//}
