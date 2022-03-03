package L344_Reverse_String;

public class L344 {
    public static void main(String[] args) {
        char[] chars={'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ',' ','a',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'};
        System.out.println(chars.length);
        char temp;
        if (chars.length!=0){
        for (int i=0;i<chars.length/2;i++){
            temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        for (char c:chars
             ) {
            System.out.print(c);
        }
        }
    }
}
