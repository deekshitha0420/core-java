class ProductRunner {
    public static void main(String[] args) {
        new Product();
        System.out.println("-----------");
        new Product("Phone", 102);
        System.out.println("-----------");
        new Product("TV", 103, 40000);
        System.out.println("-----------");
        new Product("Watch", 104, 5000, "Fastrack");
        System.out.println("-----------");
        new Product("Tablet", 105, 20000, "Samsung", "Gadget");
    }
}