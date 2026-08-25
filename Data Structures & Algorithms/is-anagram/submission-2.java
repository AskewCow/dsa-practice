class Solution {
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
    	
        int[] sCharacters = new int[26];
        int[] tCharacters = new int[26];

        for(int i = 0; i < s.length(); i++) {
        	sCharacters[s.charAt(i)-97] += 1;
        }
        for(int i = 0; i < t.length(); i++) {
        	tCharacters[t.charAt(i)-97] += 1;
        }
        for(int i = 0; i < 26; i++) {
        	if(sCharacters[i] - tCharacters[i] != 0) return false;
        }
        
        return true;  // placeholder return to compile
    }
}
