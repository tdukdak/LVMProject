import java.util.UUID;

public class PV extends LVM{
    private PHD associatedDrive;

    public PV(String name, UUID uuid, int size, PHD associatedDrive){
        super(name, uuid);
        this.associatedDrive = associatedDrive;
        size = associatedDrive.getSize();
    }

    public PHD getAssociatedDrive() {
        return associatedDrive;
    }
}
