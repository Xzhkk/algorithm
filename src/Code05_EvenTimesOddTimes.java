public class Code05_EvenTimesOddTimes {

    //在arr中,只有一种数出现奇数次,其他偶数次 找出奇数次数
     public static void printOddTimesNum1(int[] arr) {
         int eor = 0;
         for (int i = 0; i < arr.length; i++) {
             eor ^= arr[i];
         }
         System.out.println(eor);

    }

    //一个数组中有两种数出现了奇数次,其他数出现偶数次，怎么找到并打印这种数?
     public static void printOddTimesNum2(int[] arr) {
         int eor = 0;
         for (int i = 0; i < arr.length; i++) {
             eor ^= arr[i];
         }
         // eor = a^b
         // eor != 0
         // eor 必然有一个位置是1
         int rightOne = eor & (~eor + 1); //取出最右的1
         int onlyOne = 0; //eor'
         for (int i = 0; i < arr.length; i++) {
             if ((arr[i] & rightOne) != 0) {
                 onlyOne ^= arr[i];
             }
         }
         System.out.println(onlyOne+" "+(eor ^ onlyOne));
     }

     //计算一个二进制数中1的个数
    public static  int bit1counts(int N) {
           int count = 0;
           while (N != 0) {
               int rightOne = N & ((~N) + 1);
               count++;
               N ^= rightOne;
           }
         return count;
    }
}
