package RemoveElementInArray;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int indexDel = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                indexDel = i;
            }
        }
        if (indexDel != -1) {
            for (int i = indexDel; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = 0;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        } else {
            System.out.println("No element found in array!");
        }
    }
}
