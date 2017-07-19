
public class ì³²¨ÄÉÆõÊıÁĞ {
	/**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(n == 1) return 0;
        if(n == 2) return 1;
        int a = 0,b = 1,result = 0;
        for(int i = 0;i < n - 2; i++)
        {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

}
