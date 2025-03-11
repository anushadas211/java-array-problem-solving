package myjava.row.coloum.wise.sum;
public class RowColoumWiseSum {

    public static void main(String[] args) {
    int[][] myArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
        System.out.println("Row sums:");
        for (int i = 0; i < myArray.length; i++) {
            int rowSum = 0;
        for (int j = 0; j < myArray[i].length; j++) {
                rowSum += myArray[i][j];
            }
         System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
        
        System.out.println("\nColumn sums:");
        for (int j = 0; j < myArray[0].length; j++) { 
            int colSum = 0;
            for (int i = 0; i < myArray.length; i++) {
                colSum += myArray[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}