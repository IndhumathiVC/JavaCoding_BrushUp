package JavaPracticePrograms;

import java.util.Arrays;

public class PalindromeArray {
    public static void main(String [] args){
        int arr[] = {1,2,3,2,1};
        int len = arr.length;
        int rev[] = new int[len];
        int j = 0;
        boolean isPalindrome = true;
        System.out.println("Input Array is: " +(Arrays.toString(arr)));
        for(int i = len-1; i>=0;i--){
            rev[j] = arr[i];
            j++;
        }
        System.out.println("Reversed Array is: " +(Arrays.toString(rev)));
        for(int i=0;i<len; i++){
            if(rev[i] != arr[i]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println((Arrays.toString(arr))+ " is a Palindrome Array");
        }
        else{
            System.out.println((Arrays.toString(arr))+ " is not a Palindrome Array");
        }
    }
}
