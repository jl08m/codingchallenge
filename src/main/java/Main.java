import java.io.IOException;

public class Main {

    public static void main (String... args) throws IOException {

        ProblemSpace problem = ReadFile.readFile("sample.txt");

        System.out.println(problem.islands.toString());
        Solver solver = new Solver(problem.islands);
        for (int missionNum = 0; missionNum < problem.totalMissions; missionNum++) {
            System.out.println(solver.solve(problem.missions[missionNum]));
        }

    }
}
