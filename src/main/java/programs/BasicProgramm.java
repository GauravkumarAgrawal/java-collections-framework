package programs;

public class BasicProgramm {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;

//        System.out.println("i "+i);
//        System.out.println("j "+j);

        int l = 1;
        int k = ++l;

//        System.out.println("l "+l);
//        System.out.println("k "+k);

        String lang = "xXGauravxXAgrawalxxXKumarxX";
        String []size = lang.split("xX");
        for(String s :size){
            System.out.println(s);
        }

        System.out.println(size[1] + ":"+ size[1].length());
    }
}
