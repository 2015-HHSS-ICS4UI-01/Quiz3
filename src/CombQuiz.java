/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class CombQuiz {


   public void combSort(int[] n){
   boolean swapped = false;
   do{
      int gap = (int) (n.length/1.3);
      swapped = false;
      
      for(int i = 0; i < n.length - 1; i++){
          
         if(n[i] > n[i+gap]){
            int temp = n[i];
            n[i] = n[i+gap];
            n[i+gap] = temp;
            swapped = true;
            
            if(n[i+gap] >= n.length)
                i=0;
                
            
         }
        
      }
      
   }while(swapped);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CombQuiz test = new CombQuiz();
        
        int[] n = {24,1,5,23,87,13,2};
        //sort the araay
        //test.bubbleSort(n);
        //test.selectionSort(n);
        test .combSort(n);
        
        //check if sorted
        for(int i = 0; i < n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}
