package FindMaxIn2DArray;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of row: ");
        int row = sc.nextInt();
        System.out.print("Enter numbers of column: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element row " + (i + 1) + " and column " + (j + 1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }
        System.out.println("Max in array is: " + max + " at index X: " + indexX + " and indexY: " + indexY);
    }
}
