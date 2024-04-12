package S23_GRAPH;

public class s16_Flood_fill {

    
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
    
        // Mark the current cell as visited
        vis[sr][sc] = true;
    // Replace the color at the current cell
        image[sr][sc] = color;
        // left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // up
        helper(image, sr - 1, sc, color, vis,  orgCol);
        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }
    

    public int[][] floodfill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        s16_Flood_fill floodFill = new s16_Flood_fill();

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, newColor = 2;

        int[][] result = floodFill.floodfill(image, sr, sc, newColor);

        // Printing the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
