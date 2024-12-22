public class Main {
    public static void main(String[] args){

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
    }
}

// ! javac Main.java (kompilasi file java)
// ! java Main (jalankan file java)