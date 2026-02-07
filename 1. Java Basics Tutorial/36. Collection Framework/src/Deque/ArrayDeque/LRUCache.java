package Deque.ArrayDeque;
import java.util.*;

public class LRUCache {

    private final int capacity;
    private final ArrayDeque<Integer> deque = new ArrayDeque<>();
    private final HashSet<Integer> set = new HashSet<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public void refer(int page) {

        if (!set.contains(page)) {
            if (deque.size() == capacity) {
                int last = deque.removeLast();
                set.remove(last);
            }
        } else {
            deque.remove(page);
        }

        deque.addFirst(page);
        set.add(page);
    }

    public void display() {
        for (int page : deque) {
            System.out.print(page + " ");
        }
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);

        cache.display(); // 4 1 3
    }
}

