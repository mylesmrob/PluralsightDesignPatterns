package abstractFactory;

public class VisaFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CardType type){
        switch(type){
            case GOLD:
                return new VisaGoldCard();
            case PLATINUM:
                return new VisaBlackCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType type){
        switch(type){
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaBlackValidator();
        }
        return null;
    }
}
