package SpringWebHibernate.models;

import javafx.beans.value.ObservableBooleanValue;

/**
 * Created by Thoughtworks on 15/8/12.
 */
public class CarEngine {

    private int rmp;

    public int getRmp() {
        return rmp;
    }

    public void increase() {
        rmp += 30;
    }
}
