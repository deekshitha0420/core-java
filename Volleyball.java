class Volleyball {
    String teamName;
    String captainName;
    int matches;
    int wins;
    String country;

    public Volleyball() {
        System.out.println("Volleyball Object Created");
    }

    public void setDetails(String teamName, String captainName, int matches, int wins, String country) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.matches = matches;
        this.wins = wins;
        this.country = country;
    }

    public void displayDetails() {
        System.out.println(teamName + " " + captainName + " " + matches + " " + wins + " " + country);
		System.out.println("teamName:"+teamName);
		System.out.println("captainName:"+captainName);
		System.out.println("matches:"+matches);
		System.out.println("wins:"+wins);
		System.out.println("country:"+country);
    }
}