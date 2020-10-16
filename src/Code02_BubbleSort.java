public class Code02_BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
      for (int i = 0; i < arr.length-1; i++) {
          for (int j = 0; j <arr.length-1-i; j++) {
               int temp = 0;
               if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
               }
          }
      }

    }

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1,9};
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i+"\t");
        }
    }
}
