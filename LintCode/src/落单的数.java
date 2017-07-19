
public class Âäµ¥µÄÊı {

	/**
     *@param A : an integer array
     *return : a integer 
     */
   public int singleNumber(int[] A) {
       // Write your code here
       int flag = 0;
       for(int i = 0;i<A.length;i++)
       {
    	   flag = flag^A[i];
       }
       return flag;
   }
}
