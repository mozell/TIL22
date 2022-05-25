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
}
