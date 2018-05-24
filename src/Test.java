import java.util.LinkedList;
import java.util.List;

/**
 * Created by xueliang on 14-10-31.
 */
public class Test {
        public static void main(String[] args) {
                List<Interval> list = new LinkedList<>();
                list.add(new Interval(1, 2));
                list.add(new Interval(3, 5));
                list.add(new Interval(6, 7));
                list.add(new Interval(8, 10));
                list.add(new Interval(12, 16));
                InsertInterval i = new InsertInterval();
                List<Interval> res = i.insert(list, new Interval(4, 8));
                for (Interval x : res) {
                        System.out.println(x.start + "  " + x.end);
                }
        }
}
