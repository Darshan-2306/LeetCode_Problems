class Solution {
    public int firstUniqChar(String s) {
        int [] n = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            n[c-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(n[c-'a']<2){
                return i;
            }
        }
        return -1;
    }
}