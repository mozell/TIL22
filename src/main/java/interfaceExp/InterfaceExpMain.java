package interfaceExp;

public class InterfaceExpMain {
    public static void main(String[] args) {
        InfBank bank = new KBBank();
        bank.withDraw(1000);
        bank.deposit(1000);
        bank.findDormancyAccount("9409241");
        InfBank.auth("KBBank");

        System.out.println("\n 인스턴스 교체 !\n");

        bank = new SHBank();
        bank.withDraw(1000);
        bank.deposit(1000);
        bank.findDormancyAccount("9409241");
        InfBank.auth("SHBank");

        System.out.println("\n 카카오뱅크 교체 !\n");

        KakaoBank kakaoBank = new KakaoBank();
        kakaoBank.kakaoWithDraw(2000);
        kakaoBank.kakaoDeposit(2000);
        kakaoBank.kakaoFindDormancyAccount();
        // 카카오뱅크는 InfBank 가 제공하는 서비스를 사용하지 못한다.

    }
}
