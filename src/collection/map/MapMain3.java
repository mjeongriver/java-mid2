package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("student1", 50);
        System.out.println("studentMap = " + studentMap);

        //학생이 없는 경우에만 추가 1
        if (!studentMap.containsKey("student1")) {
            studentMap.put("student1", 90);
        }
        System.out.println("studentMap = " + studentMap);

        //학생이 없는 경우에만 추가 2
        studentMap.putIfAbsent("student1", 100);
        studentMap.putIfAbsent("student2", 100);
        System.out.println("studentMap = " + studentMap);

    }
}
