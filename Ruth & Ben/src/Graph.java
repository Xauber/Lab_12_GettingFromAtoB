public interface Graph {

    int addNode(String name);

    void printGraph();

    String findShortestPath(Node startNode, Node endNode);

    String findCheapestPath(Node startNode, Node endNode);
}
