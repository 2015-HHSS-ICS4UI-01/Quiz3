/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        int[] arrayTest = {0, 1, 3, 2, 6, 3, 9, 7, 1, 4, 13, 5};
        test.combSort(arrayTest);
        for (int x = 0; x < arrayTest.length; x++)
        {
            System.out.println(arrayTest[x]);
        }
    }
    public void combSort(int[] n)
    {
        int gap = n.length; //initial gap length is the same as the array length (will be shrinked later)
        double shrink = 1.3; //shrinkage
        boolean swapped = false; //boolean used to determine if a swap has occurred
        do //loop until gap == 1 and a swap isnt made
        {
            gap = (int)(gap/shrink); //finding the new gap
            if (gap < 1)
            {
                gap = 1; //if the gap is less than 1 (as a result of too much shrinkage), set it qual to 1
            }
            
            int i = 0; //initialize increment variable
            swapped = false; //remind the loop that thus far into the loop, no swap has occurred
            
            while(i + gap >= n.length == false) //loop as long as i + gap is within the bounds of the array
            {
                if (n[i] > n[i+gap]) //if the first number is greater than the second number
                {
                    //swap numbers
                    int temp = n[i];
                    n[i] = n[i+gap];
                    n[i+gap] = temp;
                    swapped = true;
                }
                i++; //increase increment variable
            }
        }while (gap != 1 || swapped); //see comment at beginning of loop
    }
}
