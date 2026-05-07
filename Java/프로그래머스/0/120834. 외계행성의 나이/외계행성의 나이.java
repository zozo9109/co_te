class Solution {
    public String solution(int age) {

        StringBuilder sb = new StringBuilder();

        while (age > 0) {

            // 마지막 자리 숫자 빼내기!
            int k = age % 10;

            char c = (char)(k + 'a');
            sb.insert(0, c);
            // 마지막 자리 제거하기!
            age = age / 10;
        }

        return sb.toString();
    }
}