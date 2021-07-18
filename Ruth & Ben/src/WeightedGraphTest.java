import static org.junit.jupiter.api.Assertions.*;

class WeightedGraphTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void findCheapestPath() {
        WeightedGraph weightedGraph = new WeightedGraph(5);
        int a = weightedGraph.addNode("A");
        int b = weightedGraph.addNode("B");
        int c = weightedGraph.addNode("C");
        int d = weightedGraph.addNode("D");
        int e = weightedGraph.addNode("E");

        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(b), 1);
        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(d), 2);
        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(c), 3);
        weightedGraph.addEdge(weightedGraph.getNode(b),weightedGraph.getNode(d), 3);
        weightedGraph.addEdge(weightedGraph.getNode(b),weightedGraph.getNode(e), 4);
        weightedGraph.addEdge(weightedGraph.getNode(d),weightedGraph.getNode(e), 1);
        weightedGraph.addEdge(weightedGraph.getNode(d),weightedGraph.getNode(c), 2);
        weightedGraph.addEdge(weightedGraph.getNode(c),weightedGraph.getNode(e), 5);

        String result = weightedGraph.findCheapestPath(weightedGraph.getNode(a),weightedGraph.getNode(e));
        System.out.println("Cheapest1: " +result);
        assertEquals("A-D-E (cost:3)", result);
    }

    @org.junit.jupiter.api.Test
    void findShortestPath() {
        WeightedGraph weightedGraph = new WeightedGraph(6);
        int a = weightedGraph.addNode("A");
        int b = weightedGraph.addNode("B");
        int c = weightedGraph.addNode("C");
        int d = weightedGraph.addNode("D");
        int e = weightedGraph.addNode("E");
        int f = weightedGraph.addNode("F");

        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(b), 1);
        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(d), 1);
        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(c), 5);
        weightedGraph.addEdge(weightedGraph.getNode(c),weightedGraph.getNode(e), 5);
        weightedGraph.addEdge(weightedGraph.getNode(c),weightedGraph.getNode(b), 1);
        weightedGraph.addEdge(weightedGraph.getNode(b),weightedGraph.getNode(f), 1);
        weightedGraph.addEdge(weightedGraph.getNode(f),weightedGraph.getNode(e), 1);

        String result = weightedGraph.findShortestPath(weightedGraph.getNode(a),weightedGraph.getNode(e));
        System.out.println("Shortest1: " +result);
        assertEquals("A-C-E", result);
    }

    @org.junit.jupiter.api.Test
    void findShortestPath2() {
        WeightedGraph weightedGraph = new WeightedGraph(5);
        int a = weightedGraph.addNode("A");
        int b = weightedGraph.addNode("B");
        int c = weightedGraph.addNode("C");
        int d = weightedGraph.addNode("D");
        int e = weightedGraph.addNode("E");

        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(b), 1);
        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(d), 2);
        weightedGraph.addEdge(weightedGraph.getNode(a),weightedGraph.getNode(c), 3);
        weightedGraph.addEdge(weightedGraph.getNode(b),weightedGraph.getNode(d), 3);
        weightedGraph.addEdge(weightedGraph.getNode(b),weightedGraph.getNode(e), 4);
        weightedGraph.addEdge(weightedGraph.getNode(d),weightedGraph.getNode(e), 1);
        weightedGraph.addEdge(weightedGraph.getNode(d),weightedGraph.getNode(c), 2);
        weightedGraph.addEdge(weightedGraph.getNode(c),weightedGraph.getNode(e), 5);

        String result = weightedGraph.findShortestPath(weightedGraph.getNode(a),weightedGraph.getNode(e));
        System.out.println("Shortest2: " +result);
        assertEquals("A-D-E", result);
    }
}