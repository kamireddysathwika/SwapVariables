public class SwapVariables {
public static void main(String[] args) {
        // Declare and initialize two variables
        int a = 10;
        int b = 20;

        // Print the original values
        System.out.println("Before swap:");
        System.out.println("a =  "+ a);
        System.out.println("b =  "+ b);

        // Use a third variable to swap values
        int temp = a;
        a = temp;
        b = temp;

        // Print the swapped values
        System.out.println("\nAfter swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
 
