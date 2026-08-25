class Solution {
    public boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;

        while(low < high) {
            while(low < high && !alphaNum(s.charAt(low))) {
                low++;
            }
            while(low < high && !alphaNum(s.charAt(high))) {
                high--;
            }
            if(Character.toLowerCase(s.charAt(low)) != 
                Character.toLowerCase(s.charAt(high))) return false;
            high--;
            low++;
        }
        return true;
    }

    private boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || 
        c >= 'a' && c <= 'z' ||
        c >= '0' && c <= '9');
    }
    
}
