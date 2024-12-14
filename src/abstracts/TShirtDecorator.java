package abstracts;

public abstract class TShirtDecorator extends TShirt {
    protected TShirt tshirt;

    public TShirtDecorator(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription();
    }

    @Override
    public String formSize() {
        return tshirt.formSize();
    }
}
