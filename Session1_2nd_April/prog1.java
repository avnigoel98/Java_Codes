// functions / Methods -> in code documenation

public class prog1 {

    public static void main (String [] args){
    
        // function calling
        // sum(num1, num2);
        // sum (5, 8);
        // sum (7, 8);
        // sum (1, 2);

        hello (100, 1);
        hello (1000, 1);
        hello(4, 7);
    }

    //methods 
    //function creation
    public static void sum (int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }


    public static void hello (int num1 , int num2){
        if (num1 < num2){
            System.out.println("hello");
        }
        else{
            System.out.println("bye");
        }
    }
}
