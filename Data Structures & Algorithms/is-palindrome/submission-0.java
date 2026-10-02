class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 1) {
            System.out.println("String too short");
            return false;
        }
        String newStr = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int start = 0;
        int end = newStr.length()-1; 
        while(start < end){
            if(newStr.charAt(start) != newStr.charAt(end)){
                return false;
            }
            start = start+1;
            end = end -1;
        }
        return true;
    }
}
