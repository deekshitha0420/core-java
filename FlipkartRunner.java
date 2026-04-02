class FlipkartRunner {

  public static void main(String[] arg) {

    Flipkart flipkart = new Flipkart();

    boolean login = flipkart.login("deekshitha", "punya@123");
    System.out.println(login);
    
    String result = flipkart.login(9945165183L, 2468);
    System.out.println(result);
    
    String msg = flipkart.search("laptop");
    System.out.println(msg);
	
    msg = flipkart.search("laptop", "dell");
    System.out.println(msg);
    
    msg = flipkart.search("laptop", "dell", 60000);
    System.out.println(msg);

    msg = flipkart.search("laptop", "dell", 60000, "silver");
    System.out.println(msg);

    msg = flipkart.search("laptop", "dell", 60000, "silver", "520GB");
    System.out.println(msg);
  }
}