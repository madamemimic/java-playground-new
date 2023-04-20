
/*
    |\__/,|   (`\
  _.|o o  |_   ) )
-(((---(((--------
 */

public class Cat extends Animal {

    //constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    //constructors
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

    @Override
    public void play() {
        System.out.println("Cat " + name + " jumps on the table!");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Cat " + name + " is playing with " + toy.toString() + ".");
    }
}
