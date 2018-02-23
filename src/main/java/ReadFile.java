import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFile {
    //number of islands to travel through
    //number of missions given
    //[n integers, space separated] toll in dollars
    //[n integers space sparated] distance in miles
    //s=the island dave is starting on, g=destination for mission, b=budget

    public static ProblemSpace readFile(String fileName) throws IOException {
        String filePath = ReadFile.class.getClassLoader().getResource(fileName).getPath();
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            int numIslands = Integer.valueOf(br.readLine());
            int numMissions = Integer.valueOf(br.readLine());

            //costs
            int[][] costs = new int[numIslands][numIslands];
            for (int islandNum = 0; islandNum < numIslands; islandNum++) {
                costs[islandNum] = ingestInts(br.readLine());
            }

            //distances
            int[][] distances = new int[numIslands][numIslands];
            for (int islandNum = 0; islandNum < numIslands; islandNum++) {
                distances[islandNum] = ingestInts(br.readLine());
            }

            Mission[] missions = new Mission[numMissions];
            for (int missionNum = 0; missionNum < numMissions; missionNum++) {
                missions[missionNum] = new Mission(br.readLine());
            }

            if (br.lines().count() != 0) {
                throw new IllegalStateException("Unexpected remaining lines");
            }

            return new ProblemSpace(numIslands, numMissions, new Islands(costs, distances), missions);

        }
    }

    private static int[] ingestInts(String line) {
        return Arrays.stream(line.split(" ")).mapToInt(i -> Integer.valueOf(i)).toArray();
    }


}
