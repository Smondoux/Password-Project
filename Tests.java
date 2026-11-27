public class Tests {
    public static void main(String[] args) {
        PasswordGen gen = new PasswordGen();
        String password = gen.generatePassword();

        System.out.println(password);
    }
}