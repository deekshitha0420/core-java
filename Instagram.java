class Instagram {

    // Login using Facebook
    void login(String facebook) {
        System.out.println("Invoking login using facebook :" + facebook);
    }

    // Login using username and password
    void login(String username, String password) {
        System.out.println("Invoking login using User name:" + username + " and psw :" + password);
    }

    // Login using email and password
    void login(String email, int otp) {
        System.out.println("Invoking login using email id:" + email + " and psw :" + otp);
    }

    // Login using phone number and password
    void login(long phoneNumber, String password) {
        System.out.println("Invoking login using phone number:" + phoneNumber + " and psw :" + password);
    }
}