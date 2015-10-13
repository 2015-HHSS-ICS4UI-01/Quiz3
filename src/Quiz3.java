/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Quiz3 {

    public void combSort(int[] n){
        boolean swap = true;//A boolean to see if any numbers were swapped with eachother
        double shrink = 1.3;//the number that the gap will always be divided by
        int gap = n.length; //to set up the base number for the gap
        do
        {
            gap = (int)(gap/shrink);//to calculate the gap each time the array runs
            if(gap<1)
            {
                gap = 1;  // if the gap becomes less than 0, make the gap 1 to keep it from decimals.
            }
            for(int i = 0; i + gap<n.length; i++)
            {
                if(n[i] > n[i+gap])//checking to see if the the digit the length of the gap away is smaller than the digit without the gap 
                {
                    int temp = n[i];        // The numbers within the array are being swapped with eachother.
                    n[i] = n[i + gap];
                    n[i+gap]= temp;
                    swap = false;
                }
            }
        }while(swap == false && gap != 1);//This will run while there are still numbers being swapped with eachother
                                          //and the gap is not equal to 1. The loop will run until both conditions are not true anymore.
        
    }
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        int rand = 10;
        int[] n = new int[rand];
        for(int i = 0;i< rand; i++){
        n[i]=(int)(Math.random()*100);
    }
        
        
        test.combSort(n);
         for(int i = 0; i <n.length; i++)
         {
             System.out.println(n[i]);
         }
    }
}
