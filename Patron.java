import java.util.UUID;

public class Patron {
    private String id;
    private String name;

    public Patron(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patron ID: " + id + ", Name: " + name;
    }
}
