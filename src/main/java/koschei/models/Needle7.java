package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    @Autowired
    private Deth8 deth;

    @Override
    public String toString() {
        return ", в яйце иголка " + deth.toString();
    }
}
