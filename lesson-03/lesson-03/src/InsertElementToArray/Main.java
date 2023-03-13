package InsertElementToArray;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,2,9,10,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int index;
        do {
            System.out.println("Enter index: ");
            index = sc.nextInt();
            if (index <= -1 || index >= arr.length - 1) {
                System.out.println("Can not insert number to array!");
            }
        } while (index <= -1 || index >= arr.length - 1);

        for (int i = arr.length - 1; i>= index; i--) {
            if (i == index) {
                arr[i] = num;
            } else {
                arr[i] = arr[i - 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
