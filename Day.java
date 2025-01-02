public class Day {
    public static void main(String[] args) {
        String day = "friday";

        switch(day){ //! ini adalah rule switch rekomendasi terbaru menulis block switch case
            case "sunday" -> System.out.println("it is sunday");
            case "monday" -> System.out.println("it is monday");
            case "tuesday" -> System.out.println("it is tuesday");
            case "wednesday" -> System.out.println("it is wednesday");
            case "thursday" -> System.out.println("it is thursday");
            case "friday" -> System.out.println("it is friday");
            case "saturday" -> System.out.println("it is saturday");
            default -> System.out.println("that is not a day");
        }


    }
}
