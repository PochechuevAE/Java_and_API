package HW.HW7;

public class Toy {
    private int id;
    private String name;
    private int frequency;

    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    // Геттеры для полей

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Toy{id=" + id + ", name='" + name + "', frequency=" + frequency + '}';
    }
}
