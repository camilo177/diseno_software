package authorExercisePkg;

public class AuthorExercise {
    public AuthorExercise(){
    }

    public static void main(String[] args) {
        Author authorOne = new Author("Daniel", "abcd@gmail.com", 'm');

        authorOne.setEmail("abcd@gmail.com");

        System.out.println(authorOne);
    }
}
