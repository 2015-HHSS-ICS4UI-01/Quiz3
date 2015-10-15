/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author millg1278
 */
public class Quiz3 {

    
   public void combSort(int[] n)
    {
       boolean swapped = false;
        
       int gap = 10;//initialize gap size
       double shrink = 1.3; //set the gap shrink factor

        //loop until gap = 1 and swapped = false
        for(int i = 0; i < n.length - 1; i++){
        //update the gap value for a next comb
        gap = (int)(gap / shrink);
        
        if(gap < 1)
            
                {
          //minimum gap is 1
          gap = 1;
                }
               i = 0;
        swapped = false; //see bubblesort for an explanation
        }
        
        //a single "comb" over the input list
        //loop until i + gap >= input.length 
        for(int i = 0; i < n.length - 1; i++){
            if(n[i] > n[i+gap]){
                  //swap
                  int temp = n[i];
                  n[i] = n[i+1];
                  n[i+1] = temp;
                        }
        
                // Flag a swap has occurred, so the
                // list is not guaranteed sorted
                swapped = true;              
        }
         
                    }

         
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
}
