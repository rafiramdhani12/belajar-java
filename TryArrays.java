
import java.util.ArrayList;

public class TryArrays {

    static void ArrayList2D(){

        ArrayList<ArrayList<String>> GroceryList = new ArrayList<>();

        ArrayList<String> BakeryList = new ArrayList<>();

        BakeryList.add("pasta");
        BakeryList.add("garlic bread");
        BakeryList.add("donuts");

        ArrayList<String> ProduceList = new ArrayList<>();

        ProduceList.add("tomatoes");
        ProduceList.add("zucchini");
        ProduceList.add("peppers");

        GroceryList.add(BakeryList);
        GroceryList.add(ProduceList);

        System.out.println(GroceryList.get(0).get(1));

    }

    static void TryArrayList(){
        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0,"sushi");
        food.remove(2);
        food.clear();

        for(int i=0 ; i<food.size();i++){
            System.out.println(food.get(i));
        }

    }



    static void Arrays2D(){
        String [][] Cars = {{"camaro" , "corvette"},{ "Tesla" , "BMW"}};

        for (int i = 0 ; i < Cars.length ; i++){
            System.out.println();
            for(int j = 0 ; j<Cars[i].length ; j++){
                System.out.println(Cars[i][j]);
            }
        }
    }

    static void Alternate2D(){
        String [][] Cars = new String[3][3] ; //! its meaning is 3 array 3 element / 3 kolem 3 isi

        Cars[0][0] = "Camaro";
        Cars[0][1] = "Toyota";
        Cars[0][2] = "Lamborgini";

        for(int i = 0 ; i <Cars.length ; i++){
            for(int j = 0 ; j<Cars[i].length; j++){
                System.out.println(Cars[i][j]);
            }
        }

    }
 
    static void Regular(){
        String[] Cars = {"camaro","corvette","Tesla","BMW"};

        for (int i = 0; i<Cars.length; i++) {
            System.out.println(Cars[i]);
        }
 
    }

    static void Alternate(){
        String[] Cars = new String[3];

        Cars[0] = "camaro";
        Cars[1] = "corvette";
        Cars[2] = "tesla";

        for (int i = 0; i<Cars.length; i++) {
            System.out.println(Cars[i]);
        }
 
    }


    public static void main(String[] args){
        
     ArrayList2D();
     Regular();
     TryArrayList();
     Arrays2D();


    }
}
