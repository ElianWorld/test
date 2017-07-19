import java.util.ArrayList;
import java.util.HashMap;

public class Ö÷ÔªËØ {

	public static int majorityNumber(ArrayList<Integer> nums) {
        // write your code
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.size();i++)
        {
        	int a = nums.get(i);
        	int num = 0;
        	if(map.get(a) != null)
        	num = map.get(a);
        	num = num + 1;
        	if(num >= nums.size()/2) return a;
        	map.put(a, num + 1);
        }
        return 0;
    }
}
