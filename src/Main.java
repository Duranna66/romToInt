import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Character, Integer> map = new HashMap<>();
    static{
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('M', 1000);
        map.put('C', 100);
        map.put('D', 500);
    }
    public static void main(String[] args) {
        System.out.println(romanToInteger("XXX"));
    }
    public static int romanToInteger(String s)
    {
        if(s.length() == 0)
            return 0;
        int prev = 0;
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--)
        {
            //System.out.println(i);
            int cur = map.get(s.charAt(i));
            if(cur < prev)
            {
                res -= cur;
            }
            else {
                res += cur;
            }
            prev = cur;
        }
        return res;
    }
}