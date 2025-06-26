class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        int idx=0;
        
        for(int i=0; i<number.length()-k; i++){
            char max ='0';
            
            for(int j=idx; j<=k+i; j++){
                if(number.charAt(j)>max){
                    max=number.charAt(j);
                    
                    idx=j+1;
                }
            }
            sb.append(max);
        }
        
        
        return sb.toString();
    }
}