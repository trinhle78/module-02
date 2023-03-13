package min_in_array;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to index: ");
        int index = scanner.nextInt();
        int[] arr = new int[index];

        for(int i=0; i<index; i++){
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<index; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
    }
}