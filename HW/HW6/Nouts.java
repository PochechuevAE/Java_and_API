package HW.HW6;

public class Nouts {
    private String name;
    private int price;
    private String producer;
    private String operatingSystem;
    private int ram;
    private int hardDiskSpace;
    private String color;

    public Nouts(String name, int price, String producer, String operatingSystem, int ram, int hardDiskSpace,
            String color) {
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.hardDiskSpace = hardDiskSpace;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDiskSpace() {
        return hardDiskSpace;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название: " + name.toString() + ", цена: " + price + "руб, производитель: " + producer.toString() + ", оперативная система: " + operatingSystem.toString() + ", Оперативная память: " + ram +  "ГБ, Объём жесткого диска: " + hardDiskSpace + "ГБ, цвет: " + color.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
