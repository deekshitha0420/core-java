class Camera{

    // Instance variables (only declaration)
    String brand;
    String model;
    int megapixels;
    double price;
    String lensType;
    boolean isDigital;
	
	public Camera(String brand,String model){
		this.brand=brand;
		this.model=model;
		this.megapixels=megapixels;
		this.price=price;
		this.lensType=lensType;
		this.isDigital=isDigital;
	}
	
	public void getCameraData(){
		System.out.println("------CameraData------");
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("megapixels:"+megapixels);
		System.out.println("price:"+price);
		System.out.println("lensType:"+lensType);
	    System.out.println("isDigital:"+isDigital);
		
    }
}