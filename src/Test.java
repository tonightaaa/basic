import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        System.out.println(findProphet(2, new int[][]{{1, 2}}));
    }

    public static int findProphet(int n, int[][] trust) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 1; i <= n; i++){
            map.put(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < trust.length; i++) {
            ArrayList<Integer> integers = map.get(trust[i][0]);
            integers.add(trust[i][1]);
        }

        int res = -1;
        int isZero = 0;
        int real = 0;
        for(int key : map.keySet()){
            ArrayList<Integer> list = map.get(key);
            if(list.size() == 0){
                res = key;
                isZero = 1;
            }
        }
        if(isZero == 1){
            for(int key : map.keySet()){
                if(key != res){
                    ArrayList<Integer> list = map.get(key);
                    if(list.contains(key)){
                        real = 1;
                        return -1;
                    }
                }
            }
        }else{
            return -1;
        }

        if(real == 0){
            return res;
        }
        return -1;
    }

    public static int solution(int n, String s) {
        // 请添加具体实现
        return 0;
    }
}
