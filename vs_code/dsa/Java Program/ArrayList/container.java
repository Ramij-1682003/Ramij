import java.util.*;

public class container {
    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int left = 0;
        int right = height.size() - 1;
        int maxarea = 0;
        
        while (left < right) {
            int currentarea = 0;
            currentarea = Math.min(height.get(left), height.get(right)) * (right - left);
            maxarea = Math.max(maxarea, currentarea);
            
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maxarea=" + maxarea);
    }
}
