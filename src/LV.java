import java.util.UUID;
import java.util.ArrayList;

class LV extends VG{
    private String name;
    private String uuid;
    private int size;
    private VG volumeGroup;

    public LV(String name, int size, VG volumeGroup) {
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
        this.size = size;
        this.volumeGroup = volumeGroup;
    }

    public String getName() {
        return name;
    }

    public String getUUID() {
        return uuid;
    }

    public int getSize() {
        return size;
    }

    public VG getVG() {
        return volumeGroup;
    }
}