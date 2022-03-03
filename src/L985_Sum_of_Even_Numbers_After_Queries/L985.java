package L985_Sum_of_Even_Numbers_After_Queries;

import java.util.Arrays;

public class L985 {
    public static void main(String[] args) {
        int[][] queries={{1,0},{-3,1},{-4,0},{2,3}};
        int[] A={1,2,3,4};
        int[] result=new int[queries.length];
        int temp = 0;
        for (int e:A
             ) {
            if (e%2==0)temp+=e;
        }
        for (int i = 0; i <queries.length ; i++) {

            if (A[queries[i][1]]%2==0)temp-=A[queries[i][1]];
            A[queries[i][1]]+=queries[i][0];
            if (A[queries[i][1]]%2==0)temp+=A[queries[i][1]];
            result[i]=temp;
        }
        System.out.println(Arrays.toString(result));
    }
}
