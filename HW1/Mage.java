package HW1;

public class Mage implements GameObserver  {
    @Override
    public void update(String event) {
        System.out.println("Mage received event: " + event);
    }
}

