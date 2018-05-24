import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new LinkedList<>();
        if (intervals.size() == 0) {
            return res;
        }
        intervals.sort(Comparator.comparingInt(i -> i.start));
        int end = intervals.get(0).end;
        int start = intervals.get(0).start;
        for (Interval i : intervals) {
            if (i.start <= end) {
                end = Math.max(i.end, end);
            } else {
                res.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }
}

 class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}