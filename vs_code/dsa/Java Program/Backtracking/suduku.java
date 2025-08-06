public class suduku {
    public static boolean safe(int arr[][], int row, int col, int num) {
        // col
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == num) {
                return false;
            }
        }
        // row
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == num) {
                return false;
            }
        }
        // 3x3 matrix
        int row1=row-row%3;
        int col1=col-col%3;
        for (int i = row1; i < row1+3; i++) {
            for (int j = col1; j < col1+3; j++) {
                if (arr[i][j] == num) {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean solveSudoku(int arr[][], int row, int col) {

        // base case
        if (row == 9) {
            print(arr);
            return true;
        }

        // work
        if (col == 9) {
            return solveSudoku(arr, row + 1, 0);
        }

        if (arr[row][col] != 0) {
            return solveSudoku(arr, row, col + 1);
        }

        for (int num = 1; num <= 9; num++) {
            if (safe(arr, row, col, num)) {
                arr[row][col] = num;
                if(solveSudoku(arr, row, col + 1)){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] ar) {
        int arr[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        solveSudoku(arr, 0, 0);
    }
}
