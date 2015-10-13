
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomt9963
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Input array length.");
        int s = input.nextInt();
        //set the length of the array
        int[] n = new int[s];
        //collect the integers to be held within array
        while (i < n.length) {
            n[i] = input.nextInt();
            i++;
        }
        //print unsorted array
        for (int p = 0; p < n.length; p++) {
            System.out.print(n[p]);
            System.out.print(" ");
        }
        //send array to sort method
        combSort(n);
        //print sorted array
        System.out.println("");
        System.out.println(Arrays.toString(n));
    }

    static int combSort(int[] n) {
        //set gap size; currrently array size
        int gap = n.length;

        while (gap > 1) {
            //decrease gap size for next swap
            gap = (int) (gap / 1.3);
                //"comb" through the array
                for (int i = 0; i + gap <= n.length - 1; i++) {
                    if (n[i] > n[i + gap]) {
                        //temp array to hold greater integer
                        int temp = n[i];
                        //Swap lower integer
                        n[i] = n[i + gap];
                        //Swap greater integer
                        n[i + gap] = temp;
                    }
                }
            } 
        return 0;
        }
    }

