public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alex", "test@gmail.com", 'm');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        author.setEmail("proger@gmail.com");
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author);
    }
}