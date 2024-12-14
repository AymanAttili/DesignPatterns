package Asia;

import abstracts.TShirt;

public class AsiaSmallTShirt extends TShirt {
    public AsiaSmallTShirt() {
        name = "Asia Small T-Shirt";
        description = "A small T-shirt sized for Asia market";
    }
    @Override
    public String formSize() {
        return "small";
    }
}
