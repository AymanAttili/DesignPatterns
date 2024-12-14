package decorators;

import abstracts.TShirt;
import abstracts.TShirtDecorator;

public class TextDecorator extends TShirtDecorator {
    public TextDecorator(TShirt tshirt) {
        super(tshirt);
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", with text: 'nice day!'";
    }
}