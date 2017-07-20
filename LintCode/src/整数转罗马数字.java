public class Solution {
    /**
     * @param n The integer
     * @return Roman representation
     */
    public String intToRoman(int number) {
        // Write your code here
        int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                "V", "IV", "I" };
        String roman = "";
        int i = 0;
        while (number != 0) {
            if (number >= base[i]) {
                number -= base[i];
                roman += str[i];
            } else
                i++;
        }
        return roman;
    }
    
}