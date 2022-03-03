package L566_Reshape_the_Matrix;

public class L566 {
    public static void main(String[] args) {
        int[][] origin={{1,2},{3,4}};
        int r=1,c=4;
        int[][] reshape=new int[r][c];
        int row=origin.length;
        int column=origin[0].length;
        int[] temp=new int[row*column];
        int tempStart=0;
        int restart=0;
        if (r*c>row*column){
            System.out.println("输出原始");;
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                temp[tempStart]=origin[i][j];
                tempStart++;
            }
        }
        for (int k=0;k<r;k++){
            for (int l=0;l<c;l++){
//                reshape[k][l]=temp[restart];
                System.out.println(restart);
                restart++;
            }
        }
        System.out.println("输出reshape");
    }
}
