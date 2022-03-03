package L771_Jewels_and_Stones;

import java.util.StringTokenizer;

public class L771 {
    public static void main(String[] args) {
        String st=new String("aAAbbbb");
        int before=st.length();
        String rep=new String("aA");
        for (int i=0;i<rep.length();i++){
            String temp=Character.toString(rep.charAt(i));
            st=st.replace(temp,"");
        }
        int after=before-st.length();
        System.out.println(after);
    }
}
