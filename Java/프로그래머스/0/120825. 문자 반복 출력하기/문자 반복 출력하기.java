class Solution {
    public String solution(String my_string, int n) {
        StringBuffer str = new StringBuffer();
        //new StringBuffer(my_string) -> my_string 내용 출력됨
        for(int i = 0; i < my_string.length(); i++){
            char result = my_string.charAt(i);
            for(int j = 0; j < n; j++){
                str.append(result);
            }
        }
        return str.toString();
    }
}

