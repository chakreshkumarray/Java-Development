package Cepheid_Coding_Questions;

public class Solutions {
    public static void main(String[] args) {

        int N = 7;
        int[] workload = {3, 7, 8, 12, 4, 9, 8};

        int result = solve(N,workload);

        System.out.println(result);
        /*
    1. Define Question (Simple & Clear):
       The goal is to find the longest streak of consecutive days where an employee worked more than 6 hours.
       Input: Total days (N) and a list of daily work hours (workload).
       Condition: A "valid" day is one with > 6 hours.
       Output: The maximum number of "valid" days in a row.

    2. Approach:
       We can solve this in one pass through the list (simple loop):
    1. Initialize two counters: current_streak (for the current run of valid days) and max_streak
        (for the highest streak found so far). Both start at 0.
    2. Loop through the workload: Check each day's hours one by one.
        If hours > 6: Increase current_streak by 1. Update max_streak if the current one is now larger.
        If hours ≤ 6: The streak is broken. Reset current_streak to 0.
    3. Return: The final max_streak.

    3. Output:
      Input Setup: I used the sample input from your image (N = 7 and workload = {3, 7, 8, 12, 4, 9, 8}).
      Object Creation: Main solution = new Main(); creates an object to access the solve method.
      Execution: It calls solution.solve(N, workload) which runs the logic.
         */
    }

    public static int solve(int N, int[] workload){
        int maxStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < N; i++){
            if (workload[i] > 6){
                currentStreak++;
                if (currentStreak > maxStreak){
                    maxStreak = currentStreak;
                }
            }else {
                currentStreak = 0;
            }
        }
        return maxStreak;
    }
}
