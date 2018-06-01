import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, Node> map;
    Node head, tail;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        head = new Node(-1, -1, null, null);
        tail = new Node(-1, -1, head, null);
        head.next = tail;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            touchNode(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            touchNode(node);
        } else {
            Node node = new Node(key, value);
            if (map.size() >= capacity) {
                map.remove(delNode());
            }
            addNode(node);
            map.put(key, node);
        }
    }

    private int delNode() {
        Node node = tail.pre;
        node.pre.next = tail;
        tail.pre = node.pre;
        return node.key;
    }

    private void addNode (Node node) {
        head.next.pre = node;
        node.next = head.next;
        node.pre = head;
        head.next = node;
    }

    private void touchNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        head.next.pre = node;
        node.next = head.next;
        node.pre = head;
        head.next = node;
    }

    class Node{
        Node pre, next;
        int key, value;

        public Node(int key, int value, Node pre, Node next) {
            this.key = key;
            this.value = value;
            this.pre = pre;
            this.next = next;
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }
}
