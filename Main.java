
import java.util.Scanner;

public class Main {

    public void basic(){
        long x = 123456789; //! harus menggunakan long jika value nya panjang int hanya bisa menampung bbrp
        float y = 3.14f; //! harus diberi f (casting) / (float) angka
        boolean z =  true;
        char symbol = '@';
        String name = "ambatukam";


        System.out.println("my number is " + x);
        System.out.println("my number is " + y);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println("hello my name is " + name);
    };

    public void swap(){
        String x = "water";
        String y = "kool-aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " +x);
        System.out.println("y: " +y);

    }

    @SuppressWarnings("resource")
    public void input_user(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name ? ");
        String name = scanner.nextLine();

        int age = 0;
        try {
            System.out.println("how old are you ? ");
            age = scanner.nextInt();

                if (age < 0 || age > 120){
                    System.out.println("The age must be a valid number between 0 and 120. Please try again.");
                }
        } catch (Exception e) {
            System.out.println("invalid input please enter a valid number of your age");
            scanner.nextLine();
        }
        
        scanner.nextLine(); //! membersihkan buffer setelah nextInt()

        System.out.println("what is your favorite food ? ");
        String food = scanner.nextLine();

        System.out.println("hello " + name);
        System.out.println("you age " +age+ " years old");
        System.out.println("you like " +food);

    }

    public void test(){
        int friends = 10;

        friends ++;

        System.out.println(friends);
    }



    public static void main(String[] args){

        //! membuat object untuk memanggil method non-static
        Main obj = new Main();

        // obj.basic();
        // obj.swap();
        obj.input_user();

    }
}

// ! javac Main.java (kompilasi file java)
// ! java Main (jalankan file java)
