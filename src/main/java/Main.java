public class Main {
    public static void main(String[] args) {
        Cat nova = new Cat("Nova", 4);
        Dog rosie = new Dog("Rosie", 8, "Kimi");
        Rabbit barry = new Rabbit("Barry", 5, "red");

        Toy jonathanBear = new Toy("Jonathan");
        Toy legoCar = new Toy("Lego Car");

        Action[] homeFriends = new Action[]{nova, rosie, barry, jonathanBear};

        for (Action friend : homeFriends) {
            friend.play(legoCar);
        }
    }
}
