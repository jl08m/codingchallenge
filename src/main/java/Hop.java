import org.jgrapht.graph.DefaultEdge;

public class Hop extends DefaultEdge {
    int cost;
    int distance;


    public Hop(int cost, int distance) {
        this.cost = cost;
        this.distance = distance;
    }
}
