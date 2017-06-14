package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

//Done
public class NFLegInfo implements Serializable{

	private static final long serialVersionUID = -6256353745486691308L;
	@SerializedName("Home")
	private String home;
	@SerializedName("Away")
	private String away;
	@SerializedName("Date")
	private String date;
	@SerializedName("MatchID")
	private String matchID;
	@SerializedName("MatchNum")
	private String matchNum;
	@SerializedName("MatchDay")
	private String matchDay;
	@SerializedName("MatchPoolCloseTime")
	private String matchPoolCloseTime;
	@SerializedName("Inplay")
	private String inplay;
	@SerializedName("Opened")
	private String opened;
	@SerializedName("League")
	private String league;
	@SerializedName("LegNo")
	private String legNo;
	@SerializedName("MLCKickOff")
	private String MLCKickOff;
	@SerializedName("MatchInplay")
	private String MatchInplay;
	@SerializedName("MatchAbandoned")
	private String matchAbandoned;
	@SerializedName("MatchConcluded")
	private String matchConcluded;

	@SerializedName("Progress")
	private NFProgress progress = null;
	@SerializedName("OddsSet")
	private List<NFOddsSet> oddsSets = null;

	private List<NFOddsSet> homeOddsArr = null;
	private List<NFOddsSet> awayOddsArr = null;
	private List<NFOddsSet> drawOddsArr = null;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMatchID() {
		return matchID;
	}

	public void setMatchID(String matchID) {
		this.matchID = matchID;
	}

	public String getMatchNum() {
		return matchNum;
	}

	public void setMatchNum(String matchNum) {
		this.matchNum = matchNum;
	}

	public String getMatchDay() {
		return matchDay;
	}

	public void setMatchDay(String matchDay) {
		this.matchDay = matchDay;
	}

	public String getMatchPoolCloseTime() {
		return matchPoolCloseTime;
	}

	public void setMatchPoolCloseTime(String matchPoolCloseTime) {
		this.matchPoolCloseTime = matchPoolCloseTime;
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

	public String getLegNo() {
		return legNo;
	}

	public void setLegNo(String legNo) {
		this.legNo = legNo;
	}

	public String getMLCKickOff() {
		return MLCKickOff;
	}

	public void setMLCKickOff(String MLCKickOff) {
		this.MLCKickOff = MLCKickOff;
	}

	public String getMatchInplay() {
		return MatchInplay;
	}

	public void setMatchInplay(String matchInplay) {
		MatchInplay = matchInplay;
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

	public NFProgress getProgress() {
		return progress;
	}

	public void setProgress(NFProgress progress) {
		this.progress = progress;
	}

	public List<NFOddsSet> getOddsSets() {
		return oddsSets;
	}

	public void setOddsSets(List<NFOddsSet> oddsSets) {
		this.oddsSets = oddsSets;
	}

	public List<NFOddsSet> getHomeOddsArr() {
		return homeOddsArr;
	}

	public void setHomeOddsArr(List<NFOddsSet> homeOddsArr) {
		this.homeOddsArr = homeOddsArr;
	}

	public List<NFOddsSet> getAwayOddsArr() {
		return awayOddsArr;
	}

	public void setAwayOddsArr(List<NFOddsSet> awayOddsArr) {
		this.awayOddsArr = awayOddsArr;
	}

	public List<NFOddsSet> getDrawOddsArr() {
		return drawOddsArr;
	}

	public void setDrawOddsArr(List<NFOddsSet> drawOddsArr) {
		this.drawOddsArr = drawOddsArr;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFLegInfo nfLegInfo = (NFLegInfo) o;

		if (home != null ? !home.equals(nfLegInfo.home) : nfLegInfo.home != null) return false;
		if (away != null ? !away.equals(nfLegInfo.away) : nfLegInfo.away != null) return false;
		if (date != null ? !date.equals(nfLegInfo.date) : nfLegInfo.date != null) return false;
		if (matchID != null ? !matchID.equals(nfLegInfo.matchID) : nfLegInfo.matchID != null)
			return false;
		if (matchNum != null ? !matchNum.equals(nfLegInfo.matchNum) : nfLegInfo.matchNum != null)
			return false;
		if (matchDay != null ? !matchDay.equals(nfLegInfo.matchDay) : nfLegInfo.matchDay != null)
			return false;
		if (matchPoolCloseTime != null ? !matchPoolCloseTime.equals(nfLegInfo.matchPoolCloseTime) : nfLegInfo.matchPoolCloseTime != null)
			return false;
		if (inplay != null ? !inplay.equals(nfLegInfo.inplay) : nfLegInfo.inplay != null)
			return false;
		if (opened != null ? !opened.equals(nfLegInfo.opened) : nfLegInfo.opened != null)
			return false;
		if (league != null ? !league.equals(nfLegInfo.league) : nfLegInfo.league != null)
			return false;
		if (legNo != null ? !legNo.equals(nfLegInfo.legNo) : nfLegInfo.legNo != null) return false;
		if (MLCKickOff != null ? !MLCKickOff.equals(nfLegInfo.MLCKickOff) : nfLegInfo.MLCKickOff != null)
			return false;
		if (MatchInplay != null ? !MatchInplay.equals(nfLegInfo.MatchInplay) : nfLegInfo.MatchInplay != null)
			return false;
		if (matchAbandoned != null ? !matchAbandoned.equals(nfLegInfo.matchAbandoned) : nfLegInfo.matchAbandoned != null)
			return false;
		if (matchConcluded != null ? !matchConcluded.equals(nfLegInfo.matchConcluded) : nfLegInfo.matchConcluded != null)
			return false;
		if (progress != null ? !progress.equals(nfLegInfo.progress) : nfLegInfo.progress != null)
			return false;
		if (oddsSets != null ? !oddsSets.equals(nfLegInfo.oddsSets) : nfLegInfo.oddsSets != null)
			return false;
		if (homeOddsArr != null ? !homeOddsArr.equals(nfLegInfo.homeOddsArr) : nfLegInfo.homeOddsArr != null)
			return false;
		if (awayOddsArr != null ? !awayOddsArr.equals(nfLegInfo.awayOddsArr) : nfLegInfo.awayOddsArr != null)
			return false;
		return drawOddsArr != null ? drawOddsArr.equals(nfLegInfo.drawOddsArr) : nfLegInfo.drawOddsArr == null;

	}

	@Override
	public int hashCode() {
		int result = home != null ? home.hashCode() : 0;
		result = 31 * result + (away != null ? away.hashCode() : 0);
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (matchID != null ? matchID.hashCode() : 0);
		result = 31 * result + (matchNum != null ? matchNum.hashCode() : 0);
		result = 31 * result + (matchDay != null ? matchDay.hashCode() : 0);
		result = 31 * result + (matchPoolCloseTime != null ? matchPoolCloseTime.hashCode() : 0);
		result = 31 * result + (inplay != null ? inplay.hashCode() : 0);
		result = 31 * result + (opened != null ? opened.hashCode() : 0);
		result = 31 * result + (league != null ? league.hashCode() : 0);
		result = 31 * result + (legNo != null ? legNo.hashCode() : 0);
		result = 31 * result + (MLCKickOff != null ? MLCKickOff.hashCode() : 0);
		result = 31 * result + (MatchInplay != null ? MatchInplay.hashCode() : 0);
		result = 31 * result + (matchAbandoned != null ? matchAbandoned.hashCode() : 0);
		result = 31 * result + (matchConcluded != null ? matchConcluded.hashCode() : 0);
		result = 31 * result + (progress != null ? progress.hashCode() : 0);
		result = 31 * result + (oddsSets != null ? oddsSets.hashCode() : 0);
		result = 31 * result + (homeOddsArr != null ? homeOddsArr.hashCode() : 0);
		result = 31 * result + (awayOddsArr != null ? awayOddsArr.hashCode() : 0);
		result = 31 * result + (drawOddsArr != null ? drawOddsArr.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFLegInfo [home=" + home + ", away=" + away + ", date=" + date
				+ ", matchID=" + matchID + ", matchNum=" + matchNum
				+ ", matchDay=" + matchDay + ", matchPoolCloseTime="
				+ matchPoolCloseTime + ", inplay=" + inplay + ", opened="
				+ opened + ", league=" + league + ", progress=" + progress
				+ ", matchAbandoned=" + matchAbandoned + ", matchConcluded="
				+ matchConcluded + ", oddsSets=" + oddsSets + ", homeOddsArr="
				+ homeOddsArr + ", awayOddsArr=" + awayOddsArr
				+ ", drawOddsArr=" + drawOddsArr + "]";
	}
}
