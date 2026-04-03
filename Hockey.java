class Hockey {
    String teamName;
    String captainName;
    int matches;
    int wins;
    String coach;

    public Hockey() {
        System.out.println("Hockey Object Created");
    }

    public void setDetails(String teamName, String captainName, int matches, int wins, String coach) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.matches = matches;
        this.wins = wins;
        this.coach = coach;
    }

    public void displayDetails() {
        System.out.println(teamName + " " + captainName + " " + matches + " " + wins + " " + coach);
		System.out.println("teamName:"+teamName);
		System.out.println("captainName:"+captainName);
		System.out.println("matches:"+matches);
		System.out.println("wins:"+wins);
		System.out.println("coach:"+coach);
    }
}