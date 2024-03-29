import java.util.List;

public class Solution {

//    public static void main(String[] args) {
//        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";
//
//        numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        hand = "left";
//
//        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        hand = "right";
//
//        solution(numbers, hand);
//    }
//    
    // 왼손잡이 : 1, 4, 7
    // 오른손잡이 : 3, 6, 9
    // 거리가 가까운 손 || 거리가 같다면 주손 : 2, 5, 8, 0

    // 왼손 시작 : *
    // 오른손 시작 : #

    // 순서대로 누를 번호가 담긴 배열 : numbers
    // 주 손 : hand

    // 각 번호를 누를 때 어떤 손으로 누르는 지 연속된 문자열 형태로 반환
    public List<Position> positions = List.of(new Position(2,3), new Position(1,0), new Position(2,0),new Position(3,0), new Position(1,1),new Position(2,1), new Position(3,1), new Position(1,2), new Position(2,2), new Position(3,2));

    public String solution(int[] numbers, String hand) {
        List<Integer> onlyLeftNumber = List.of(1,4,7);
        List<Integer> onlyRightNumber = List.of(3,6,9);
        
        String answer = ""; int currentNumber;

        Position leftHand = new Position(1, 3, "L");
        Position rightHand = new Position(3, 3, "R");
        
        for (int number : numbers) {
            currentNumber = number;

            int x = positions.get(number).x;
            int y = positions.get(number).y;

            if (onlyLeftNumber.contains(number)) {
                // 왼손이 무조건 나가야 할 때
                answer += leftHand.move(x, y);
            } else if (onlyRightNumber.contains(number)) {
                // 오른손이 무조건 나가야 할 때
                answer += rightHand.move(x, y);
            } else {
                // 중립 조건
                double lDistance = leftHand.getDistance(x, y);
                double rDistance = rightHand.getDistance(x, y);

                if (lDistance == rDistance) {
                    // 거리가 같을 때
                    if (hand.equals("right")) {
                        answer += rightHand.move(x,y);
                    } else {
                        answer += leftHand.move(x,y);
                    }

                } else {
                    // 거리가 다를 때
                    if (lDistance > rDistance) {
                        answer += rightHand.move(x,y);
                    } else {
                        answer += leftHand.move(x,y);
                    }
                }

            }

            // System.out.println(answer);
            // System.out.println(number + ", " + leftHand.toString() +", " + rightHand.toString());


        }

        return answer;
    }

    class Position {
        int x;
        int y;
        String pos;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Position(int x, int y, String pos) {
            this.x = x;
            this.y = y;
            this.pos = pos;
        }

        String move(int x, int y) {
            this.x = x;
            this.y = y;

            return pos;
        }

        double getDistance(int x, int y) {
            int deltaX = Math.abs(this.x - x);
            int deltaY = Math.abs(this.y - y);
//            return Math.pow(deltaX * deltaX + deltaY * deltaY, 2);

            return deltaX + deltaY;
        }

        @Override
        public String toString() {
            return this.pos +"(x : " + this.x + ", y : " + this.y + ")";
        }
    }
}
