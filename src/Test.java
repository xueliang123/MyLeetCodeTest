import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xueliang on 14-10-31.
 */
public class Test {
        public static void main(String[] args) {
            LRUCache c = new LRUCache(1);
            c.put(2, 1);
            System.out.println(c.get(2));
            c.put(3, 2);
            System.out.println(c.get(2));
            System.out.println(c.get(3));
        }
}
