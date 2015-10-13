/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        int[] n = {0};
        test.combSort(n);
        for (int x = 0; x < n.length; x++) {
            System.out.println(n[x]);
        }
    }

    public void combSort(int[] n) {

        int gap = n.length; // gap between numbers compared
        double shrinkFactor = 1.3; //factor by which the gap is divided by
        boolean swapped = false; // to indicate swap

        do {
            swapped = false;
            gap = (int) (gap / shrinkFactor); // get the gap

            if (gap < 1) { //if gap is less than 1, make it like in bubble sort, equal to 1 
                gap = 1;
            }

            int i = 0;

            while (i + gap <= n.length - 1) { //loop until the index + gap are greater or equal to the arr.length-1
                if (n[i] > n[i + gap]) { //if a number before is greater than a number after
                    //swap terms
                    int temp = n[i];
                    n[i] = n[i + gap];
                    n[i + gap] = temp;
                    swapped = true; //indicate swap happened
                }
                i++;
            }
        } while (gap > 1 || swapped); //until gap is 1 or less and the terms cannot be swapped 
    }
}
