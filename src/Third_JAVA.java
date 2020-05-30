import java.util.Scanner;

public class Third_JAVA {
    public static void main(String[] args) {
        //Print out Two Input Numbers:

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first number! ");
        int first_number = number.nextInt();
        System.out.println("The first_number is : " + first_number);
        System.out.println("Enter the second number! ");
        short second_number = number.nextShort();
        System.out.println("The second_number is : " + second_number);

//Finding the Area and the Perimeter of a circle:

        System.out.println("Enter the radius! ");
        int radius_number = number.nextInt();
        System.out.println("The radius is: " + radius_number);
        System.out.println("Area of circle is : " + (Math.PI * Math.pow(radius_number,2)));
        System.out.println("Perimeter of a circle is : " + (2 * Math.PI * radius_number));



    }
}
