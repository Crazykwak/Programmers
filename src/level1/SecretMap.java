package level1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder merge = new StringBuilder();

        for(int i = 0; i < arr1.length; i++){
            merge.append(Integer.toBinaryString(arr1[i]|arr2[i]));
            while (merge.length() != n) {
                merge.insert(0, "0");
            }
            answer[i] = merge.toString().replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
            merge.delete(0, merge.length());
        }

        return answer;
    }
}
