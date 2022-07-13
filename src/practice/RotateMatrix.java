package practice;

public class RotateMatrix {

    int[][] rotated;

    public int[][] rotateMatrix(int[][] matrix, int K) {
        if(K == 0) {
            return matrix;
        }
        int y = matrix.length;
        int x = matrix[0].length;
        int degree = K % 4;
        rotated = new int[x][y];

//        switch (degree) {
//            case 0: return matrix;
//            case 1:
//            case 2: rotated = new int[x][y];
//                    break;
//            case 3: rotated = new int[y][x];
//        }
//
        int rotatedY = rotated.length;
        int rotatedX = rotated[0].length;
//
//        for (int i = 0; i < rotatedY; i++) {
//            for (int j = 0; j < rotatedX; j++) {
//
//                switch (degree) {
//                    case 1:
//                        rotated[i][j] = matrix[y-1-j][i];
//                        break;
//                    case 2:
//                        rotated[i][j] = matrix[y-1-i][j];
//                        break;
//                    case 3:
//                        rotated[i][j] = matrix[j][x-1-i];
//                        break;
//                }
//            }
//        }

        for (int i = 0; i < rotatedY; i++) {
            for (int j = 0; j < rotatedX; j++) {
                rotated[i][j] = matrix[y-1-j][i];
            }
        }

        return rotateMatrix(rotated, K-1);

    }
}
