package abstractFactory;

public class AmexFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CardType type){
        switch(type){
            case GOLD:
                return new AmexGoldCard();
            case PLATINUM:
                return  new AmexPlatinumCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType type){
        switch(type){
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
