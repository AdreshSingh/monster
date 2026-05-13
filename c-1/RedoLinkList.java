public class RedoLinkList {
    public static void main(String[] args) {
        LinkList<Integer> data = new LinkList<>();

        data.add(1);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);

        data.print();

        System.out.print(data.size);
        
    }

}

class LinkList<T> {
    
    LinkNode head;
    int size;

     class LinkNode {
        T value;
        LinkNode next;

        LinkNode() {
        }

        LinkNode(T value) {
            this.value = value;
            this.next = null;
        }
    }

    void add(T data) {
        if (head == null) {
            head = new LinkNode(data);
        }

        LinkNode curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = new LinkNode(data);

        size++;
    }

    void print() {
        if (head == null) {
            System.out.print("nothing to print");
        }

        LinkNode curLinkNode = head;
        while (curLinkNode.next != null) {
            System.out.println(curLinkNode.value);
            curLinkNode = curLinkNode.next;
        }
    }
}