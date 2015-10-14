
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */

    public static void combSort(int[] n) {
        int gap = n.length;
        double shrink = 1.3;
        boolean swapped = false;

        do {
            gap = (int) (gap / shrink);
            if (gap < 1) {
                gap = 1;
            }
            swapped = false;
            for (int i = 0; i < n.length - 1; i++) {
                if (n[i] > n[i + 1]) {
                    int temp = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped && gap != 1);

        System.out.println();
        
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the amount of numbers: ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + i + ": ");
            array[i] = input.nextInt();
        }

        combSort(array);

    }
}
