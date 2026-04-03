class Football {
    String teamName;
    String coach;
    int goals;
    int matches;
    String league;

    public Football() {
        System.out.println("Football Object Created");
    }

    public void setDetails(String teamName, String coach, int goals, int matches, String league) {
        this.teamName = teamName;
        this.coach = coach;
        this.goals = goals;
        this.matches = matches;
        this.league = league;
    }

    public void displayDetails() {
        System.out.println(teamName + " " + coach + " " + goals + " " + matches + " " + league);
		System.out.println("teamName:"+teamName);
		System.out.println("coach:"+coach);
		System.out.println("goals:"+goals);
		System.out.println("matches:"+matches);
		System.out.println("league:"+league);
    }
}