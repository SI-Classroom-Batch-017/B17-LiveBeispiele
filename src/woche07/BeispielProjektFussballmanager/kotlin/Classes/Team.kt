package Classes

import TEAM_POSITIONS
import randomNameGenerator

class Team(val name: String, val teamATK: Int, val teamDEF: Int) {

    var gamesPlayed: Int = 0
    var wins: Int = 0
    var ties: Int = 0
    var losses: Int = 0
    var points: Int = 0

    var goalsScored: Int = 0
    var goalsConceded: Int = 0

    var aufstellung = fillTeamWithRandomNames()

    fun calculatePoints(){
        points = 3 * wins + ties
        gamesPlayed = wins + ties + losses
    }

    fun fillTeamWithRandomNames(): Map<String, String>{
        var newRoster = mutableMapOf<String, String>()

        for (position in TEAM_POSITIONS)
            newRoster[position] = randomNameGenerator()

        return newRoster
    }

    fun resetTeam(){
        gamesPlayed = 0
        wins = 0
        ties = 0
        losses = 0
        points = 0

        goalsScored = 0
        goalsConceded = 0
    }

    override fun equals(other: Any?): Boolean {
        return (other is Team) && (name == other.name)
    }
}