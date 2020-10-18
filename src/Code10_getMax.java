/**
 * 递归找出数组最大值
 */
public class Code10_getMax {
    public static int getMax(int[] arr) {
        return process(arr,0,arr.length-1);
    }

    public static int process(int[] arr,int L,int R) {
        if (L == R) {return arr[L] ;}
        int mid = L+((R-L)>>1); //中点
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr,mid+1, R);
        return Math.max(leftMax, rightMax);
    }
}
