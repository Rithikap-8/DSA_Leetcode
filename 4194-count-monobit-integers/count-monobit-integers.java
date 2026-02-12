class Solution {

    public boolean isMonobit(int val){
        String binary = Integer.toBinaryString(val);
        char first = binary.charAt(0);
        for(int i=1;i<binary.length();i++){
            if(binary.charAt(i) != first){
                return false;
            }
        }
        return true;
    }
    public int countMonobit(int n) {
        int count = 0;
        for(int i=0;i<=n;i++){
            if(isMonobit(i)){
                count++;
            }    
        }
        return count;
    }
}