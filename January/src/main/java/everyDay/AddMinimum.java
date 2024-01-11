package everyDay;

import java.util.Arrays;

public class AddMinimum {

    public static void main(String[] args) {

        String test = "aaabbc";
        String replace = test.replace("abc", "d");
        String replace1 = replace.replace("ab", "e");
        String replace2 = replace1.replace("ac", "f");
        String replace3 = replace2.replace("bc", "g");
        String[] split = replace3.split("");
        int result1=0;
        for (String s : split) {

            if (s.equals("a")||s.equals("c")||s.equals("b")){
                result1=result1+2;
            }
            if (s.equals("e")||s.equals("f")||s.equals("g")){
                result1=result1+1;
            }
        }
        System.out.println(result1);
    }
}
