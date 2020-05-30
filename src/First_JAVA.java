
import java.util.Scanner;

public class First_JAVA {
    public static void main(String[] args) {



//        primitive data type
        byte b = 10;
        short sh= 20;
        int integer = 30;
        long l = 1000000000000L;

        boolean boo = true;
        char ch = 'A';

// float
        float f = 10.99f;
        double d = 20.99;

//widening casting (smaller to larger)
        byte x = 20;
        int i = x;
        System.out.println(b);
//  narrowing casting( larger to smaller)
        int y = 250;
        short sh1 = (short) y;
        System.out.println(sh);



//        syntax for declare var
//        datatype name_var = value;
//none-primitive data type or reference data type
        String my_string = "Hello";
//primitive datatype
        int B;
        B=100;
        int A = 55;
        float F = 19.90f;
        double D = 233.4;
        char c = 'S';
        boolean B1 = false;
        System.out.println("hello");



//        declare a constant
        final int age = 30;


//        string concatenation
        System.out.println("hello" + "babe");
        String s1 = "bye";
        String s2 = "babe";
        System.out.println((s1 + s2));



//        declare multiple var that have the same data type
//        lowerCamelCase
        int totalExpense = 300;







        int num1 = 74;
        int num2 = 36;
        System.out.println(num1 + num2);
        System.out.println(50/3);

//        to taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s number: ");
        int num = sc.nextInt();
        System.out.println("Entered a number: "+num);



    }
}

