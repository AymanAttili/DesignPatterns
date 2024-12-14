package decorators;

import abstracts.TShirt;
import abstracts.TShirtDecorator;
import enums.Color;

public class ColorDecorator extends TShirtDecorator {
    private Color color;
    public ColorDecorator(TShirt tshirt, Color color) {
        super(tshirt);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", colored: " + color.name().toLowerCase();
    }
}