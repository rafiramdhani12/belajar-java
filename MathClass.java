
import java.util.Random;
import java.util.Scanner;

public class MathClass {

    @SuppressWarnings("ConvertToTryWithResources")
    static void triangle(){
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side x: ");
        x= scanner.nextDouble();
        System.out.println("enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();

    }

    static void random_num(){

        Random random = new Random();

        //! pseudo random this is not true random

        int x = random.nextInt(10); //! parameter disini bisa diisi dengan max value jadi antara 1-10 contoh nya 

        System.out.println("the random number is " + x);


    }




    public static void main(String[] args){

       triangle();
       random_num();

        double x = 3.14;
        double y = 10;

        // double z = Math.max(x,y);
        // double z = Math.min(x,y);
        // double z = Math.abs(y); abs(absolute)
        // double z = Math.sqrt(y); akar pangkat
        double z = Math.round(x);

        System.out.println(z);


    }
}
