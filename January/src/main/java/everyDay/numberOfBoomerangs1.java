package everyDay;

import java.util.HashMap;

public class numberOfBoomerangs1 {

    public static void main(String[] args) {

        int[][] points={{0,0},{1,0},{2,0}};

        int n = points.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j=0;j<n;j++) {
                if (i==j)continue;
                int x = points[i][0] - points[j][0], y = points[i][1] - points[j][1];
                int dist = x*x+y*y;
                map.put(dist,map.getOrDefault(dist,0)+1);
            }
            System.out.println(map.size());

            for (int dist : map.keySet()) {
                int cnt = map.get(dist);
                System.out.println("---"+cnt);
                ans += cnt*(cnt - 1);
            }
        }
        System.out.println(ans);

    }
}
