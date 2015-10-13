


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janaj4926
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //array
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("enter #");
            nums[i] = in.nextInt();
        }
        combSort(nums);
        
    }
    static void combSort(int[] nums){
        //the gap length
        int gap = (int) (nums.length / 1.3);
        boolean swapped = false;
        
        do {
            //resetting swapped variable
            swapped = false;
            for (int i = 0; i + gap < nums.length; i++) {
                //if numbers need to be switched
                if (nums[i] > nums[i + gap]) {
                    int temp = nums[i];
                    nums[i] = nums[i + gap];
                    nums[i + gap] = temp;
                    swapped = true;
                }
                
                //making the gap smaller
                gap = (int)(gap / 1.3);
                //the smallest gap possible
                if(gap < 1){
                    gap = 1;
                }
            }
            //run when everything is supposed to
        } while (swapped || gap > 1);
        
        //printing out sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
