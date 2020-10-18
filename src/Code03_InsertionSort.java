public class Code03_InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr ==null || arr.length < 2) {
            return ;
        }
      //0~0有序
      //0~i想有序
      for (int i = 1; i < arr.length; i++) {
          for (int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
              swap(arr,j,j+1);
          }
      }

    }
    public static void swap(int[] arr,int i,int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] a = {10,9,4,6,2,3};
        insertionSort(a);
        for (int i : a) {
            System.out.print(i+"\t");
        }
    }
}
