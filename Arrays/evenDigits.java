package Arrays;

public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {23,3,1,432,3212,4323,3};
        int ans = findNumber(nums);
        System.out.println(ans);
    }
    static int findNumber(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check whethera number contains even digits or not 
    static boolean even(int num){
        int numberOfDigits = digits(num);
        /*
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false; 
        */
        return numberOfDigits % 2 == 0 ;
    }
    // counts in a number of digits in a number
    static int digits(int num){

        if (num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
