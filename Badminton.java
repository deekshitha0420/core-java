class Badminton {
    String playerName;
    String country;
    int matches;
    int wins;
    String coach;

    public Badminton() {
        System.out.println("Badminton Object Created");
    }

    public void setDetails(String playerName, String country, int matches, int wins, String coach) {
        this.playerName = playerName;
        this.country = country;
        this.matches = matches;
        this.wins = wins;
        this.coach = coach;
    }

    public void displayDetails() {
        System.out.println(playerName + " " + country + " " + matches + " " + wins + " " + coach);
		System.out.println("playerName:"+playerName);
		System.out.println("country:"+country);
		System.out.println("matches:"+matches);
		System.out.println("wins:"+wins);
		System.out.println("coach:"+coach);
		
	}
}