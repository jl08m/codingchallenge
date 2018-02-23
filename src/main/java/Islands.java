import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Islands {

    Graph<String, Hop> g;

    Islands(int[][] costs, int[][] distances) {
        if (costs.length != distances.length) {
            throw new IllegalArgumentException("cost and distances different sizes");
        }

        int numIslands = costs.length;

        g = new SimpleGraph<String, Hop>(Hop.class);

        for (int i = 0; i < numIslands; i++) {
            g.addVertex(String.valueOf(i));
        }

        for (int startIsland = 0; startIsland < numIslands; startIsland++) {
            for (int endIsland = startIsland+1; endIsland < numIslands; endIsland++) {
                g.addEdge(String.valueOf(startIsland), String.valueOf(endIsland),
                        new Hop(costs[startIsland][endIsland], distances[startIsland][endIsland]));
            }
        }

    }

    @Override
    public String toString() {
        return "Islands: " + g.vertexSet() + ";" +
                "Hops: " + g.edgeSet();
    }
}
