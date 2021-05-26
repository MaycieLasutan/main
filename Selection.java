package selection;
public class Selection {

  
    public static void main(String[] args) {
            int[] num= {10,5,3,7,15,25,2};
    System.out.println("Before selection sort:");   
   for (int element: num) {
            System.out.print(" "+element);  
    }
            sort(num);
    printArray(num);
     
    }
    public static int[] sort(int []A){
        for (int i = 0; i<A.length-1;i++){
        int minIndex= i;
           for (int j =i+1; j<A.length; j++){
               if (A[j]<A[minIndex]){
               minIndex =j;
               }
           }
           int temp;
           temp = A[minIndex];
           A[minIndex]= A[i];
           A[i]= temp;
        }
        return A;
    }
    
public static void printArray(int[]A){
 System.out.println("");
       System.out.println("After selection sort:");
    
    for (int i = 0; i<A.length; i++)  
     System.out.print (" "+A[i]);
     }
}
