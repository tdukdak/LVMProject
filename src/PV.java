import java.util.ArrayList;
import java.util.UUID;

public class PV extends LVM{
    private PHD associatedDrive;
    private ArrayList<PV> volumes;


    public PV(String name, UUID uuid, int size, PHD associatedDrive, ArrayList<PV> volumes){
        super(name, uuid);
        this.associatedDrive = associatedDrive;
        size = associatedDrive.getSize();
        this.volumes = volumes;
    }

    public PHD getAssociatedDrive() {
        return associatedDrive;
    }
}
