package interfaceExp;

public class SHBank implements InfBank{
    @Override
    public void withDraw(int price) {
        System.out.println("###  SHBank.withDraw");

        if (price < InfBank.MAX_INTEGER) {
            System.out.println(price + " 원 인출 성공.");
        } else {
            System.out.println(price + " 원 인출 실패.");
        }
    }

    @Override
    public void deposit(int price) {
        System.out.println("###  SHBank.deposit");
        System.out.println(price + " 원 입금 성공.");

        //별도 후행 처리 작업 로직
        System.out.println("별도 후행 처리 작업 완료.");
    }

    @Override
    public String findDormancyAccount(String custId) {
        System.out.println("###  SHBank.findDormancyAccount");
        System.out.println("** SHBank 휴면계좌 찾기 서비스 **");
        return "[" + custId + "] [ SHBank ] ####-###-######";
    }
}
