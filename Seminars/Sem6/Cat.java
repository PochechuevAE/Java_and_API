import java.util.Objects;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name.toString() + ", Окрас: " + color.toString() + ", Возраст: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && color.equals(cat.color) && age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
