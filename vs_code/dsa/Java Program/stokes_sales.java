public class stokes_sales {
    private static int stokes_sales(int price[]){
        
        int buy_price=Integer.MAX_VALUE;
            int profit=0;
            int max_profit=0;
        
            for(int i=0;i<price.length;i++){
            
            if(buy_price<price[i]){

                
                profit=price[i]-buy_price;    // certain day profit
                max_profit=Math.max(max_profit,profit); // total profit
                
            }
            else{
                   buy_price=price[i]; // buy price
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        System.out.println(stokes_sales(price));

    }
}
