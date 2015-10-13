/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] nums = new int[10];
    nums[0]=9;
    nums[1]=7;
    nums[2]=4;
    nums[3]=3;
    nums[4]=7;
    nums[5]=2;
    nums[6]=1;
    nums[7]=8;
    nums[8]=0;
    nums[9]=3;
    
    combSort(nums);
    
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }
    
    }

  public static void combSort(int[] n){
      int gap = n.length;
      double shrink = 1.3;
      boolean swapped = false;
   do{
      swapped = false;
      gap/=shrink;
      if(gap<1){
          gap=1;
      }
      
      for(int i = 0; i + gap< n.length; i++){
         if(n[i] > n[i+gap]){
            int temp = n[i];
            n[i] = n[i+gap];
            n[i+gap] = temp;
            swapped = true;
         }
      }
   }while(swapped||gap!=1);
}  
    
    
    
    
    
    
    
}
