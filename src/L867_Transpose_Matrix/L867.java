package L867_Transpose_Matrix;

import java.util.Arrays;

public class L867 {
    public static void main(String[] args) {
        int[][] mat1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2={{1,2,3},{4,5,6}};
        int[][] trans=new int[mat2[0].length][mat2.length];
        for (int k=0;k<trans.length;k++){
            for (int l=0;l<trans[0].length;l++){
                trans[k][l]=mat2[l][k];
            }
        }
        for (int z=0;z<trans.length;z++) {
            System.out.print(Arrays.toString(trans[z]));
        }
    }
}
