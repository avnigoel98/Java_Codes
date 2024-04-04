import java.util.Scanner;

public class hw2 {
    public static void main (String [] args){
        runProgram1();
        runProgram2();
    }


    public static void runProgram1(){
        System.out.println("Mario Board 1: ");
        segment1();
        segment2();
        segment2();
        segment1();
        segment3();
        System.out.println("||");
        System.out.println("|----------------");
        
    }
    public static void runProgram2(){
        // System.out.println("Mario Board 2: ");
        // segment1();
        // segment2();
        // segment2();
        // segment2();
        // segment1();
        // segment3();
        // System.out.println("||");
        // System.out.println("|----------------");
        Scanner scn = new Scanner(System.in);

        System.out.println("What does Mario Look Like?");
        String mario = scn.nextLine();
        System.out.println("What does a Coin look like?");
        String coin = scn.nextLine();
        System.out.println("Here is your level ...");
        segment1();
        segment2();
        segment2();
        segment1();
        segment3();
        placeMarioAndCoins(mario,coin);
        System.out.println("||");
        System.out.println("|----------------");


        
    }


    public static void segment1(){
        // Segment 1
        System.out.println("||");
        System.out.println("||");
        System.out.println("||");
        System.out.println("||");
        System.out.println("||");
        System.out.println("||");
    }

    public static void segment2(){
        // segment 2
        System.out.println("||");
        System.out.println("|| |?|");
        System.out.println("||");
        System.out.println("||");
        System.out.println("|| |?|");
        System.out.println("||");
    }

    public static void segment3(){
       System.out.println("||");
        System.out.println("||||");
        System.out.println("||||||");
        System.out.println("||||||||");
        System.out.println("||||||||||");
       

    }

    public static void placeMarioAndCoins(String mario, String coin){
        System.out.println("||" + mario);
        System.out.println("||" + coin);
        System.out.println("||" + coin);
        System.out.println("||" + coin);
        System.out.println("||");
        System.out.println("||||");
        System.out.println("||||||");
        System.out.println("||||||||");
        System.out.println("||||||||||");


    }
}