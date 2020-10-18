public class Code04_BSExit {
     public static boolean exit(int[] sortArr,int num) {
         if (sortArr == null || sortArr.length == 0) {
             return false;
         }
         int L = 0;
         int R = sortArr.length-1;
         int mid = 0;

         while (L < R) {
             // mid = (L+R)/2  防止数值溢出 不安全
           mid = L + ((R - L) >> 1);
            if (sortArr[mid] == num) {
                return true;
            }else if (sortArr[mid] > num) {
                R = sortArr[mid] - 1;
            }else {
                L = sortArr[mid] + 1;
            }
         }

         return sortArr[L] ==num;


     }
}
