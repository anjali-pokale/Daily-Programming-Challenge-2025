public class Find_Missing_Num {
      public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;  
        long totalSum = (long) n * (n + 1) / 2;  
        long arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return (int) (totalSum - arrSum);  
    }

    public static void main(String[] args) {
  
        System.out.println(findMissingNumber(new int[]{1, 2, 4, 5})); 
        System.out.println(findMissingNumber(new int[]{2, 3, 4, 5})); 
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4})); 
        System.out.println(findMissingNumber(new int[]{1}));       
    }
}
