/**
 * Created by John's New HP on 3/25/2017.
 */
public class Boat extends Vehicle{
    private boolean isRegistered;

    public Boat(String name, boolean isRegistered) {
        super(name);
        this.isRegistered = isRegistered;
    }

    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
}
