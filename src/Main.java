import Store.Store;
import Store.ShopOwner;
import abstracts.TShirt;
import decorators.ColorDecorator;
import decorators.LogoDecorator;
import decorators.TextDecorator;
import enums.Color;
import factories.TShirtFactory;

public class Main {
    public static void main(String[] args) {
        Store salesManager = Store.getInstance();
        ShopOwner owner = new ShopOwner();
        salesManager.registerObserver(owner);

        // Customer orders a small Middle East T-shirt
        TShirt tshirt = TShirtFactory.getTShirt("MiddleEast", "Small");
        System.out.println(tshirt.getDescription());

        // Add features
        tshirt = new LogoDecorator(tshirt);
        tshirt = new TextDecorator(tshirt);
        tshirt = new ColorDecorator(tshirt, Color.RED);

        System.out.println(tshirt.getDescription());

        // Simulate selling the T-shirt
        salesManager.sellTShirt(tshirt);

        // Another order: a large Asia T-shirt with blue color only
        TShirt tshirt2 = TShirtFactory.getTShirt("Asia", "Large");
        tshirt2 = new ColorDecorator(tshirt2, Color.BLUE);
        System.out.println(tshirt2.getDescription());

        salesManager.sellTShirt(tshirt2);
    }
}