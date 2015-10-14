/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class Quiz3 {

    public void combSort(int[]n){
        //declare shrink and gap variables
        int gap = n.length;
        double shrink = 1.3;
        boolean swapped = false;
        do{
            //it is not swapped
            swapped = false;
            //shrink the gap
               gap = (int)(gap/shrink);
            

            //loop through the array and "comb" over array
            for (int i = 0; i + gap <= n.length -1; i++) {
                if(n[i] > n[i + gap])
                {
                    //swap the two numbers
                    int temp = n[i];
                    n[i] = n[i+gap];
                    n[i + gap] = temp;
                    swapped = true;
                }
            }
            //if the gap is bigger than 1 or swapped is true
            //loop again
        }while(gap > 1 || swapped);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        int[] n = {9,8,7,6,5,4,3,2,1};
        test.combSort(n);
        //print the numbers
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
