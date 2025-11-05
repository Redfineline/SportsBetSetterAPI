package org.frankthebookie.api.services.bet.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
public class Bet {

    /**
     * Bet Id.
     */
    private int betId;

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

    // ---- ID ----
    public int getBetId() {
        return betId;
    }

    public void setBetId(int betId) {
        this.betId = betId;
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
