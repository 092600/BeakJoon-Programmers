import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.of(absolutes).sum() + IntStream.range(0, signs.length).filter(idx -> signs[idx] == false).map(idx -> absolutes[idx] * (-1)).sum() * 2;
    }
}