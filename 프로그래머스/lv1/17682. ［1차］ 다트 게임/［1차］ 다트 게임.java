
class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int answer = 0;
        int score = 0;
        int round = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);


            if (isNumeric(c)) {
                if (c == '1' && (dartResult.charAt(i+1) == '0')) {
                    round += 1;
                    i += 1;
                    score = 10;

                    continue;
                } else {
                    round += 1;

                    score = Integer.parseInt(Character.toString(c));
                    continue;
                }
            } else {
                if (getArea(c)) {
                    score = scoring(c, score);
                    scores[round] = score;    
                    
                    continue;
                }

                awarding(c, round, scores);
            }
        }

        for (int i = 0; i < scores.length; i++) {
            answer += scores[i];
        }
        

        return answer;
    }

    

    private static void awarding(char c, int round, int[] scores) {
        switch (c) {
            case '*':
                round = round == 0 ? 1 : round;

                for (int i = round-1; i <= round; i++) {
                    scores[i] = 2 * scores[i];
                }

                break;

            case '#':
                scores[round] = -scores[round];
                break;

            default:
                throw new IllegalArgumentException();
        }
    }

    private static int scoring(char c, int score) {
        switch (c) {
            case ('S'):
                // System.out.println(score);
                return score;

            case ('D'):
                return (int) Math.pow(score, 2);
                
            case ('T'):
                return (int) Math.pow(score, 3);

            default:
                throw new IllegalArgumentException();
        }
    }

    static boolean isNumeric(char c) {
        if (String.valueOf(c).matches("[0-9]|10")) {
            return true;
        }

        return false;
    }

    static boolean getArea(char c) {
        if (String.valueOf(c).matches("[SDT]")) {
            return true;
        }

        return false;
    }

}
