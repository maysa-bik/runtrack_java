package Jour01.job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 10; // Declare num1 with an initial value
        int num2 = 20; // Declare num2 with an initial value

        System.out.println("La valuer de num1 est " + num1 + " et la valuer de num2 est " + num2);
    
        // Swap values
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("La valuer de num1 est " + num1 + "et la valuer de num2 est " + num2);
    }
}


