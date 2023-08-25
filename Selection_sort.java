package Practice.Sorting;

public class Selection_sort {
    static void Selection_sort(int [] arr){
       int n=arr.length;
       for (int i=0;i<n-1;i++){
           // Find the minimum element in unsorted part of array
           int min_index=i;
           for (int j=i+1;j<n;j++){
               if (arr[j]<arr[min_index]){
                   min_index=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min_index];
           arr[min_index]=temp;
       }
    }
    public static void main(String[] args) {
        int []arr={7,4,5,1,2,8};
        Selection_sort(arr);
        for (Integer i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
