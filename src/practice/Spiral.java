package practice;

public class Spiral {
    public String spiralTraversal(Character[][] matrix) {
        StringBuilder sb = new StringBuilder();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        int d = 0;
        while(sb.length() < rows * cols){
            if(d == 0){
                for(int i=colStart; i<=colEnd; i++){
                    sb.append(matrix[rowStart][i]);
                }
                rowStart++;
            }

            if(d == 1){
                for(int i=rowStart; i<=rowEnd; i++){
                    sb.append(matrix[i][colEnd]);
                }
                colEnd--;
            }

            if(d == 2){
                for(int i=colEnd; i>=colStart; i--){
                    sb.append(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if(d == 3){
                for(int i=rowEnd; i>=rowStart; i--){
                    sb.append(matrix[i][colStart]);
                }
                colStart++;
            }

            d = (d+1) % 4;

        }

        return sb.toString();
    }
}
