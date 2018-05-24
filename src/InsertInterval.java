import java.util.LinkedList;
import java.util.List;

public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result =  new LinkedList<>();
        Interval insertInterval = new Interval(newInterval.start, newInterval.end);
        int begin = 0, finish = intervals.size() - 1;
        while (begin <= finish) {
            int mid = (begin + finish) >> 1;
            if (newInterval.start > intervals.get(mid).end) {
                begin = mid + 1;
            } else if (newInterval.start < intervals.get(mid).start) {
                finish = mid - 1;
            } else {
                insertInterval.start = intervals.get(mid).start;
                break;
            }
        }
        begin = 0;
        finish = intervals.size() - 1;
        while (begin <= finish) {
            int mid = (begin + finish) >> 1;
            if (newInterval.end < intervals.get(mid).start) {
                finish = mid - 1;
            } else if (newInterval.end > intervals.get(mid).end) {
                begin = mid + 1;
            } else {
                insertInterval.end = intervals.get(mid).end;
                break;
            }
        }
        boolean flag = true;
        for (Interval i : intervals) {
            if (i.end < insertInterval.start) {
                result.add(i);
            } else if (i.start > insertInterval.end) {
                if (flag) {
                    result.add(insertInterval);
                    flag = false;
                }
                result.add(i);
            } else {
                if (flag) {
                    result.add(insertInterval);
                    flag = false;
                }
            }
        }
        if (flag) {
            result.add(insertInterval);
        }
        return result;
    }
}

