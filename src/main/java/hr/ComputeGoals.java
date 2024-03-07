package hr;

//Question: The number of goals acheived by two football team in matches in a league is given in the form of two lists. For each match of team B compute the total number of matches of team A where A has scored less than or equal to the number of goals scored by team B in that match

import java.util.ArrayList;
import java.util.List;

public class ComputeGoals {

    public static List<Integer> computeMatch(List<Integer> teamAGoals, List<Integer> teamBGoals)
    {
        List<Integer> totalMatch = new ArrayList<>();

        for (int bGoals : teamBGoals) {
            int count = 0;
            for (int aGoals : teamAGoals) {
                if (aGoals <= bGoals) {
                    count++;
                }
            }
            totalMatch.add(count);
        }
        return totalMatch;
    }

    public static void main(String[] args) {
        List<Integer> teamAGoals = List.of(1, 2, 3, 4, 5);
        List<Integer> teamBGoals = List.of(2, 4, 1, 3, 2);
        List<Integer> totalMatch = computeMatch(teamAGoals, teamBGoals);
        System.out.println(totalMatch);
    }
}
