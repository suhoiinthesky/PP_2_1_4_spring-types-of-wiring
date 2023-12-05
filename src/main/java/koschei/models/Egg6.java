package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    @Autowired
    private Deth8 depth;

    @Override
    public String toString() {
        return ", в яйце иголка " + depth.toString();
    }
}
