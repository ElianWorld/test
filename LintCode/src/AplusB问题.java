
public class AplusBÎÊÌâ {
	/*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        int sum = 0;
        int flag = 1;
        while(flag != 0)
        {
            sum = a ^ b;
            flag = (a & b) << 1;
            a = sum;
            b = flag;
        }
        return sum;
    }
}
it's a laji!
