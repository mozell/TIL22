package interfaceExp;

public class KBBank implements InfBank{
    @Override
    public void withDraw(int price) {
        System.out.println("###  KBBank.withDraw");

        if (price < InfBank.MAX_INTEGER) {
            System.out.println(price + " 원 인출 성공.");
        } else {
            System.out.println(price + " 원 인출 실패.");
        }
    }

    @Override
    public void deposit(int price) {
        System.out.println("###  KBBank.deposit");
        System.out.println(price + " 원 입금 성공.");
    }

    // findDormancyAccount 메소드 미구현 -> 기본제공 메소드 사용 or 휴면계좌 찾아주기 서비스 미사용
}
