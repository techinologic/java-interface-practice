/**
 * Created by Paopao on 08/09/17.
 */
public abstract class Crashable {

    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;

    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();

}
