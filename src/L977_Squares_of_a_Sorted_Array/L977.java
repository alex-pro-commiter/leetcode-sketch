package L977_Squares_of_a_Sorted_Array;

import java.util.Arrays;

public class L977 {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        int[] powArr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            powArr[i]=arr[i]*arr[i];
        }
        Arrays.sort(powArr);
        for (int i:powArr
             ) {
            System.out.println(i);

        }
    }
}
