package ME;
import abstracts.TShirt;

public class MiddleEastLargeTShirt extends TShirt {
    public MiddleEastLargeTShirt() {
        name = "Middle East Large T-Shirt";
        description = "A large T-shirt sized for Middle East market";
    }
    @Override
    public String formSize() {
        return "large";
    }
}