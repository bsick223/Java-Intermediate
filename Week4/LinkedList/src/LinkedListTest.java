public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList oLinkedList = new LinkedList();

        oLinkedList.addNode("PAN");
        oLinkedList.addNode("MED");

        AirportNode oNode;
        oNode = oLinkedList.getHeadNode();
        System.out.println(oNode.airportID);

        oLinkedList.addNode("CAL");
        oNode = oLinkedList.getHeadNode();
        System.out.println(oNode.airportID);

    }
}
