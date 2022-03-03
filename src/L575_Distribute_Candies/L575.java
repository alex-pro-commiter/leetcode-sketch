package L575_Distribute_Candies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L575 {
    public static void main(String[] args) {
        int[] candies={1,1,1,1,2,2,2,3,3,3};
        Set tempSet= new HashSet();
        for (int val:candies
             ) {
            tempSet.add(val);
        }
        int result=tempSet.size();
        if (result>candies.length/2){
            result=candies.length/2;
        }
        System.out.println(result);
    }
}
