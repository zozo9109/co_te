class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        //문자열을 한개씩 나눠야 구분 가능하니
        String[] rsps = rsp.split("");
        
        
        for(String r : rsps){
            if(r.equals("2")){
                sb.append("0");
            }
            else if(r.equals("0")){
                sb.append("5");
            }
            else if(r.equals("5")){
                sb.append("2");
            }       
        }
        return sb.toString();
        
    }
}