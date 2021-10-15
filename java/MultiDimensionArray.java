public class MultiDimensionArray {
    public static void main(String[] args) {
        simple2DArray();
    }

    public static void simple2DArray() {
        int[][] twoDimArr = new int[3][4];
        twoDimArr[0][0] = 12;
        twoDimArr[0][1] = 12;
        twoDimArr[0][2] = 12;
        twoDimArr[0][3] = 12;
        twoDimArr[1][0] = 13;
        twoDimArr[1][1] = 13;
        twoDimArr[1][2] = 13;
        twoDimArr[1][3] = 13;
        twoDimArr[2][0] = 14;
        twoDimArr[2][1] = 14;
        twoDimArr[2][2] = 14;
        twoDimArr[2][3] = 14;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDimArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
