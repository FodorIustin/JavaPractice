public class Person {
    private int age;
    private String name;
    private double height;

    public Person(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
