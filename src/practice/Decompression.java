package practice;

public class Decompression {

    StringBuilder sb = new StringBuilder();
    int[][] image;
    public String decompression(int[][] image) {
        // TODO:
        this.image = image;

        rec(0, 0, image.length);

        return sb.toString();
    }

    private void rec(int height, int width, int length) {
        if (isAllSame(height, width, length)) {
            sb.append(image[height][width]);
            System.out.println("height = " + height);
            System.out.println("width = " + width);
            System.out.println("length = " + length);
            System.out.println("sb = " + sb);
            return;
        }

        sb.append("X");

        int half = length / 2;
        rec(height, width, half);
        rec(height, width + half, half);
        rec(height + half, width, half);
        rec(height + half, width + half, half);

    }

    private boolean isAllSame(int height, int width, int length) {

        for (int i = height; i < length + height; i++) {
            for (int j = width; j < width + length; j++) {
                if (image[height][width] != image[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
