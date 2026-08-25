class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] frequencyS = new int[26];
        int[] frequencyT = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyS[c-'a']++;
            c = t.charAt(i);
            frequencyT[c-'a']++;
        }

        for(int i = 0; i < frequencyS.length; i++) {
            if(frequencyS[i] != frequencyT[i]) return false;
        }
        return true;
    }
}
