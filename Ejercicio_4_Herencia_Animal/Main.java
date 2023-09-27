public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Fido");

        System.out.println(cat);
        cat.greets();

        System.out.println(dog);
        dog.greets();

        // Ejemplo de llamada al método greets(another)
        Dog anotherDog = new Dog("Rex");
        dog.greets(anotherDog);
    }
}
