import java.util.Scanner;

public class IT24100756Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else if (newMembers == 0) {
            System.out.println("Prize is: No Prize");
        } else if (newMembers == 1) {
            System.out.println("Prize is: Pen");
        } else if (newMembers == 2) {
            System.out.println("Prize is: Umbrella");
        } else if (newMembers == 3) {
            System.out.println("Prize is: Bag");
        } else if (newMembers == 4) {
            System.out.println("Prize is: Travelling Chair");
        } else if (newMembers >= 5) {
            System.out.println("Prize is: Headphone");
       }
   }
}
