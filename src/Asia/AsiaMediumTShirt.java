package Asia;

import abstracts.TShirt;

public class AsiaMediumTShirt extends TShirt {
    public AsiaMediumTShirt() {
        name = "Asia Mediium T-Shirt";
        description = "A medium T-shirt sized for Asia market";
    }
    @Override
    public String formSize() {
        return "medium";
    }
}
