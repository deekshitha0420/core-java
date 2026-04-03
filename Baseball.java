class Baseball {
    String teamName;
    String player;
    int homeRuns;
    int matches;
    String league;

    public Baseball() {
        System.out.println("Baseball Object Created");
    }

    public void setDetails(String teamName, String player, int homeRuns, int matches, String league) {
        this.teamName = teamName;
        this.player = player;
        this.homeRuns = homeRuns;
        this.matches = matches;
        this.league = league;
    }

    public void displayDetails() {
        System.out.println(teamName + " " + player + " " + homeRuns + " " + matches + " " + league);
		System.out.println("teamName:"+teamName);
		System.out.println("player:"+player);
		System.out.println("homeRuns:"+homeRuns);
		System.out.println("matches:"+matches);
		System.out.println("league:"+league);
	}
}