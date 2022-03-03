package L657_Robot_Return_to_Origin;

public class L657 {
    public static void main(String[] args) {
        String opr=new String("UDLR");
        int[] position={0,0};
        for (int i=0;i<opr.length();i++){
            switch (opr.charAt(i)){
                case 'U':
                    position[0]++;
                    break;
                case 'D':
                    position[0]--;
                    break;
                case 'R':
                    position[1]++;
                    break;
                case 'L':
                    position[1]--;
                    break;
            }
        }
        if (position[0]==0&&position[1]==0){
            System.out.println("true");
        }else System.out.println("false");
    }
}
