/**
 * Created by John's New HP on 3/25/2017.
 */
public class Car extends Vehicle{

    private String model;
    public Car(String name, String model) {
        super(name);
        this.model = model;
    }

    public String getModel()
    {
        return this.model;
    }
    public boolean getIsRegistered()
    {
        return true;
    }
}
