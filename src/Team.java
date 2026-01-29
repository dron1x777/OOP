public class Team {
    String teamName;
    String[] players;


    public  Team(String teamName, String[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String addPlayer(String player) {
        String[] newPlayers = new String[players.length + 1];
        for (int i = 0; i < players.length; i++) {
            newPlayers[i] = players[i];
        }
        newPlayers[newPlayers.length - 1] = player;
        players = newPlayers;
        return player + " has joined to " + teamName;
    }

    public void printPlayers() {
        for(int i  = 0; i < players.length; i++) {
            System.out.println("student " + (i+1) + ": " + players[i]+ "  ");
        }
    }
}
