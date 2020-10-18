public class Code11_mergeSort {

    //递归方法实现
    public static void mergeSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
       process(arr,0,arr.length-1);
    }

    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr,mid+1, R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 要么p1越界了，要么p2越界了
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static void main(String[] args) {
         int[] arr = {1,3,4,2,5};
         int sum = 0;
         for (int i = 1 ; i < arr.length; i++) {
             for (int j = i -1; j >= 0; j--) {
                 if (arr[i] > arr[j]) {
                     sum += arr[j];
                 }
             }
         }
        System.out.println(sum);

    }
}
