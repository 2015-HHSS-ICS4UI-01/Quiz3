/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Quiz3 {

  public void combSort(int[] n)
    {
        double shrink = 1.3; //the number the gap is divided by
        int gap = n.length; //length of the gap
        boolean swapped = true;
        do
        {
            gap = (int)(gap/shrink); //the gap valued is updated
            if (gap < 1)//the minimum gap is 1
            {
                gap = 1;
            }    

            for (int i = 0; i + gap < n.length; i++)
            {
                if (n[i] > n[i+gap]) //The numbers are being swapped
                {
                    int temp = n[i];
                    n[i] = n[i+gap];
                    n[i+gap] = temp;
                    swapped = false;
                }
                
            }     
        } while (swapped  == false && gap != 1); //When the gap is 1 and the numbers are swapped
                                                 //the loop will end
    }
  
  
  
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        int [] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = (int)(Math.random()*101);
        }
        test.combSort(nums);
        for(int i = 0; i < 10; i++)
        {
            System.out.println(nums[i]);
        }
        
        
    }
}
