
public class ÅÐ¶Ï×Ö·û´®ÊÇ·ñÃ»ÓÐÖØ¸´×Ö·û {

	/**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        int array[] = new int[300];
        for(int i = 0;i<str.length();i++)
        {
        	char a = str.charAt(i);
        	if(array[a] != 1) array[a] = 1;
        	else return false;
        }
        return true;
    }
}
