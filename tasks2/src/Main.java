import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1| " + repeat("mice", 5));
        //int[] arr = new int[8];
        int[] arr = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println("Task 2| " + differenceMaxMin(arr));
        System.out.println("Task 3| " + isAvgWhole(arr));
        int[] arr1 = {1, 2, 3};
        System.out.println("Task 4| " + cumulativeSum(arr1));
        System.out.println("Task 5| " + getdecimalPlaces("43.20"));
        System.out.println("Task 6| " + fibbonachi(12));
        System.out.println("Task 7| " + isValid("853a7"));
        System.out.println("Task 8| " + isStrangePair("radio", "operator"));
        System.out.println("Task 9S| " + isSuffix("repotrinator", "inator"));
        System.out.println("Task 9P| " + isPrefix("automation", "auto"));
        System.out.println("Task 10| " + boxSeq(5));
    }

    public static String repeat(String str, int n) {
        String ans = "";
        for (int i = 0; i <= str.length() - 1; i++)
            for (int j = 0; j < n; j++)
                ans += str.charAt(i);
        return ans;
    }

    public static int differenceMaxMin(int[] arr) {
        int max = 0, min = 0;
        for (int i = 0; i <= arr.length - 1; i++)
            if (arr[i] < min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        return max - min;
    }

    public static boolean isAvgWhole(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if ((sum / arr.length) % 1 == 0)
            return true;
        else return false;
    }

    public static List<String> cumulativeSum(int[] arr) {
        List<String> sumArr = new ArrayList<String>();
        //int[] sumArr ={};
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            String s = "" + sum;
            sumArr.add(s);
        }
        return sumArr;
    }

    public static int getdecimalPlaces(String num) {
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i <= num.length() - 1; i++) {
            if (flag == true)
                counter++;
            if (num.charAt(i) == '.')
                flag = true;
        }
        return counter;
    }

    public static int fibbonachi(int n) {
        int ans = 1, prev = 0;
        for (int i = 1; i <= n; i++) {
            ans += prev;
            prev = ans - prev;
        }
        return ans;
    }

    public static boolean isValid(String num) {
        boolean flag = false;
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        if (num.length() > 5)
            return false;
        for (int i = 0; i <= num.length() - 1; i++) {
            flag = false;
            for (int j = 0; j <= digits.length - 1; j++) {
                if (num.charAt(i) == digits[j]) {
                    flag = true;
                }
            }
            if (flag == false)
                return flag;
        }
        return flag;
    }

    public static boolean isStrangePair(String str1, String str2) {
        if (str1.charAt(str1.length() - 1) == str2.charAt(0) && str2.charAt(str2.length() - 1) == str1.charAt(0))
            return true;
        else return false;
    }

    public static boolean isSuffix(String str, String pref) {
        String test = str.substring(str.length() - pref.length());
        if (pref.equals(str.substring(str.length() - pref.length())))
            return true;
        else return false;
    }

    public static boolean isPrefix(String str, String pref) {
        String test = str.substring(pref.length());
        if (pref.equals(str.substring(0, pref.length())))
            return true;
        else return false;
    }
    public static int boxSeq(int a)
    {
        int boxcount = 0;
        for (int i = 1 ; i<=a;i++)
            if(i%2 == 1)
                boxcount +=3;
            else boxcount--;
        return boxcount;
    }

}