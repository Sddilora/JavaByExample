public class Loops {
    public static void main(String[] args) {
        // forLoop();
        // whileLoop();
        doWhileLoop();
    }

    public static void forLoop(){
        for(int i = 0 ; i <= 5 ; i++){
            System.out.println(i);
        }

        int numbers[] = {6,8,9,7,6,2};
        int sum = 0;
        for(int index = 0;index<numbers.length;index++) {
            sum += numbers[index];
        }

        // Another for loop usage for Arrays
        for (int num : numbers) {
            System.out.println("num: "+num);
        }

        System.out.println("sum: "+sum);

        int number = 5;
        for(int multiplier = 1 ; multiplier < 10 ; multiplier++){
            System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
            
        }

        System.out.println("///////////////////////////////////////////");

        // Nested for loops
        for ( int number2 = 1 ; number2 < 10 ; number2++) {
            for ( int multiplier2 = 1 ; multiplier2 <= 10 ; multiplier2++){
                System.out.printf("%d X %d = %d \n", number2, multiplier2, number2 * multiplier2);
            }
        }

    }

    // The difference between while and do while is that do while execute the loop body first and then check the condition
    // while loop check the condition first and then execute the loop body

    public static void whileLoop(){
        int number = 3;
        int multiplier = 1;

        while(multiplier <= 10) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
            multiplier++;
        }
    }

    public static void doWhileLoop(){
        int multiplier = 1;
        do {
            System.out.println("Hello World "+multiplier);
            multiplier++;
        } while (multiplier <= 10);
    }
}
