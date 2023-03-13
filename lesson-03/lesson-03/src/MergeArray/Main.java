package MergeArray;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[7];
        int[] arr3 = new int[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Display array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Display array 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("Display array 3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
