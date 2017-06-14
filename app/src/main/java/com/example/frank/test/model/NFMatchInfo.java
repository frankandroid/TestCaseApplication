package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Project: AFO1
 *
 * @create_date: 7/6/2017 - 4:49 PM
 * @author: power
 * @descripton:
 */

public class NFMatchInfo implements Serializable{

    private static final long serialVersionUID =-1218406967241451312L;

    @SerializedName("Date")
    private String date;
    @SerializedName("MatchDateTime")
    private String matchDay;
    @SerializedName("MatchNum")
    private String matchNum;
    @SerializedName("MatchID")
    private String matchID;
    @SerializedName("MatchPoolCloseTime")
    private String matchPoolCloseTime;
    @SerializedName("MatchPoolCloseDate")
    private String matchPoolCloseDate;
    @SerializedName("Enabled")
    private String enabled;
    @SerializedName("Inplay")
    private String inplay;
    //
    @SerializedName("InplayDelay")
    private String inplayDelay;
    @SerializedName("Opened")
    private String opened;
    @SerializedName("League")
    private String league;
    @SerializedName("Home")
    private String home;
    @SerializedName("Away")
    private String away;
    @SerializedName("MatchAbandoned")
    private String matchAbandoned;
    @SerializedName("MatchConcluded")
    private String matchConcluded;
    @SerializedName("MatchDateTime")
    private String matchDateTime;
    @SerializedName("FixedOddsPoolEnabled")
    private String FixedOddsPoolEnabled;
//    private String chlInPlayFlag;
    @SerializedName("MLCKickOff")
    private String MLCKickOff;
    @SerializedName("AllUpEnabled")
    private String allUpEnabled;

    @SerializedName("Progress")
    private NFProgress progress = null;
    @SerializedName("Pools")
    private NFPools pools = null;


    public String getMatchDateTime() {
        return matchDateTime;
    }

    public void setMatchDateTime(String matchDateTime) {
        this.matchDateTime = matchDateTime;
    }

    public String getInplayDelay() {
        return inplayDelay;
    }

    public void setInplayDelay(String inplayDelay) {
        this.inplayDelay = inplayDelay;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(String matchDay) {
        this.matchDay = matchDay;
    }

    public String getMatchNum() {
        return matchNum;
    }

    public void setMatchNum(String matchNum) {
        this.matchNum = matchNum;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getMatchPoolCloseTime() {
        return matchPoolCloseTime;
    }

    public void setMatchPoolCloseTime(String matchPoolCloseTime) {
        this.matchPoolCloseTime = matchPoolCloseTime;
    }

    public String getMatchPoolCloseDate() {
        return matchPoolCloseDate;
    }

    public void setMatchPoolCloseDate(String matchPoolCloseDate) {
        this.matchPoolCloseDate = matchPoolCloseDate;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getInplay() {
        return inplay;
    }

    public void setInplay(String inplay) {
        this.inplay = inplay;
    }

    public String getOpened() {
        return opened;
    }

    public void setOpened(String opened) {
        this.opened = opened;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getMatchAbandoned() {
        return matchAbandoned;
    }

    public void setMatchAbandoned(String matchAbandoned) {
        this.matchAbandoned = matchAbandoned;
    }

    public String getMatchConcluded() {
        return matchConcluded;
    }

    public void setMatchConcluded(String matchConcluded) {
        this.matchConcluded = matchConcluded;
    }

    public String getFixedOddsPoolEnabled() {
        return FixedOddsPoolEnabled;
    }

    public void setFixedOddsPoolEnabled(String fixedOddsPoolEnabled) {
        FixedOddsPoolEnabled = fixedOddsPoolEnabled;
    }

    public String getMLCKickOff() {
        return MLCKickOff;
    }

    public void setMLCKickOff(String MLCKickOff) {
        this.MLCKickOff = MLCKickOff;
    }

    public String getAllUpEnabled() {
        return allUpEnabled;
    }

    public void setAllUpEnabled(String allUpEnabled) {
        this.allUpEnabled = allUpEnabled;
    }

    public NFProgress getProgress() {
        return progress;
    }

    public void setProgress(NFProgress progress) {
        this.progress = progress;
    }

    public NFPools getPools() {
        return pools;
    }

    public void setPools(NFPools pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NFMatchInfo that = (NFMatchInfo) o;

        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (matchDay != null ? !matchDay.equals(that.matchDay) : that.matchDay != null)
            return false;
        if (matchNum != null ? !matchNum.equals(that.matchNum) : that.matchNum != null)
            return false;
        if (matchID != null ? !matchID.equals(that.matchID) : that.matchID != null) return false;
        if (matchPoolCloseTime != null ? !matchPoolCloseTime.equals(that.matchPoolCloseTime) : that.matchPoolCloseTime != null)
            return false;
        if (matchPoolCloseDate != null ? !matchPoolCloseDate.equals(that.matchPoolCloseDate) : that.matchPoolCloseDate != null)
            return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (inplay != null ? !inplay.equals(that.inplay) : that.inplay != null) return false;
        if (opened != null ? !opened.equals(that.opened) : that.opened != null) return false;
        if (league != null ? !league.equals(that.league) : that.league != null) return false;
        if (home != null ? !home.equals(that.home) : that.home != null) return false;
        if (away != null ? !away.equals(that.away) : that.away != null) return false;
        if (matchAbandoned != null ? !matchAbandoned.equals(that.matchAbandoned) : that.matchAbandoned != null)
            return false;
        if (matchConcluded != null ? !matchConcluded.equals(that.matchConcluded) : that.matchConcluded != null)
            return false;
        if (FixedOddsPoolEnabled != null ? !FixedOddsPoolEnabled.equals(that.FixedOddsPoolEnabled) : that.FixedOddsPoolEnabled != null)
            return false;
        if (MLCKickOff != null ? !MLCKickOff.equals(that.MLCKickOff) : that.MLCKickOff != null)
            return false;
        if (allUpEnabled != null ? !allUpEnabled.equals(that.allUpEnabled) : that.allUpEnabled != null)
            return false;
        if (progress != null ? !progress.equals(that.progress) : that.progress != null)
            return false;
        return pools != null ? pools.equals(that.pools) : that.pools == null;

    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (matchDay != null ? matchDay.hashCode() : 0);
        result = 31 * result + (matchNum != null ? matchNum.hashCode() : 0);
        result = 31 * result + (matchID != null ? matchID.hashCode() : 0);
        result = 31 * result + (matchPoolCloseTime != null ? matchPoolCloseTime.hashCode() : 0);
        result = 31 * result + (matchPoolCloseDate != null ? matchPoolCloseDate.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (inplay != null ? inplay.hashCode() : 0);
        result = 31 * result + (opened != null ? opened.hashCode() : 0);
        result = 31 * result + (league != null ? league.hashCode() : 0);
        result = 31 * result + (home != null ? home.hashCode() : 0);
        result = 31 * result + (away != null ? away.hashCode() : 0);
        result = 31 * result + (matchAbandoned != null ? matchAbandoned.hashCode() : 0);
        result = 31 * result + (matchConcluded != null ? matchConcluded.hashCode() : 0);
        result = 31 * result + (FixedOddsPoolEnabled != null ? FixedOddsPoolEnabled.hashCode() : 0);
        result = 31 * result + (MLCKickOff != null ? MLCKickOff.hashCode() : 0);
        result = 31 * result + (allUpEnabled != null ? allUpEnabled.hashCode() : 0);
        result = 31 * result + (progress != null ? progress.hashCode() : 0);
        result = 31 * result + (pools != null ? pools.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NFMatchInfo{" +
                "date='" + date + '\'' +
                ", matchDay='" + matchDay + '\'' +
                ", matchNum='" + matchNum + '\'' +
                ", matchID='" + matchID + '\'' +
                ", matchPoolCloseTime='" + matchPoolCloseTime + '\'' +
                ", matchPoolCloseDate='" + matchPoolCloseDate + '\'' +
                ", enabled='" + enabled + '\'' +
                ", inplay='" + inplay + '\'' +
                ", opened='" + opened + '\'' +
                ", league='" + league + '\'' +
                ", home='" + home + '\'' +
                ", away='" + away + '\'' +
                ", matchAbandoned='" + matchAbandoned + '\'' +
                ", matchConcluded='" + matchConcluded + '\'' +
                ", FixedOddsPoolEnabled='" + FixedOddsPoolEnabled + '\'' +
                ", MLCKickOff='" + MLCKickOff + '\'' +
                ", allUpEnabled='" + allUpEnabled + '\'' +
                ", progress=" + progress +
                ", pools=" + pools +
                '}';
    }
}
