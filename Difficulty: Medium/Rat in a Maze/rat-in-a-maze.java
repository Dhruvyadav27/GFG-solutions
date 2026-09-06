import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) return ans;

        solve(0, 0, n, visited, "", ans, maze);
        Collections.sort(ans);
        return ans;
    }

    public static void solve(int srcx, int srcy, int n, boolean[][] visited, String path, ArrayList<String> ans, int[][] maze) {

        // Base case: reached the bottom-right corner
        if (srcx == n - 1 && srcy == n - 1) {
            ans.add(path);
            return;
        }

        visited[srcx][srcy] = true;

        // Up
        int newx = srcx - 1;
        int newy = srcy;
        if (isSafe(newx, newy, n, maze, visited)) {
            solve(newx, newy, n, visited, path + "U", ans, maze);
        }

        // Down
        newx = srcx + 1;
        newy = srcy;
        if (isSafe(newx, newy, n, maze, visited)) {
            solve(newx, newy, n, visited, path + "D", ans, maze);
        }

        // Left
        newx = srcx;
        newy = srcy - 1;
        if (isSafe(newx, newy, n, maze, visited)) {
            solve(newx, newy, n, visited, path + "L", ans, maze);
        }

        // Right
        newx = srcx;
        newy = srcy + 1;
        if (isSafe(newx, newy, n, maze, visited)) {
            solve(newx, newy, n, visited, path + "R", ans, maze);
        }

        // Backtracking: unmark the cell so other paths can use it
        visited[srcx][srcy] = false;
    }

    public static boolean isSafe(int newx, int newy, int n, int[][] maze, boolean[][] visited) {
        if (newx < 0 || newx >= n || newy < 0 || newy >= n) {
            return false;
        }
        if (maze[newx][newy] == 0 || visited[newx][newy]) {
            return false;
        }
        return true;
    }
}