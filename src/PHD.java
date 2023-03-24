import java.util.ArrayList;
import java.util.UUID;

public class PHD extends LVM{

    private int size;
    private ArrayList<PHD> drives;
    public PHD(String name, UUID uuid, int size){
        super(name,uuid);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void installDrive(String name, int size){
        PHD newDrive = new PHD(name, UUID.randomUUID(), size);
        drives.add(newDrive);
    }
    public String listDrives(){
        return drives.toString();
    }
}
