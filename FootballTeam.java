package com.company;

public class FootballTeam {

    public String name;
    public String country;
    public String[] players_names;
    public int team_rank;

    // function

    public void changeRating(int x_rank) {
        System.out.println(x_rank);
    }

    public void replacePlayer(String current_player, String new_player) {
        current_player = new_player;
    }
}
