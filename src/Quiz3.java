
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz3 test = new Quiz3();
        Scanner in = new Scanner(System.in);
        System.out.print("Array length: "); //user enters number of numbers to be sorted
        int[] n = new int[in.nextInt()];
        in.nextLine();
        System.out.println("Enter numbers");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt(); //user enters all numbers to be sorted
        }
        test.combsort(n); //sorts array
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " "); //outputs array numbers in order
        }
        System.out.println();
    }

    public void combsort(int[] n) {
        int gap = n.length;
        boolean swapped;
        do {
            gap = (int) (gap / 1.3); //gap is itself divided by the shrink factor
            if (gap < 1) { //if the distance between numbers to be sorted is less than 1
                gap = 1; //make the gap between numbers to be sorted 1
            }
            swapped = false; //this means that no numbers have been swapped yet
            for (int i = 0; i + gap < n.length; i++) { //sorts all numbers possible with the given gap
                if (n[i] > n[i + gap]) { //if the number is greater than a number one gap above itself
                    int temp = n[i]; //swap the two numbers;
                    n[i] = n[i + gap];
                    n[i + gap] = temp;
                    swapped = true; //this means a number has been sorted meaning the array may have to be sorted again
                }
            }
        } while (gap != 1 || swapped); //only sort again if no numbers were switched (meaning sorted already) or the gap reaches one (fully sorted)
    }
}
