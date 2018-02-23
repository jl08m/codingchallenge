import java.util.Arrays;
import java.util.stream.Collectors;

public class ProblemSpace {
    int totalIslands;
    int totalMissions;
    Islands islands;
    Mission[] missions;


    public ProblemSpace(int totalIslands, int totalMissions, Islands islands, Mission[] missions) {
        this.totalIslands = totalIslands;
        this.totalMissions = totalMissions;
        this.islands = islands;
        this.missions = missions;
    }

    @Override
    public String toString() {
        return
                "totalIslands:" + totalIslands + "," +
                "totalMissions:" + totalMissions + "," +
                "islands: " + islands.toString() + "," +
                "missions: " + Arrays.stream(missions).map(Mission::toString).collect(Collectors.toList());
    }
}
