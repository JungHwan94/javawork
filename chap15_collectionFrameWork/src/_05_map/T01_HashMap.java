package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T01_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 넣기: put(key,value)
		map.put("김민지", 87);
		map.put("팜하니", 98);
		map.put("카리나", 82);
		map.put("GD", 99);
		System.out.println("entry수: "+ map.size());
		
		// 객체 얻어오기: get(key)
		System.out.println(map.get("GD"));
		System.out.println(map);
		System.out.println();
		
		// 객체 삭제: remove(key)
		map.remove("카리나");
		System.out.println("" + map);
		
		// 동일한 키로 값 넣기(기존의 값 변경)
		map.put("팜하니", 73);
		System.out.println(map);
		
		// 객체 하나씩 출력 하려면
		Set<String> keySet = map.keySet();
		Iterator<String> keyInter = keySet.iterator();
		while(keyInter.hasNext()) {
			String key = keyInter.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		
	}
}
