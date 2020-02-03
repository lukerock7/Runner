
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
        int[] b = {5,4,2,1};
        System.out.println(only14(b));
        int[] c = {1,3,5,7,9,2};
        System.out.println(canBalance(c));

    }
    //Warmup 1 - makes10
    public static boolean makes10(int a, int b) {

        return (a == 10 || b == 10 || a + b == 10);
    }
    //Warmup 2 - frontTimes
    public static String frontTimes(String str, int n) {
        String result = "";
        if (str.length() <= 3)
            for (int i = 0; i < n; i++) result += str;
        else
            for (int i = 0; i < n; i++) result += str.substring(0, 3);
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
        if ((b >= 13 && b <= 19) || (a >= 13 && a <= 19))
            return 19;
        else
            return total;
    }
    //Logic-2 - loneSum
public int blackjack(int a, int b) {
    if (a > 21) a = 0;
    if (b > 21) b = 0;

    if (a > b) {
        return a;
    } else {
        return b;
    }
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
