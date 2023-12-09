package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;

    public Rabbit4(@Autowired Duck5 duck) {
        this.duck = duck;
    }


    @Override
    public String toString() {
        return ", на дереве заяц " + duck.toString();
    }
}
