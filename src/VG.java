import java.util.ArrayList;
import java.util.UUID;

class VG extends PV{
    private String name;
    private String uuid;
    private ArrayList<PV> physicalVolumes;
    private ArrayList<LV> logicalVolumes;

    public VG(String name, ArrayList<PV> physicalVolumes, ArrayList<LV> logicalVolumes) {
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
        this.physicalVolumes = physicalVolumes;
        this.logicalVolumes = logicalVolumes;
    }

    public VG(){
        this.name = null;
        this.uuid = null;
        this.physicalVolumes = null;
        this.logicalVolumes = null;
    }
    public String getName() {
        return name;
    }

    public String getUUID() {
        return uuid;
    }

    public ArrayList<PV> getPVs() {
        return physicalVolumes;
    }

    public ArrayList<LV> getLVs() {
        return logicalVolumes;
    }

    public int getTotalSize() {
        int totalSize = 0;
        for (PV pv : physicalVolumes) {
            totalSize += pv.getSize();
        }
        return totalSize;
    }

    public int getFreeSpace() {
        int freeSpace = 0;
        for (PV pv : physicalVolumes) {
            freeSpace += pv.getSize();
        }
        for (LV lv : logicalVolumes) {
            freeSpace -= lv.getSize();
        }
        return freeSpace;
    }
}
