class CameraRunner {

    public static void main(String[] args) {
		System.out.println("Camera details with parameters: Canon,EOS 1500D,24,45000.50,wide angle,true");

        // Creating object of Camera class
        Camera ref = new Camera("canon","EOS 1500D");

        // Assigning values
        
		ref.getCameraData();
	}
}