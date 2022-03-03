package L821_Shortest_Distance_to_a_Character;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class L821 {
    public static void main(String[] args) {
        String s="loveleetcode";
        ArrayList<Integer> arr=new ArrayList();
        int[] out=new int[s.length()];
        int start=0;
        char c='e';
        ArrayList<Integer> arrayList=new ArrayList();
        Character character=c;
        for (int i=0;i<s.length();i++){
            if (character.equals(s.charAt(i))){
                arr.add(i);
            }
        }
//        for (int a:arr
//             ) {
//            System.out.println(a);
//        }
        for (int j=0;j<s.length();j++){
            arrayList.clear();
            for (int k=0;k<arr.size();k++){
                arrayList.add(Math.abs(arr.get(k)-j));
//                System.out.println(arrayList.get(k));
            }
            sort(arrayList);
            out[j]=arrayList.get(0);
//            System.out.println(out[j]);
        }




    }
}
