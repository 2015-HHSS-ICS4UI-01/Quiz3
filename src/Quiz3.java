
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    
    public void combSort(int[] n){
    int gap = (int)(n.length/1.3);          //gap size
    double shrink = 1.3;                    //shrink each time
    boolean swapped = true;
    
    
    while(gap > 1 || swapped == true){      //when gap > 1 and swapped

        gap = (int)(gap / shrink);          //get next gap value
            if (gap <= 1){
                                            //minimum gap is 1
              gap = 1;
            }
            int i = 0;                      //set i to go through positions on array
            swapped = false;                //set swapped to false (hasn't swapped)
                
                //a single "comb" over the input list
                while((i+gap)<n.length){
                    if (n[i] > n[i+gap]){   //compare, if it is bigger than the 
                                            //next number in the gap

                        int temp = n[i];    //swap
                        n[i] = n[i+gap];
                        n[i+gap] = temp;
                        
                        swapped = true;     //swapped
                    }
                    
                i++;                        //go to next set of 2 numbers move right
        }
        

    }
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[input.nextInt()];
        for(int i = 0; i < n.length; i++){
            n[i] = input.nextInt();
        }
        
        Quiz3 test = new Quiz3();
        test.combSort(n);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}
