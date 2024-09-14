public class LinkedList {

    private AirportNode headNode;

    public void addNode(String sAirportID) {

        // create new node
        AirportNode oNode = new AirportNode();

        // fill in data
        oNode.airportID = sAirportID;

        // next to head node
        oNode.nextNode = headNode;

        // set headNode to new node
        headNode = oNode;

    } // this curly brace will remove oNode via garbage collector

    public AirportNode getHeadNode() {
        return headNode;
    }

}
