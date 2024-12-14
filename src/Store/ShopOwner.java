package Store;

import abstracts.Observer;

public class ShopOwner implements Observer {
    @Override
    public void update(int smallCount, int mediumCount, int largeCount) {
        System.out.println("ShopOwner notified: Sold count => Small: " + smallCount +
                ", Medium: " + mediumCount + ", Large: " + largeCount);
    }
}