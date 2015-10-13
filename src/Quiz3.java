
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Quiz3 {
    
    public void combsort(int[] n){

        boolean swapped = false;
        //intiger gap that is the length of the n array
        int gap=n.length;
        int count=0;
        do{
            //reset the swapped flag
            swapped = false;
            //update the gap value for the next run
            gap=(int)(gap/1.3);
            //minimum value of gap is 1
            if(gap<1)
                gap=1;
            System.out.println("gap: "+gap);
            //single 'comb' run through the array
            int temp;
            for (int i = 0; i+gap < n.length; i++){
                //if the value at i is greater than that at i+gap,
                //swap value at i with the value at i+gap each time
                if (n[i] > n[i+gap]){
                    temp = n[i];
                    n[i]=n[i+gap];
                    n[i+gap]=temp;

                    //flag that there has been a swap
                    swapped=true;
                    count++;
                }       
            }
        //keep looping until there hasn't been a sawp and gap is one
        } while (swapped||gap!=1);
        System.out.println("count: "+count);
    }
    
    public static void main(String[] args) {
        Scanner stuff=new Scanner(System.in);
        Quiz3 test=new Quiz3();
        int[] numbers={3,9,3,2,4,2,7,4,1,5,10,6};
        
        test.combsort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}
