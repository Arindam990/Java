package Array;

public class Array4 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] arr={10,20,30,40,50,60};
        int[]result=margeArray(my_array,arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
   static int[] margeArray(int[] my_array, int[] arr){
        int temp=(my_array.length+arr.length);
        int [] arr1=new int[temp];
         int i=0;
         int j=0;
         int k=0;
        /* while (i<my_array.length && j<arr.length){
             if(my_array[i]<arr[j]){
                 arr1[k++]=my_array[i++];
             }
             else
                 arr1[k++]=arr[j++];
         }
         while (i< my_array.length){
             arr1[k++]=my_array[i++];
         }
         while (j<arr.length){
             arr1[k++]=arr[j++];
         }
         return arr1;
*/
       while (i< my_array.length){
           arr1[k++]=my_array[i];
       }
       while (j<arr.length){
           arr1[k++]=arr[j];
       }
       return arr1;

}
}
