import java.util.UUID;

class PV extends PHD{
    private String name;
    private String UUID;
    private PHD phd;


    public PV(){
        name =null;
        UUID = null;
        phd = null;
    }
    public PV(String name, PHD PHD) {
        this.name = name;
       this.UUID = PHD.getUUID();
       phd = PHD;
    }

    public String getName() {
        return name;
    }

    public String getUUID() {
        return UUID;
    }

    public PHD getPHD() {
        return phd;
    }

    public int getSize() {
        return phd.getSize();
    }
}