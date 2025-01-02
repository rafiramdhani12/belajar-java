public class TryMethods {

    static int Add(int x , int y){
        int z = x + y;
        return z;
    }

    static void Opeartor(){

        int x = 3;
        int y = 4;

        int z = Add(x,y);

        System.out.println("the result is = " + z);


    }



    public static void main(String[] args){

        Opeartor();

    }
}
