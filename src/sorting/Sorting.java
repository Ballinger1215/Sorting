package sorting;

/**
 *
 * @author mbolli4593
 */
public class Sorting {

    public static void main(String[] args) {

        int[] array = {10, 3, 2, 14, 22, 23, 12, 4, 5};
        PrintArray(array);
        SelectionSort(array);
        PrintArray(array);
//        BubbleSort(array);
//        PrintArray(array);


    }

    public static void PrintArray(int[] array) {
        
        String arrayStr = "";
        
        //need another for loop to repeat pass through
        for (int i = 0; i < array.length; i++) {

            arrayStr = arrayStr + array[i] + " ";

        }

        System.out.println(arrayStr);

    }
    
    public static void SelectionSort(int[] array){
        
        for(int j = 0; j < array.length - 1; j++){
        
            int smallestIndex = j;
            for(int i = j; i < array.length ; i++){
                
                if(array[smallestIndex] > array[i])
                    smallestIndex = i;
                
            }  
            
                int temp = array[smallestIndex];
                array[smallestIndex] = array[j];
                array[j] = temp;
                
        }
    }

    public static void BubbleSort(int[] array) {

        //need another for loop to repeat pass through
        for (int j = 0; j < array.length - 1; j++) {
            
            //need another for loop to repeat pass through
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int temp = 0;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                }
            }
        }
    }

}
