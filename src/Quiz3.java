/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    
    public void combSort(int[] n)
    {
        //set the gap
        int gap = (int)(n.length/1.3);
        int end = n.length;
        
        boolean swapped = false;
        //start the loop
        do{            
            swapped = false;
            gap = (int)(gap/1.3);
            for(int i = 0; i < end; i++){
                if(n[i] > n[i+gap]){
                    int temp = n[i];
                    n[i] = n[i+gap];
                    n[i+gap] = temp;
                    swapped = true;
                }
            }
            //exit loop if swapped is true and the gap = 1
        }while(swapped || gap == 1);
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
