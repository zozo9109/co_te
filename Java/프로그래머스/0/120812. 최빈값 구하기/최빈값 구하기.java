import java.util.HashMap;
// 키와 값의 집합을 저장하는 자료구조
// 키를 기반으로 값을 검색하므로 빠른 검색 속도를 제공
// HashMap을 사용하여 각 값의 출현 횟수 저장하고, 그중 가장 많이 나타난 값 찾음

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        // 각 값이 나타난 횟수를 저장할 Map 생성
        // Map은 키와 value 한쌍으로 저장되는 인터페이스
        // <Integer, Integer> 키와 값 모두 정수 타입만 받겠다는 형식
        // 실수 타입을 받는다면 Map<Double Double>
        
        
        //배열을 돌면서 각 값이 나타난 횟수를 카운트
        for(int i = 0; i < array.length; i++){
		        int num = array[i];
            countMap.put(num, countMap.getOrDefault(num, 0) +1); 
            //num 키가 존재하지 않으면 기본값으로 0을 사용!
            //getOrDefault(num, 0) 현재 배열에서 발견한? 숫자가 이미 등록되어 있는지 확인
            // 처음인 숫자면 0 가져오고 이미 ~번 등장했다면 기존 값인 ~ 가져옴
        }
        
        int maxCount = 0; // 젤 많은 횟수
        int answer = 0; //최빈값
        
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        
        //map을 돌면서 가장 많이 나타난 횟수와 값 찾기
for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();    // 숫자(Key)
            int count = entry.getValue(); // 빈도수(Value)
            
            if(count > maxCount){
                maxCount = count;
                answer = num;
            }
            else if(count == maxCount){
                answer = -1;
            }
        }     
        return answer;
    }
}