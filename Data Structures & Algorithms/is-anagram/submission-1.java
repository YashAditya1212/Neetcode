class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;}
            char [] charArr= s.toCharArray();
            char [] charArr2= t.toCharArray();
            Arrays.sort(charArr);
            Arrays.sort(charArr2);
        return Arrays.equals(charArr,charArr2);
    }
}
