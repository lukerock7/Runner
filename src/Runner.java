
public class Runner {
    public Runner(){

    }
    public static void main(String[] args) {
        System.out.println(makes10(10, 5));
        System.out.println(frontTimes("Albinson",14/15));
        System.out.println(firstTwo("Hello"));
        int[] a = {2,3,4};
        System.out.println(fix23(a));
        System.out.println(teenSum(13,19));
        System.out.println(loneSum(18,18,18));
        System.out.println(countHi("hihihihihihi"));
        System.out.println(sumDigits("Albinsongivesyou14outof15"));
        int[] a = {5,4,2,1};
        System.out.println(only14(a));
        int[] a = {1,3,5,7,9,2};
        System.out.println(canBalance(a));

    }
    //Warmup 1 - makes10
    public static boolean makes10(int a, int b) {

        return (a == 10 || b == 10 || a + b == 10);
    }
    //Warmup 2 - frontTimes
    public static String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
    //String-1 - firstTwo
    public static String firstTwo(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }
    //Array-1 - fix23
    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3){
            nums[1] = 0;
            return nums;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
            return nums;
        } else
            return nums;
    }
    //Logic-1 - teenSum
    public static int teenSum(int a, int b) {
        int total = a+b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
            return 19;
        else
            return total;
    }
    //Logic-2 - loneSum
    public static int loneSum(int a, int b, int c) {
        int sum = 0;

        if(a != b && a != c)
            sum += a;

        if(b != a && b != c)
            sum += b;

        if(c != a && c != b)
            sum += c;

        return sum;
    }
    //String-2 - countHi
    public static int countHi(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i, i + 2).equals("hi"))
                count++;
        }

        return count;
    }
    //String-3 - sumDigits
    public static int sumDigits(String str) {
        int total = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                total = total + str.charAt(i) - '0';
        }

        return total;
    }
    //Array-2 - only14
    public static boolean only14(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 1 && nums[i] != 4)
                return false;
        }

        return true;
    }
    //Array-3 - canBalance
    public static boolean canBalance(int[] nums) {
        int firstside = 0;
        int secondside = 0;

        for(int i = 0; i < nums.length; i++)
            secondside += nums[i];

        for(int i = 0; i <= nums.length - 2; i++) {
            firstside += nums[i];
            secondside -= nums[i];

            if(firstside == secondside)
                return true;
        }

        return false;
    }
}