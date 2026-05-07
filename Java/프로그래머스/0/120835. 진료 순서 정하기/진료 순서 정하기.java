class Solution {
    public int[] solution(int[] emergency) {

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int count = 0;
            for (int j = 0; j < emergency.length; j++) {
                //현재보다 더 큰 값이 몇개인지..
              if (emergency[i] < emergency[j]) {
                    count++;
                }
            }
            // 현재 순위 저장
            answer[i] = count + 1;
        }

        return answer;
    }
}