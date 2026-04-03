class Cricket {
    String playerName;
    String role;
    int runs;
    int matches;
    String country;

    public Cricket() {
        System.out.println("Cricket Object Created");
    }

    public void setDetails(String playerName, String role, int runs, int matches, String country) {
        this.playerName = playerName;
        this.role = role;
        this.runs = runs;
        this.matches = matches;
        this.country = country;
    }

    public void displayDetails() {
        System.out.println(playerName + " " + role + " " + runs + " " + matches + " " + country);
		System.out.println("playerName:"+playerName);
		System.out.println("role:"+role);
		System.out.println("runs:"+runs);
		System.out.println("matches:"+matches);
		System.out.println("country:"+country);
		
	}
}