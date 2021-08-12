package mergesort;


public class mergeSortTutorial {
    
    public static void main(String[] args) {
    int[] array = {5,4,3,2,1};
    System.out.println("Initial Array: ");
    printArray(array);

    array = mergeSort(array);
    System.out.println("Sorted Array: ");
    printArray(array);
    }
    
    private static void printArray(int[] array){
        // this is responsibile for printing out the elments in the array
        for(int i: array){
            System.out.print(i + " "); // so print out the element and put a space between them
        }
        System.out.println();  // move to next line
    }
    
    private static int[] mergeSort(int[] array){
        if(array.length <= 1){ // a loop to check if the array has one element, if so then print the element
            return array;
        }
        // if the array contains more than one elment in the array then we find the midpoint pf the array
        int midpoint = array.length / 2; // intialize a new variable called midpoint where you will assign the array when dided into two.
        // initialize two arrays, one for the left and right array since you will be dividing the intial array into two
        int[] left = new int[midpoint]; 
        int[] right;
        
        if(array.length % 2 == 0){ // to check if this is an even or odd array
            right = new int[midpoint]; //
        }else{
            right = new int[midpoint + 1];  //
        }
        // pouplating the left and right arrays
        for(int i=0; i< midpoint; i++){
            left[i] = array[i];
        }
        
        for(int j= 0; j< right.length; j++){
            
            right[j] = array[midpoint + j];
        }
        
        // contain our new array
         int[] result = new int[array.length];
         
         left = mergeSort(left);
         right = mergeSort(right);
         
         result= merge(left, right);
         
         return result;
    }
    
    private static int[] merge(int [] left, int[] right){
        int[] result = new int[left.length + right.length];
        
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        
        while(leftPointer < left.length || rightPointer < right.length){
            
            if(leftPointer < left.length && rightPointer < right.length){
                
                if(left[leftPointer] < right[rightPointer]){
                    result[resultPointer++] = left[leftPointer++];
                }else{
                    
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            else if(leftPointer < left.length){
                result[resultPointer++] = left[leftPointer++];
            }
            else if(rightPointer < right.length){
                
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
    

    
}
