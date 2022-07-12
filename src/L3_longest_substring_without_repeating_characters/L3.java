package L3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class L3 {
    public static void main(String[] args) {
        String s = "abcabcdabcde";

        int len=s.length(),ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int start=0,end=0; end < len; end++) {
            Character c=s.charAt(end);
            if (map.containsKey(c)){
                start=Math.max(map.get(c),start);
            }
            ans=Math.max(end-start+1,ans);
            map.put(c,end+1);
        }
        System.out.println(ans);
    }
}
