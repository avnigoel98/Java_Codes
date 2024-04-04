public class hello{
    public static void main(String [] args){
       double savings = 10;
       double expenses = 5;

        if (savings > expenses){
            System.out.println("Solvent");
            savings = savings - expenses;
            expenses = 0;
            System.out.println(savings);
            System.out.println(expenses);
            
        }
        else {
            System.out.println("Bankrupt");
        }
       
    }

}

// this or that
// if its raining -> i will  not go to college
// else -> i will definately go 

        // int score = 100;                           
        // if ( score > 100){
        //     System.out.println("High");
        // }
        // else if (score == 100){
        //     System.out.println("equal");
        // }
        // else if (score == 50){
        //     System.out.println("abcd");
        // }
        // else if (score == 150){
        //     System.out.println("defg");
        // }
        // else {
        //     System.out.println("Low");
        // }



        //  int number = 5;
        // // way - 1
        // // if (number > 0){
        // //     System.out.println("Postive")
        // // }
        // // else{
        // //     System.out.println("Not Postive")
        // // }

        // // way - 2 
        // // if (number > 0){
        // //     System.out.println("Postive")
        // // }
        // // else if (number == 0){
        // //     System.out.println("Not Postive")
        // // }
        // // else {
        // //     System.out.println("Not Postive")
        // // }
    
        // // way - 3
        // if (number <= 0){
        //     System.out.println("Not Postive")
        // }
        // else {
        //     System.out.println("Postive")
        // }