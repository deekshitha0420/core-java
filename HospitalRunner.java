class HospitalRunner {
    public static void main(String[] args) {
        Hospital ref = new Hospital();

        ref.name = "City Hospital";
        ref.location = "Bangalore";
        ref.doctors = 50;
        ref.nurses = 120;
        ref.beds = 200;
        ref.type = "Private";
		ref.display();

        
    }
}