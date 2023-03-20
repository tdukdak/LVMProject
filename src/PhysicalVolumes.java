import java.util.UUID;

public class PhysicalVolumes extends LVM{
    private int size;

    public PhysicalVolumes(String name, UUID uuid, int size){
        super(name, uuid);
        this.size = size;
    }

}
