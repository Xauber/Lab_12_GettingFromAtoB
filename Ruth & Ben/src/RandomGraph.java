import java.util.Random;

public class RandomGraph {

    // how many vertices and edges do we want?
    // what maximal weight do we want?
    private int verts;
    private int edges;
    private int maxWeight;
    private WeightedGraph weightedGraph;


    // pass in the number of verts and edges and construct a new Weighted Graph using the generate methods
    // the Weighted Graph is constructed using the number of edges we want to have and after that adds its Nodes and edges which got randomized
    public RandomGraph(int verts, int edges, int maxWeight){
        this.verts = verts;
        this.edges = edges;
        this.maxWeight = maxWeight;
        weightedGraph = new WeightedGraph(verts);
        generateNodes(verts);
        generateRandomEdges(edges);

    }

    // generates random names for the nodes of the graph and adds a node to every position of the array of nodes inside Weighted Graph
    private void generateNodes(int vertsNumber){
        for(int i = 0; i < vertsNumber; i++){
            //get char value starting from A (+65) to choose as a name for  the added node
            char letter = (char) (i + 65);
            String name = letter +"";
            weightedGraph.addNode(name);
        }
    }

    // Takes a number of edges, and goes from 0 to that number and creates an edge with a random weight (with the bound maxWeight)
    // and connects two random nodes from the Weighted graph
    private void generateRandomEdges(int edgesNumber){
        Random r = new Random();
        for(int i = 0; i < edgesNumber; i++){
            Node start = weightedGraph.getNode(r.nextInt(verts));
            Node end = weightedGraph.getNode(r.nextInt(verts));
            weightedGraph.addEdge(start, end, r.nextInt(maxWeight)+1);
        }
    }

    public void print(){
        weightedGraph.printGraph();
    }
}
