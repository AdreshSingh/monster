import java.util.Scanner;

public class MidLinkList {
    static class LinkNode {
        int value;
        LinkNode next;

        LinkNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkNode midNode(LinkNode head) {
        if (head == null) {
            return null;
        }

        LinkNode slow = head;
        LinkNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Item count:");
        int n = sc.nextInt();

        LinkNode headNode = new LinkNode(sc.nextInt());
        LinkNode currentNode = headNode;

        for(int i=1; i<n; i++){
            currentNode.next = new LinkNode(sc.nextInt());
            currentNode = currentNode.next;
        }

        System.out.println("Mid value: " + midNode(headNode).value);
        // LinkNode now = headNode;
        // while (now != null) {
        //     System.out.println(now.value);
        //     now = now.next;
        // }

        sc.close();
    }
}
