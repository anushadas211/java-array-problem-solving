package myjava.additionmatrix;
public class Additionmatrix {

    public static void main(String[] args) {
 int[][] matrix1 = {{11, 22, 33}, {4, 50, 60}, {7, 8, 9}};
 int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {30, 20, 10}};
 int[][] result = new int[matrix1.length][matrix1[0].length];
 for (int i = 0; i < matrix1.length; i++)
 for (int j = 0; j < matrix1[i].length; j++)
 result[i][j] = matrix1[i][j] + matrix2[i][j];
 for (int[] row : result)
 System.out.println(java.util.Arrays.toString(row));
 }
}
