package Practice.Sorting;

public class Insertion_sort {
    static void insertionSort(int []a){
        int n=a.length;
        for (int i=1;i<n;i++){
          int j=i;
          while (j>0 && a[j]<a[j-1]){
              // swap a[j] , a[j-1]
              int temp=a[j];
              a[j]=a[j-1];
              a[j-1]=temp;
              j--;
          }
        }
    }
    public static void main(String[] args) {
        int []arr={8,6,3,5,4,2};
        insertionSort(arr);
        for (int val : arr
             ) {
            System.out.print(val+" ");
        }
    }
}
