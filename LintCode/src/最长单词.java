class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> result = new ArrayList<>();
        int maxLength = 0;
        for(int i = 0;i < dictionary.length;i++)
        {
            String str = dictionary[i];
            if(str.length() == maxLength)
            {
                result.add(str);
            }
            else if(str.length() < maxLength) continue;
            else {
                maxLength = str.length();
                result.clear();
                result.add(str);
            }
        }
        return result;
    }
};