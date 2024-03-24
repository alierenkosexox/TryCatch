
// Ali Eren KÖSE 24/03/2024 22:12

import java.util.Scanner;

public class Main {
    // ask index and input the index number
    public static void chechkIndex(int index, Object[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER INDEX : ");
        index = input.nextInt();

        //print error if index number is out of capacity
        try {
            System.out.println("Your Choice : " + arr[index]);
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
        // list definition and index control
    public static void main(String[] args) {
        Object[] list = {10, 20, 30, 40, 50, "COLOR", "AGE", "NAME", 10, 50, 80, 90};

        chechkIndex(5, list);
    }
}
