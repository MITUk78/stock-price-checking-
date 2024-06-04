import java.util.*;


public class stock {
    public static int buyAndSellStock(int price[]){
            int buyPrice=Integer.MAX_VALUE;
            int maxprofit= 0;   

            for(int i=0; i<price.length; i++){
                if(buyPrice<price[i]){//profit
                    int profit = price[i]-buyPrice;//todays profit
                    maxprofit=Math.max(maxprofit, profit);  

                }else{
                    buyPrice=price[i];
                }
            }
            return maxprofit;
    }

    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(price)); 
    }
    
}
