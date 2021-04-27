import java.util.*;

public class ArrEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //HashMap<String, Integer> map = new HashMap<String, Integer>();
        //HashSet<Integer> set = new HashSet<Integer>();
        String[][] map = new String[n][2];
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            String[] item = sc.next().split(",");
            int discount = (int) ((Float.parseFloat(item[2]) / 100.0) * Integer.parseInt(item[1]));
            //map.put(item[0], discount);
            //set.add(discount);
            map[i][0] = item[0];
            map[i][1] = String.valueOf(discount);
            price[i] = discount;
        }
        //System.out.println(Arrays.deepToString(map));

        int min = Arrays.stream(price).min().getAsInt();
        for(int i = 0; i < n; i++){
            if(min == Integer.parseInt(map[i][1])){
                System.out.println(map[i][0]);
            }
        }
        /*if(0 < 1){
            String res = "";*/
            /*int num = Collections.min(set);
            for(Map.Entry<String, Integer> i: map.entrySet())
                if(i.getValue() == num) {
                    //num = i.getValue();
                    //res = i.getKey();
                    System.out.println(i.getKey());
                }*/
            //System.out.println(res);
        //}

    }
}