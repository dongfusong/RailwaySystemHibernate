package SpringWebHibernate.models;

/**
 * Created by Thoughtworks on 15/8/12.
 */
public class Car {

    private String warningMessage = "none";
    private CarEngine engine;

    public Car(CarEngine engine) {
        this.engine = engine;
    }

    public void accelerate() {
        engine.increase();
        if (engine.getRmp() > 4000){
            warningMessage = "warning info";
        }
    }

    public String getWarningMessages() {
        return warningMessage;
    }
}
