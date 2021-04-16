package lessions;

public class BinaryGap {
    public int solution(int N) {
        StringBuilder s = new StringBuilder();

        while (N > 0) {
            s.append(N % 2);
            N /= 2;
        }
        s.reverse();

        int count = 0, max = 0;

        for (char c : s.toString().toCharArray()) {
            if (c == '1' && count != 0) {
                max = Math.max(max, count);
                count = 0;
            } else if (c == '0') {
                count++;
            }
        }

        return max;
    }
}
