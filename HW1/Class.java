package HW1;

public class Class implements GameObserver {
    @Override
    public void update(String event) {
        System.out.println("Class received event: " + event);
    }
}
