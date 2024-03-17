package com.xusheng.doublPointer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LruDemo {

    @Test
    public void testLruCache() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        System.out.println(lRUCache.get(3));    // 返回 3
        System.out.println(lRUCache.get(4));    // 返回 4
    }

}

class LRUCache {

    Map<Integer, Node> map = new HashMap<>();
    private Integer size;
    private Integer capacity;
    private Node head;
    private Node tail;


    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node val = map.get(key);
        if (val == null) {
            return -1;
        }
        moveToHead(val);
        return val.value;
    }

    public void put(int key, int value) {
        Node val = map.get(key);
        if (val != null) {
            val.value = value;
            moveToHead(val);
            return;
        }
        val = new Node(key, value);
        addToHead(val);
        size++;
        if (size > capacity) {
            removeTail();
            size--;
        }
    }

    private void removeTail() {
        map.remove(tail.prev.key);
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }

    private void addToHead(Node node) {
        map.put(node.key, node);
        node.prev = head;
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
    }

    private void moveToHead(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }


    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
        }
    }
}
