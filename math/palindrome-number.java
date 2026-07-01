class Solution {
    public boolean isPalindrome(int x) {
        String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();

        if(reversed.equals(String.valueOf(x))) {
            return true;
        } else return false;
    }
}