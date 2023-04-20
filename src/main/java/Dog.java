
/*
  __      _
o'')}____//
 `_/      )
 (_(_/-(_/
 */

public class Dog extends Animal {
    private String owner;

    //constructor
    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void play() {
        System.out.println("Dog " + name + " is chasing its tail!");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Dog " + name + " is trying to eat " + toy.toString() + "...");
    }
}
