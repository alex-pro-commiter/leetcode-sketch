package L883_Projection_Area_of_3D_Shapes;

public class L883 {
    public static void main(String[] args) {
        int[][] grid={{1,2},{3,4}};
        int top=0,unit=0,row=0;
        int[] unitMax=new int[grid.length];
        int[] rowMax=new int[grid[0].length];
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){

                if (grid[i][j]>=1){
                    top++;
                }
                if (grid[i][j]>unitMax[i]){
                    unitMax[i]=grid[i][j];
                }
                if (grid[j][i]>rowMax[i]){
                    rowMax[i]=grid[j][i];
                }
            }
            unit=unit+unitMax[i];
            row=row+rowMax[i];

        }
        System.out.println(top+unit+row);
    }
}
