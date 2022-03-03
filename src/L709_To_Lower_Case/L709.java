package L709_To_Lower_Case;

public class L709 {
    public static void main(String[] args) {
        String str=new String("ADHHiuhahfuHUG");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>=65&&str.charAt(i)<=90){
                sb.append((char)(str.charAt(i)+32));
            }else sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
