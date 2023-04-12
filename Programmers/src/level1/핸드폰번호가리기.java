package level1;

public class 핸드폰번호가리기 {

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        return "*".repeat(phone_number.length()-4) + phone_number.subSequence(phone_number.length() - 4, phone_number.length());
    }
    
} 
