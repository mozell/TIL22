package interfaceExp;

public class KakaoBank {

    public void kakaoWithDraw(int price) {
        System.out.println("###  KakaoBank.kakaoWithDraw");
        System.out.println(price + " 원 인출 성공.");
    }

    public void kakaoDeposit(int price) {
        System.out.println("###  KakaoBank.kakaoDeposit");
        System.out.println(price + " 원 입금 성공.");
    }

    public void kakaoFindDormancyAccount() {
        System.out.println("###  KakaoBank.kakaoFindDormancyAccount");
        System.out.println("** KakaoBank 별도 휴면계좌 찾기 서비스 **");
    }
}
