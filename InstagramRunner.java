class InstagramRunner {

    public static void main(String[] args) {

        Instagram punya = new Instagram();
        punya.login("Facebook_ID");

        Instagram anu = new Instagram();
        anu.login("deekshitha", "password123");

        Instagram bhoomi = new Instagram();
        bhoomi.login("deekshitha@gmail.com", 123456);

        Instagram anju = new Instagram();
        anju.login(9945165183l, "mypassword");
    }
}