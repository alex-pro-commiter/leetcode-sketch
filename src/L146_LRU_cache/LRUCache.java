package L146_LRU_cache;


import java.util.HashMap;
import java.util.Map;


public class LRUCache {
    //define two-linked-list data structure
    class DlinkedNode{
        int key,value;
        DlinkedNode prev,next;
        DlinkedNode(){}
        DlinkedNode(int _key,int _value){
            key=_key;
            value=_value;
        }
    }
    //using hashmap implement O(1) time complex search usage
    private Map<Integer,DlinkedNode> cache=new HashMap<>();
    private int capacity,size;
    private DlinkedNode head,tail;

    //define initial LRU method
    LRUCache(int _capacity){
        capacity=_capacity;
        size=0;
        head=new DlinkedNode();
        tail=new DlinkedNode();
        head.next=tail;
        tail.prev=head;
    }

    //define get value by key method
    //if key not in cache return -1
    //else move node to head then return value
    public int get(int _key){
        DlinkedNode node=cache.get(_key);
        if (node==null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key,int value){
        DlinkedNode node=cache.get(key);
        //if node doesn't exist,create new node and put it in cache
        //then add it to head
        if (node==null){
            DlinkedNode newNode=new DlinkedNode(key,value);
            cache.put(key,newNode);
            addToHead(newNode);
            size=size+1;
            //if add this node touch the capacity bar
            //remove the last one
            if (size>capacity){
                DlinkedNode tail=removeTail();
                cache.remove(tail.key);
                size=size-1;
            }
            //if this node already existing,set it and move it to head
        }else {
            node.value=value;
            moveToHead(node);
        }
    }

    private DlinkedNode removeTail() {
        DlinkedNode res=tail.prev;
        remove(res);
        return res;
    }

    private void remove(DlinkedNode node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void addToHead(DlinkedNode node) {
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    private void moveToHead(DlinkedNode node) {
        remove(node);
        addToHead(node);
    }
}
