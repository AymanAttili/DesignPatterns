package abstracts;

public abstract class TShirt {
    protected String name;
    protected String description;

    public String getDescription() {
        return name + ": " + description;
    }

    public abstract String formSize();
}