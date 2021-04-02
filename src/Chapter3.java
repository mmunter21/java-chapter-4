import java.util.Scanner;
public class Chapter3 {
    public void milestone1(int num3_1a, int num3_1b) {
        for (int i = num3_1a; i <= num3_1b; i++) {
            if (i > num3_1a && i < num3_1b) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    if (i % num3_1a == 0) {
                    break;
                    }
                }
            }
        }
    }
    
    // Declare the Chapter 3 Milestone 2 method here
    //call a method, don't pass any information into it. Stick all of code into method
    public void  milestone2(Scanner scanner) {
        int counter = 0;
        double sum = 0;
        double average = 0.0;

        System.out.println();
        System.out.println("Enter some numbers:");
        int n = scanner.nextInt();

        while (n >= 0) {
            counter++;  
            sum = sum + n;
            n = scanner.nextInt();
            average = sum / counter;
        }

        System.out.printf("The average is: " + String.format("%.2f", (average)));
    }

    public void milestone3(int num1, int num2, int answer) { //needs public because it is in a different file
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }

}