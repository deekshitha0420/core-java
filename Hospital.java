class Hospital {
    int id; 
	String name; 
	String city; 
	int beds; 
	int doctors;
    int nurses; 
	String type; 
	String rating; 
	long phone; 
	boolean open;

    int getId(int id){ 
	return id; 
	}
    String getName(String name){ 
	return name; 
	}
    String getCity(String city){ 
	return city; 
	}
    int getBeds(int beds){ 
	return beds; 
	}
    int getDoctors(int d){ 
	return d; 
	}
    int getNurses(int n){ 
	return n; 
	}
    String getType(String t){ 
	return t; 
	}
    String getRating(String r){ 
	return r; 
	}
    long getPhone(long phone){ 
	return phone; 
	}
    boolean isOpen(boolean o){ 
	return o; 
	}
}