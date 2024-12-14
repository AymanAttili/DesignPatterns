package decorators;

import abstracts.TShirt;
import abstracts.TShirtDecorator;

public class LogoDecorator extends TShirtDecorator {
    public LogoDecorator(TShirt tshirt) {
        super(tshirt);
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", with a nice bird logo";
    }
}
