package HW1;

import java.util.*;

public class Warrior implements GameObserver {
    @Override
    public void update(String event) {
        System.out.println("Warrior received event: " + event);
    }

}
