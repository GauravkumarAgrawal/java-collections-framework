package programs;

public class PyramidDemo {
    public static void main(String[] args) {
//        int x=0;
//        for(int i = 1; i<=5; i++){
//            x= i-1;
//            for(int j = i; j<=5;j++) {
//                // First Number Space
//                System.out.print(" ");
//
//                // Space between Numbers
//                System.out.print("  ");
//            }// Pyramid printing
//            for (int j = 0; j <= x; j++)
//                System.out.print((i + j) < 10
//                        ? (i + j) + "  "
//                        : (i + j) + " ");
//
//            for (int j = 1; j <= x; j++)
//                System.out.print((i + x - j) < 10
//                        ? (i + x - j) + "  "
//                        : (i + x - j) + " ");
//            System.out.println();
//        }

        for(int i = 0; i<5; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }

    }
}
