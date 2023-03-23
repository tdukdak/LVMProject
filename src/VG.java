import java.util.UUID;

public class VG extends LVM {

    private PV storedPV;

    public VG(String name, UUID uuid, PV storedPV){
        super(name,uuid);
        this.storedPV = storedPV;
    }

    public int getSize()

}
