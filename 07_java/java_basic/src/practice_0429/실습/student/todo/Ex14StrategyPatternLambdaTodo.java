package practice_0429.실습.student.todo;

public class Ex14StrategyPatternLambdaTodo {
    @FunctionalInterface
    interface PaymentFeePolicy {
        int calculateFee(int amount);
    }

    static int pay(int amount, PaymentFeePolicy policy) {
        return amount + policy.calculateFee(amount);
    }

    public static void main(String[] args) {
        int amount = 10000;

        // TODO: 카드 결제 수수료 3% 정책을 람다식으로 전달하세요.
        int cardPaymentAmount = pay(amount, null);

        System.out.println("최종 결제 금액: " + cardPaymentAmount);
    }
}
