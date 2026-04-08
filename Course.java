class Course {
    int id; 
	String name; 
	String duration; 
	double fee; 
	String trainer;
    String mode; 
	String level; 
	String category; 
	int students; 
	boolean available;

    int getId(int id){ 
	return id; 
	}
    String getName(String name){ 
	return name; 
	}
    String getDuration(String d){
		return d; 
		}
    double getFee(double f){ 
	return f; 
	}
    String getTrainer(String t){ 
	return t; 
	}
    String getMode(String m){ 
	return m; 
	}
    String getLevel(String l){ 
	return l; 
	}
    String getCategory(String c){ 
	return c; 
	}
    int getStudents(int s){ 
	return s; 
	}
    boolean isAvailable(boolean a){ 
	return a; 
	}
}