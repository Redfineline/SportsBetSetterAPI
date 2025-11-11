package org.frankthebookie.api.services.bet.model;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
public class Bet {

    /**
     * Bet Id for TeamA.
     */
    private int betIdTeamA;

    /**
     * Bet Id for TeamB.
     */
    private int betIdTeamB;

    /**
     * Game ID
     */
    private UUID gameId;

    /**
     * Team A.
     */
    @NotBlank
    @Size(min = 0, max = 20)
    private String teamA;

    /**
     * Team B.
     */
    @NotBlank
    @Size(min = 0, max = 30)
    private String teamB;

    /**
     * Team A Odds
     */
    private int oddsA;

    /**
     * Team B Odds
     */
    private int oddsB;



    public UUID getGameId() {
        return gameId;
    }

    public void setGameId(UUID id) {
        this.gameId = id;
    }


    // ---- ID ----
    public int getBetIdTeamA() {
        return betIdTeamA;
    }

    public void setBetIdTeamA(int betId) {
        this.betIdTeamA = betId;
    }

        // ---- ID ----
    public int getBetIdTeamB() {
        return betIdTeamB;
    }

    public void setBetIdTeamB(int betId) {
        this.betIdTeamB = betId;
    }

    // ---- Team A ----
    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    // ---- Team B ----
    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    // ---- Odds A ----
    public int getOddsA() {
        return oddsA;
    }

    public void setOddsA(int oddsA) {
        this.oddsA = oddsA;
    }

    // ---- Odds B ----
    public int getOddsB() {
        return oddsB;
    }

    public void setOddsB(int oddsB) {
        this.oddsB = oddsB;
    }
}
