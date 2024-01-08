package everyDay;

import javax.lang.model.element.VariableElement;
import java.util.HashMap;

public class NumberOfBoomerangs {

    public static void main(String[] args) {
        int[][] points={{0,0},{1,0},{2,0}};

        int n = points.length;
        int result=0;

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i==j)continue;
                int x = points[i][0] - points[j][0],y = points[i][1] - points[j][1];
                int tag = x*x+y*y;

                map.put(tag,map.getOrDefault(tag,0)+1);
            }
            for (Integer p : map.values()){
                System.out.println(p);
                result += p*(p-1);
            }
        }
    }


}
