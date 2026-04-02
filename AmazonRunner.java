class AmazonRunner {

  public static void main(String[] arg) {

    Amazon amazon = new Amazon();

    boolean login = amazon.login("deekshitha", "punya@123");
    System.out.println(login);
    
    String result = amazon.login(9945165183L, 2468);
    System.out.println(result);
    
    String msg = amazon.search("Mobile");
    System.out.println(msg);
	
    msg = amazon.search("Mobile", "vivo");
    System.out.println(msg);
    
    msg = amazon.search("Mobile", "vivo", 20000);
    System.out.println(msg);

    msg = amazon.search("Mobile", "vivo", 20000, "white");
    System.out.println(msg);

    msg = amazon.search("Mobile", "vivo", 20000, "white", "4GB");
    System.out.println(msg);
  }
}