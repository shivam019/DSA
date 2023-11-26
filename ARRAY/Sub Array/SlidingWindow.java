public class SlidingWindow {
     
static int maxSumSubArray(int[] array, int k) {
    int wsum = 0;
    int msum = Integer.MIN_VALUE;

    for(int i=0; i<k; i++){
        wsum += array[i];
    }

    for(int i=k; i<array.length; i++){
       wsum = wsum - array[i-k] + array[i];
        msum =  Math.max(msum, wsum);
    }

    return msum;
}
    public static void main(String[] args) {
        
        int[] array = {1,5,8,9,7,6,4};
        int k = 3;

       int msum =  maxSumSubArray(array, k);
       System.out.println(msum);
    }
}
