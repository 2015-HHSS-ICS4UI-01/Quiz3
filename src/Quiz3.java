/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = {3, 9, 11, 1, 2, 8, 5, 12, 16, 19, 22};   //array of values
        Quiz3 test = new Quiz3();                           //new test 
        test.combSort(n);                                   //sort the array

        for (int i = 0; i < n.length; i++) {                //print out each number 
            System.out.println(n[i]);
        }

    }

//    public void combSort(int[] n) {
//        boolean swapped = false;
//        int gap = n.length;
//        double shrink = 1.3;
//
//        while (gap != 1 || swapped == true) {
//            gap = (int) (gap / shrink);
//            if (gap < 1) {
//                gap = 1;                                      <---- this was my orginal attempt
//            }
//            swapped = false;
//            for (int i = 0; i + gap < n.length; i++) {
//                if (n[i] > n[i + gap]) {
//                    int temp = n[i];
//                    n[i] = n[i + 1];
//                    n[i + 1] = temp;
//                    swapped = true;
//                }
//                i = i + 1;
//            }
//        }
//
//    }
    public void combSort(int[] n) {
        boolean swapped = false;                            //create swapped boolean
        int gap = n.length;                                 //create gap int that is equal to input length
        double shrink = 1.3;                                //create shrink double that is equal to 1.3
        do {

            while (gap != 1 || swapped == true) {           //loop until gap equals 1 or swapped equals true
                gap = (int) (gap / shrink);                 //gap will equal gap divided by shrink
                if (gap < 1) {                              //is gap is less than 1, make gap 1 because we cant use soemthing under 1
                    gap = 1;                                //set gap to be 1
                }
                swapped = false;                            //set swapped to false
                for (int i = 0; i + gap < n.length; i++) {  //loop until i + gap is less than input length
                    if (n[i] > n[i + 1]) {                  //if input at spot i is greater than input at spot i + 1 
                        int temp = n[i];                    //set temp value
                        n[i] = n[i + 1];                    //input at spot i equals input at spot i plus 1
                        n[i + 1] = temp;                    //input at spot i + 1 is equal to temp
                        swapped = true;                     //make swapped true
                    }
                }
            }
        } while (swapped);
    }
}
