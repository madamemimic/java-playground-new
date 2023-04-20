public class Toy implements Action {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is moving on its own!");
    }

    @Override
    public void play(Toy toy) {
        System.out.println(name + " is happy to see " + toy.toString() + "!");
    }

    @Override
    public String toString() {
        return name;
    }
}
