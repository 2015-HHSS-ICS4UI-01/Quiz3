/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Quiz {

    public void combSort(int[] n){
            //make the gap
            int gap = n.length;
            //shrink factor
            double shrink = 1.3;
            
            boolean swapped = false;
            
            
            while(gap > 1 || swapped){
                
                
                if(gap > 1){
                
                    gap = (int)(gap/shrink);
                
                }
                
                if(gap < 1)
                {
                    gap = 1;
                }
                
                for(int i = 0; i + gap < n.length; i++)
                {
                    if(n[i] > n[i+1])
                    {
                        //swap
                        int temp = n[i];
                        n[i] = n[i + gap];
                        n[i + gap] = temp;
                        swapped = true;
                    }
                    if(i == i + 1){
                        swapped = false;
                    }
                }
            }
        }
    
    public static void main(String[] args) {
        
        
        Quiz test = new Quiz();
        
        int[] n = {24,25,3,15,6,8,9,456,456,25,4};
        
        test.combSort(n);
        
        //check if sorted
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
    }
}
