package abstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory abstracFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard cardA = abstracFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(cardA.getClass());

        abstracFactory = CreditCardFactory.getCreditCardFactory(500);
        CreditCard cardB = abstracFactory.getCreditCard(CardType.GOLD);
        System.out.println(cardB.getClass());
    }
}
