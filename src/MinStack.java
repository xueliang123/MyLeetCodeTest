public class MinStack {
    int size;
    Entry t;

    public MinStack() {
        size = 0;
        t = null;
    }

    public void push(int x) {
        Entry entry = new Entry(x);
        if (t != null) {
            entry.min = Math.min(x, t.min);
        } else {
            entry.min = x;
        }
        entry.pre = t;
        t = entry;
    }

    public void pop() {
        t = t.pre;
    }

    public int top() {
        return t.value;
    }

    public int getMin() {
        return t.min;
    }

    class Entry {
        int value;
        Entry pre;
        int min;
        public Entry(int value) {
            this.value = value;
        }
    }
}
