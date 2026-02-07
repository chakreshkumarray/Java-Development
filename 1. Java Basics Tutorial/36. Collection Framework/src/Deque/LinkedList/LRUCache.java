package Deque.LinkedList;
import java.util.*;

public class LRUCache {

    private final int cap;
    private final LinkedList<Integer> deque = new LinkedList<>();
    private final Set<Integer> set = new HashSet<>();

    public LRUCache(int cap) {
        this.cap = cap;
    }

    void refer(int x) {
        if (!set.contains(x)) {
            if (deque.size() == cap) {
                set.remove(deque.removeLast());
            }
        } else {
            deque.remove((Integer) x);
        }
        deque.addFirst(x);
        set.add(x);
    }

    public static void main(String[] args) {
        LRUCache c = new LRUCache(3);
        c.refer(1);
        c.refer(2);
        c.refer(3);
        c.refer(1);
        c.refer(4);
        System.out.println(c.deque);
    }
}

