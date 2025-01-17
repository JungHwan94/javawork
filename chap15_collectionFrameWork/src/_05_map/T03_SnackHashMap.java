package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T03_SnackHashMap {
    public static void main(String[] args) {
        HashMap<String, Snack> map = new HashMap<>();

        map.put("새우깡", new Snack("새우맛", 500));
        map.put("초코송이", new Snack("초코맛", 190));
        map.put("포카칩", new Snack("감자맛", 377));
        map.put("꿀꽈배기", new Snack("꿀맛", 450));

        for (String key : map.keySet()) { 
            System.out.println(key + " -> " + map.get(key));
        }
        // 객체를 하나씩 출력
		// entrySet()
		
		// Set entry = map.entrySet();
        Set<Map.Entry<String, Snack>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Snack>> iter = entrySet.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Snack> entry = iter.next();

            String key = entry.getKey();
            Snack value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
