import java.util.UUID;

class PHD {
    private String name;
    private String uuid;
    private int size;

    public PHD(String name, int size) {
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
        this.size = size;
    }
    public PHD() {
        this.name = null;
        this.uuid =null;
        this.size = 0;
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
}