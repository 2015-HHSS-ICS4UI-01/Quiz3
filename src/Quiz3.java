/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Quiz3 {
    
    public void combSort(int[] n){
        //initializes variable that will track the gap between the two numbers being sorted
        int gap = n.length;
        
        //initializes variable of the factor the gap will shrink by each time
        double shrink = 1.3;
        
        boolean swapped = false;
    
        //swap numbers in the set until the gap between them is 1
        //and until no numbers have been swapped in one loop
        do{
            
            //finds the new gap between numbers by dividing the current gap by the shrink factor
            gap = (int)(gap/shrink);
            
            //if gap becomes less than 1
            if(gap < 1)
            {
                //set gap to 1
                gap = 1;
            }
            
            swapped = false;
            
            //loops through the set of numbers until all numbers have been checked and swapped if necessary
            for(int i = 0; i + gap < n.length; i++){
                
                //check each number to see if a swap must be made
                for(int j = i; j < i+1; j++){
                    //if number is greater than the number on the other side of the gap
                    if(n[i] > n[i+gap]){
                        
                        //swap the numbers with each other
                        int temp = n[i];
                        n[i] = n[i+gap];
                        n[i+gap] = temp;
                        
                        //indicate that a swap has been made
                        swapped = true;
                    }
                }
                 
            }
        }while(gap > 1 || swapped);
        
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        //creates a set of numbers that the program will sort
        int[] n = {4,2,1,8,1,3,7,6,5,2,7,9};
        
        Quiz3 test = new Quiz3();
        
        //sorts the numbers in the set
        test.combSort(n);
        
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    
    }
}
