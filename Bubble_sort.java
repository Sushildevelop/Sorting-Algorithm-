package Practice.Sorting;

public class Bubble_sort {
    static void bubblesort(int []arr){
        int n=arr.length;
        // n-1 iterations/ passess
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                // alst i elements are already at correct sorted positions so no need to ckeck thme
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={7,6,5,4,3,2,0};
        bubblesort(arr);
        for (int i:
            arr ) {
            System.out.print(i+" ");

        }
    }
}
