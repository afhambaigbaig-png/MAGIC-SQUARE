import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows:");
        int row = sc.nextInt();

        System.out.println("Enter the Columns:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        // Input Matrix
        System.out.println("Enter the Matrix Elements:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sum of each row
        System.out.println("Sum Of Each Row:");

        for (int i = 0; i < row; i++) {

            int rowsum = 0;

            for (int j = 0; j < col; j++) {
                rowsum = rowsum + matrix[i][j];
            }

            System.out.println("Row " + i + " Sum = " + rowsum);
        }

        // Sum of each column
        System.out.println("Sum Of Each Column:");

        for (int i = 0; i < col; i++) {

            int colsum = 0;

            for (int j = 0; j < row; j++) {
                colsum = colsum + matrix[j][i];
            }

            System.out.println("Column " + i + " Sum = " + colsum);
        }

        // Diagonal Sum
        if (row == col) {

            int maindiagonal = 0;
            int reversediagonal = 0;

            for (int i = 0; i < row; i++) {

                maindiagonal = maindiagonal + matrix[i][i];

                reversediagonal = reversediagonal + matrix[i][row - 1 - i];
            }

            System.out.println("Main Diagonal Sum: " + maindiagonal);

            System.out.println("Reverse Diagonal Sum: " + reversediagonal);
        }

        else {
            System.out.println("Diagonal not possible because matrix is not square.");
        }
    }
}