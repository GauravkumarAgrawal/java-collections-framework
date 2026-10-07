package java8learn.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

interface Inter{
    public abstract void ma();
}

interface Inter1{
    public abstract void sum(int a, int b);
}

interface Addition{

}

public class LambdaDemo {
    public static void main(String[] args) {
      Inter i =   () -> System.out.println("hello ... ");
      i.ma();

      Inter1 s= (a,b) -> System.out.println(a+b);
      s.sum(33,66);
      s.sum(66,33);

       // (a,b)-> System.out.println(a+b);

        Function<Integer,Integer> f = j->j*j;
        System.out.println(f.apply(4));

        Predicate<Integer> p =k->k%2==0;
        System.out.println(p.test(80));
    }


}
