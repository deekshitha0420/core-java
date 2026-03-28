class LaptopRunner {
    public static void main(String[] args) {
        Laptop ref = new Laptop();

        ref.name = "Inspiron";
        ref.brand = "Dell";
        ref.price = 55000;
        ref.ram = 8;
        ref.storage = 512;
        ref.processor = "Intel i5";
		ref.display();

        
    }
}