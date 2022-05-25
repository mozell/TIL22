package interfaceExp;

public interface InfBank {

    public int MAX_INTEGER = 10000000;

    // 인출 메서드
    void withDraw(int price);

    // 입금 메서드
    void deposit(int price);

    // 인증 메서드
    static void auth(String bankName) {

        System.out.println(bankName+ " 에서 인증 요청.");
        // 로직 수행...
    }

    // 휴면계좌 찾기 서비스 - 디폴트 메소드 제공
    default String findDormancyAccount(String custId) {
        System.out.println("** 휴면계좌 찾기 서비스 **");
        // 기본 제공 로직
        return "[" + custId + "] ####-###-######";
    }
}
