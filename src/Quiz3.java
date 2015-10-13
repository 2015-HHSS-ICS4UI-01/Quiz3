
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array length");
        //set the array length to the number of numbers that will be input
        int [] n = new int[in.nextInt()];
        System.out.println("enter "+n.length+ " numbers to be sorted");
        //put the numbers that were input to be sorted
        for(int i=0; i < n.length; i ++){
            n[i] = in.nextInt();
        }
        test.combSort(n);
        //print out the sorted array
        for(int i = 0; i < n.length; i++){
            System.out.print( n[i] + " ");
        }        
        System.out.println("");
        
    }
     public void combSort(int[] n){
         //set the gap to the length of the array
            int gap = n.length;
            //set swap to false
            boolean swapped = false;
            do{
                //set the gap to 1.3 times the array length
                gap = (int)(gap/1.3);
                swapped = false;
                //if the gap is less than 1 set it to 1
                if(gap < 1){
                        gap = 1;
                    }
                
                for(int i = 0;i + gap < n.length ; i ++){
                    //if the first number is bigger than the second number(gap + forst number)
                    //than swap the two
                    if(n[i] > n[i+gap]){
                        int temp = n[i];
                        n[i] = n[i + gap];
                        n[i+gap] = temp;
                        swapped = true;
                        
                    }
                     
                }
                //keep doig this while there is still swapping and the gap is bigger than 1
            }while(swapped || gap >1);
        }
}
