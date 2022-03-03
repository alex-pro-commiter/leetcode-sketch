package L412_Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class L412 {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        int n=15;
        for (int i = 1; i <=n; i++) {
            if (i%3==0&&i%5==0){
                arrayList.add("FizzBuzz");
            }else{
                if (i%5==0){
                    arrayList.add("Buzz");
                }else
                    if (i%3==0){
                        arrayList.add("Fizz");
                    }else {
                        arrayList.add(Integer.toString(i));
                    }
            }
        }
        for (String s:arrayList
             ) {
            System.out.println(s);
        }
    }
}
