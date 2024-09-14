public class LinkedList {

    Node headNode = new Node();

    public void addNode(int x, int y) {
        Node oNode = new Node();

        oNode.xPosition = x;
        oNode.yPosition = y;

        // set next node to head
        oNode.nextNode = headNode;

        // change head node
        headNode = oNode;

    }

    public Node removeNode() {

        // temp = head
        Node tempNode = headNode;

        // head = next .-->
        headNode = headNode.nextNode;

        return tempNode;
    }

    public Node getHeadNode(){
        return headNode;
    }
}
