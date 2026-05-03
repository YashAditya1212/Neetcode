class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if the strings have a common repeating pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Find the greatest common divisor of their lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The GCD string is just the prefix of that length
        return str1.substring(0, gcdLength);
    }
    
    // Helper function to calculate the mathematical GCD of two numbers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}