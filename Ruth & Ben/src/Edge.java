public class Edge {
    int weight;
    Node startNode;
    Node endNode;

    public Edge(Node startNode, Node endNode, int weight){
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
    }
}
