package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("student1", 90);
        System.out.println("studentMap = " + studentMap);

        studentMap.put("student1", 110); //같은 키에 저장시 기존 값 교체
        System.out.println("studentMap = " + studentMap);

        boolean containsKey = studentMap.containsKey("student1"); //true
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 값 삭제
        studentMap.remove("student1");
        System.out.println("studentMap = " + studentMap);
    }
}
