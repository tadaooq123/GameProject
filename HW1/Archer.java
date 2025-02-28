package HW1;

public class Archer implements GameObserver  {
    @Override
    public void update(String event) {
        System.out.println("Archer received event: " + event);
    }
}


