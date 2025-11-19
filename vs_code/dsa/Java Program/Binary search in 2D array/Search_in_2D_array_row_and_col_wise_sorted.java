import java.util.Arrays;

public class Search_in_2D_array_row_and_col_wise_sorted {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}};
        int target = 39;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int arr[][], int target){
        int row = 0;
        int col = arr[0].length - 1;
        while (row<arr.length && col>=0) {
            
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
