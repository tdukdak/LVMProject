import java.util.ArrayList;
import java.util.UUID;

public class PHD extends LVM{

    private int size;

    public PHD(String name, UUID uuid, int size){
        super(name,uuid);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
