import java.util.Arrays;

public class Search_in_shorted_array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};           
        int targer=16;
        System.out.println(Arrays.toString(search(arr,targer)));
    }
    
    public static int[] search(int arr[][],int targer){
        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (targer == arr[row][col]) {
                return new int[]{row, col};
            } else if (arr[row][col] < targer) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
