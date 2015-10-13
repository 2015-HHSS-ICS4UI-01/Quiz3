
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Walter
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] n = new int[10];
        n[0] = 5;
        n[1] = 42;
        n[2] = 14;
        n[3] = 21;
        n[4] = 7;
        n[5] = 3;
        n[6] = 32;
        n[7] = 1;
        n[8] = 25;
        n[9] = 10;

        combSort(n);
        for (int i = 0; i < n.length; i++) {

            System.out.println(n[i]);
        }
    }

    public static void combSort(int[] n) {
        boolean swapped = false;
        int gap = n.length;                          //size of the gap
        double shrink = 1.3;                         // size it will be shrinking by each time

        do {
            swapped = false;

            gap /= shrink;                              //divide the gap size by the shrinking amount every time it repeats
            if (gap < 1) {
                gap = 1;
            }
            for (int i = 0; i + gap < n.length; i++) {

                if (n[i] > n[i + gap]) {                  
                    int temp = n[i];
                    n[i] = n[i + gap];
                    n[i + gap] = temp;

                    swapped = true;
                }
                if (i == i + 1) {
                    break;                     //when the gap between the numbers is 1 exit the loop
                }

            }
        } while (swapped);            //exit the while loop when the numbers are swapped
    }

}
