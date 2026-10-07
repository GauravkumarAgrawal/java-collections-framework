package java8learn.functionalinterface;

import java.sql.Time;
import java.util.Date;
import java.util.function.Supplier;

public class SuppierDemo {
    public static void main(String[] args) {
        Supplier<Date> d = ()->new Date();
        System.out.println(d.get());

        Supplier<Time> r = ()->new Time(1);
        System.out.println(r.get());

        //OTP logic
        Supplier<String> s = ()->{
            String otp ="";
            for(int i = 0; i<=5;i++){
                otp = otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}
