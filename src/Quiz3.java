/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Quiz3 {
    
    public void combSort(int[] n)
    {
        int gap = n.length; //set the initial gap size
        double shrink = 1.3; //set the gap shrink factor
        
        //loop until gap = 1 and swapped = false
        boolean swapped = false;
        do{
            //update the gap value for the next comb
            gap = (int)(gap/shrink);
            if(gap < 1)
            {
                gap = 1;
            }
            
            swapped = false; //if no swaps occur the loop will end
            //comb over the array
            for(int i = 0; i + gap < n.length; i++)
            {
                //everytime the first number is bigger
                if(n[i] > n[i + gap])
                {
                    //swap the numbers
                    int temp = n[i];
                    n[i] = n[i + gap];
                    n[i + gap] = temp;
                    swapped = true; //flag that a swap occured
                }
            }
        }while(swapped || gap > 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        
        //set the array values
        int[] n = {24,5,13,3,5,19,9};
        
        //sort the array
        test.combSort(n);
        
        //check if sorted
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
    }
}
