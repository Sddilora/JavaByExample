public class Animal {
    public static void main(String[] args) {
        doStuff();
    }

    public static String itIsADog() {
        return "It is a dog";
    }

    public static void doStuff() {
        int a = 5;
        // if statement
        if (a == 0) {
            System.out.println(a);
        } else if (a == 1) {
            System.out.println(a);
        } else {
            System.out.println(a);
        }

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loop
        a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
        }

        // try-catch
        try {

        } catch (Exception e) {

        }
    }
}
