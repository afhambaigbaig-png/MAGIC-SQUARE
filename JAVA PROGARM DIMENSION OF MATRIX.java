import java.util.Scanner;

 class MatrixSum {
    public static void main(String[] args) {
        Scanner afh = new Scanner(System.in);

        System.out.print("Enter dimension of square matrix: ");
        int n = afh.nextInt();

        int[][] matrix = new int[n][n];

        //  for Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = afh.nextInt();
            }
        }

        //  For Row sums
        System.out.println("\nSum of each row:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        //  For Column sums
        System.out.println("\nSum of each column:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

        //  For Main diagonal sum
        int diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += matrix[i][i];
        }

        //  For Reverse diagonal sum
        int revDiagSum = 0;
        for (int i = 0; i < n; i++) {
            revDiagSum += matrix[i][n - i - 1];
        }

        System.out.println("\nMain Diagonal Sum = " + diagSum);
        System.out.println("Reverse Diagonal Sum = " + revDiagSum);

        afh.close();
    }
}