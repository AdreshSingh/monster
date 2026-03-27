class LinkListLearn {
    static class LinkNode {
        int data;
        LinkNode next;

        LinkNode(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "data: " + this.data + " next" + this.next;
        }
    }

    static void traverse(LinkNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static LinkNode add(LinkNode head, int data) {
        
        LinkNode newNode = new LinkNode(data);
        if (head == null) {
            head = newNode;
            return head;
        }

        LinkNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        LinkNode head= new LinkNode(0);
        for (int i : arr) {
            head = add(head, i);
        }

        traverse(head);
    }
}