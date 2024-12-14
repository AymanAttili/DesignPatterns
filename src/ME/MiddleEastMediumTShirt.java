package ME;
import abstracts.TShirt;

public class MiddleEastMediumTShirt extends TShirt {
    public MiddleEastMediumTShirt() {
        name = "Middle East Medium T-Shirt";
        description = "A medium T-shirt sized for Middle East market";
    }
    @Override
    public String formSize() {
        return "medium";
    }
}
