package leetCode.weekFourteen;

public class RangeSumQuery2DImmutable304 {
    int[][] sum;
    public RangeSumQuery2DImmutable304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        sum = new int[m + 1] [n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = (sum[i - 1][j] +
                        sum[i][j - 1] -
                        sum[i - 1][j - 1]) +
                        matrix[i - 1] [j - 1];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5},
                {2, 1, 4, 3},
                {1, 1, 2, 2},
                {1, 2, 2, 4}
        };
        int row1 = 2;
        int row2 = 4;
        int col1 = 3;
        int col2 = 1;
        RangeSumQuery2DImmutable304 obj = new RangeSumQuery2DImmutable304(matrix);
        int param_1 = obj.sumRegion(row1,col1,row2,col2);
        System.out.println(param_1);
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        r1++; c1++; r2++; c2++;
        return (sum[r2][c2] -
                sum[r2][c1 - 1] -
                sum[r1 - 1][c2] +
                sum[r1 - 1][c1 - 1]);
    }
}
