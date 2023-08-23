package authorExercisePkg;


public class BookExercise {
    public BookExercise(){
    }

    public static void main(String[] args) {
        // Author instance
        Author authorOne = new Author("Tolkien", "tolkien@whatever.com", 'm');

        // Book instance using the Author instance
        Book bookOne = new Book("The Lord of the Rings", authorOne, 12000, 5);

        System.out.println(bookOne);
    }
}

