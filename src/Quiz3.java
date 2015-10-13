/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KOBED6328
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        int[] testArray = {9,8,7,6,5,4,3,2,1};
        test.combSort(testArray);
        for (Integer i: testArray)
        {
            System.out.println(i);
        }
    }
    
    /**
     * sorts an array using the combsort algorithm
     * @param n an array to be sorted
     */
    public void combSort(int[] n)
    {
        int gap = n.length; //initialize gap size
        double shrink = 1.3; //set the gap shrink factor

        boolean swapped = true; // assuming the array is unsorted to start the loop
        
        while (gap > 1 || swapped) // keep going until the gap is 1 AND it's sorted
        {
            gap /= shrink; //update the gap value for a next comb
            if (gap < 1) //minimum gap is 1
            {
                gap = 1;
            }
            
            int i = 0;
            swapped = false; // assume its sorted
            
            //a single "comb" over the input list
            while (i + gap < n.length)
            {
                if (n[i] > n[i+gap]) // swap n[i] and n[i+gap]
                {
                    int temp = n[i];
                    n[i] = n[i+gap];
                    n[i+gap] = temp;
                    
                    swapped = true; // array is now unsorted
                }
                i++;
            }
        }
    }
    
}
