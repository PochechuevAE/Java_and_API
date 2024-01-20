package HW.HW6;

import java.util.Objects;


public class Nouts implements Comparable<Nouts>{
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
        return "Название: " + name.toString() + ", цена: " + price + " руб, производитель: " + producer.toString() + ", оперативная система: " + operatingSystem.toString() + ", Оперативная память: " + ram +  "ГБ, Объём жесткого диска: " + hardDiskSpace + "ГБ, цвет: " + color.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())){
            return false;
        }
        Nouts nout = (Nouts) obj;
        return name.equals(nout.name) && color.equals(nout.color) && price == nout.price && producer.equals(nout.producer) && operatingSystem.equals(nout.operatingSystem) && ram == nout.ram && hardDiskSpace == nout.hardDiskSpace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price, producer, operatingSystem, ram, hardDiskSpace);
    }

    @Override
    public int compareTo(Nouts other) {
        // Сравниваем ноутбуки по цене
        return Integer.compare(this.price, other.price);
    }
}
