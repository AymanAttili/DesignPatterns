package Asia;

import abstracts.TShirt;

public class AsiaLargeTShirt extends TShirt {

    public AsiaLargeTShirt() {
        name = "Asia Large T-Shirt";
        description = "A large T-shirt sized for Asia market";
    }
    @Override
    public String formSize() {
        return "large";
    }
}
