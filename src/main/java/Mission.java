import java.util.Arrays;

public class Mission {
    int startingIsland;
    int targetIsland;
    int budget;

    public Mission(String line) {
        int[] tokens = Arrays.stream(line.split(" ")).mapToInt(str -> Integer.valueOf(str)).toArray();
        this.startingIsland = tokens[0];
        this.targetIsland = tokens[1];
        this.budget = tokens[2];
    }

    public int getStartingIsland() {
        return startingIsland;
    }

    public int getTargetIsland() {
        return targetIsland;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return
                "startingIsland:" + startingIsland + "," +
                "targetIsland:" + targetIsland + "," +
                "budget:" + budget + ",";
    }
}
