
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    
    Scanner scanner = new Scanner(System.in);

    public void ForEAch(){

        // String[] Animals =  {"cat","dog","bird","rat"};
        ArrayList<String> Animals = new ArrayList<>();

        Animals.add("cat");
        Animals.add("dog");
        Animals.add("bird");
        Animals.add("rat");

        for(String i : Animals){  //! jatuhnya loop untuk mapping bisa juga digunakan untuk arraylist
            System.out.println(i);
        }


    }

    public void WhileLoops(){
        String name = "";

        while(name.isBlank()){
            System.out.print("enter ur name : ");
            name = scanner.nextLine();
        }

        System.out.println("hello " + name);

    }

    public void ForLoops(){
        for(int i=10; i>=0; i-- ){
            System.out.println(i);
        }
        System.out.println("ambatukam");
    }

    public void NestedLoop(){
        int rows ;
        int columns;
        String symbol = "";

        System.out.println("enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("enter # of columns: ");
        columns =  scanner.nextInt();
        System.out.println("enter symbol to use: ");
        symbol = scanner.next();

        for(int i =1; i<=rows; i++){
            System.out.println();
            for(int j=1 ; j<=columns;j++){
                System.out.print(symbol);
            }
        }

    }

    public void CountDown(){
        LocalDateTime newYear = LocalDateTime.of(2025, 1,1,0,0);

        while (true) { 
            // ! waktu saat ini
            LocalDateTime now = LocalDateTime.now();

            // ! hitung selisih waktu
            long hours = ChronoUnit.HOURS.between(now, newYear);
            long minutes =  ChronoUnit.MINUTES.between(now, newYear) % 60;
            long seconds = ChronoUnit.SECONDS.between(now, newYear) % 60;

            // ! jika waktu sudah mencapai tahun baru

            if (now.isAfter(newYear) || now.isEqual(newYear)){
                System.out.println("selamat tahun baru ! ");
                break;
            }

            // ! tampilkan countdown
            System.out.printf("Waktu mundur menuju tahun baru: %02d:%02d:%02d\r", hours, minutes, seconds);

            // ! tunggu 1 detik sebelum update
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("timer terhenti");
                break;
            }
            
        }
    }




    public static void main(String[] args){
        Loops obj = new Loops();

        obj.CountDown();

        // obj.WhileLoops();
        // obj.ForLoops();
        // obj.NestedLoop();
    }
}
