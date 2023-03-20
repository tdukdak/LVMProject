import java.util.UUID;

public class LVM {
    private String name;
    private UUID uuid;

    public LVM(String name, UUID uuid){
        this.name = name;
        uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getUUID() {
        return uuid;
    }

}
