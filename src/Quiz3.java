/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    
    public void combSort(int[] n)
    {
        int gap = n.length;
        boolean swapped = false;
        int end = gap;
        do{
            gap = (int)(gap/1.3);
            swapped = false;
            if (gap < 1)
            {
                gap = 1;
            }
            for(int i = 0; i < n.length - gap; i++)
            {
                if(n[i] > n[gap])
                {
                    int temp = n[i];
                    n[i] = n[gap];
                    n[gap] = temp;
                    swapped = true;
                }
            }
            end--;
        }while(swapped || gap > 1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Quiz3 test = new Quiz3();
        int[] n = {24, 1, 5, 23, 87, 13, 2};
        test.combSort(n);
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
}
//second and last need to switch