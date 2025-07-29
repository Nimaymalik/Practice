package DSA_Round2.Array;

import java.util.Scanner;

// stack with array push() ,pop(),isEmpty(),peek()
public class StackWithArray {
    static int[] arr = new int[100];

    static int i = 0;

    public static void push(int value) {
        arr[i] = value;
        i++;
        System.out.println("Item pushed inside the array");

    }

    public static void pop() {
        if (arr.length == 0 || arr.length - 1 == 0) {
            System.out.println("Array is already empty");
        }
        System.out.println(arr[i - 1]);
        i--;

    }

    public static void peek() {
        if (arr.length < 0 || arr.length - 1 == 0) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println(arr[i - 1]);

    }

    public static void printArray() {
        System.out.print("Your current array is : ");
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

    }

    public static boolean isEmpty(int[] arr) {
        return (arr.length - 1 == 0) ? true : false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // System.out.println();
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peek");
            System.out.println("Enter 4 to check the array");
            System.out.println("Enter 5 for Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value");
                    int value = sc.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    printArray();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("You have entered the wrong choice");
                    break;
            }

        }
    }
}