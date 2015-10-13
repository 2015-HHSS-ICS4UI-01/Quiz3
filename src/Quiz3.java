/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class Quiz3 {

    public void combSort(int[] n) {

        boolean swapped = false;//sets swaped to false
        double shrink = 1.3;
        int gap = n.length;

        do {
            
            swapped = false;//starts of the loop as false
            
            gap = (int) (gap / shrink); // sets the gap value with each run of loop
           int i = 0;//couter value 
           while(i + gap >= n.length == false){ //while the second digit being comapred is bigger than the length of the array is not true
                if (n[i + gap] < n[i]) { //swaps if the number if the second numeber is smaller than the first number 
                    //swap
                    int temp = n[i + gap];
                    n[i + gap] = n[i];
                    n[i] = temp;
                    swapped = true; //shows that theere was a swapp that was made
                    
                }
                i++; //increases the counter
            }

        } while (swapped || gap > 1); //repeats the do while swapped is true or gap is bigger than 1 
    }

    public static void main(String[] args) {
        Quiz3 test = new Quiz3();

        int[] n = {2, 3, 42, 65, 12, 8, 98, 1};
        test.combSort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

    }

}
