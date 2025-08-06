import java.util.*;
public class trapped_rain_water {
    public static int trapped_rain_water(int height[]){
        // left max boundary
        
        int left_max[]=new int[height.length];
        left_max[0]=height[0];
        for(int i=1;i<height.length;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        // right max boundary
        int right_max[]=new int[height.length];
        right_max[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }
        // water trapped
        int trapped_water=0;
        for(int i=0;i<height.length;i++){
            int water_level=Math.min(right_max[i],left_max[i]);
            trapped_water+=water_level-height[i];
        }
        return trapped_water;
    }
    public static void main (String args[]){
        int height[] ={4,2,0,6,3,2,5};
        trapped_rain_water(height);
        int volume=trapped_rain_water(height) * 1;
        System.out.println("The total volume of water trapped is: "+volume);

    }
}
