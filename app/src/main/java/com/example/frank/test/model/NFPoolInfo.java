package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Done
public class NFPoolInfo implements Serializable {
	private static final long serialVersionUID = -2588445335049849300L;

    @SerializedName("Enabled")
	private String enabled;
	@SerializedName("InplayDelay")
	private String inplayDelay;
	@SerializedName("Pool")
	private String pool;
	@SerializedName("OddsUpdateTime")
	private String oddsUpdateTime;
	@SerializedName("StopSell")
	private String stopSell;
	@SerializedName("InPlayFlag")
	private String inPlayFlag;
	@SerializedName("AllUpFlag")
	private String allUpFlag;
	@SerializedName("HalfTimeFlag")
	private String halfTimeFlag;
	@SerializedName("XT")
	private String xt;
	@SerializedName("ItemNumber")
	private String itemNumber;
	@SerializedName("ItemNumberDisplay")
	private String itemNumberDisplay;

	@SerializedName("OddsSet")
	private Object oddsSets;
//	@SerializedName("OddsSet")
//	private List<NFOddsSet> oddsSets;
	private List<NFLegInfo> legInfos;
	private NFGroups groups;
//	@SerializedName("OddsSet")
	private String testString;

	private NFOddsInfo homeOdds;
	private NFOddsInfo awayOdds;
	private NFOddsInfo drawOdds;

	private List<NFOddsInfo> homeOddsArr;
	private List<NFOddsInfo> awayOddsArr;
	private List<NFOddsInfo> drawOddsArr;

	@SerializedName("TournamentID")
	private String TournamentID;
	@SerializedName("TournamentName")
	private String TournamentName;
	@SerializedName("TournamentShortName")
	private String TournamentShortName;
	@SerializedName("TournamentNumber")
	private String TournamentNumber;

	@SerializedName("GroupName")
	private String GroupName;
	@SerializedName("GroupNumber")
	private String GroupNumber;

	@SerializedName("InvestmentTotal")
	private String InvestmentTotal;
	@SerializedName("JackpotGenerated")
	private String JackpotGenerated;

	private ArrayList<List<NFOddsInfo>> otherLineOdds;
	@SerializedName("SingleFlag")
	private String singleFlag;
	private String closed;

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getInplayDelay() {
		return inplayDelay;
	}

	public void setInplayDelay(String inplayDelay) {
		this.inplayDelay = inplayDelay;
	}

	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	public String getOddsUpdateTime() {
		return oddsUpdateTime;
	}

	public void setOddsUpdateTime(String oddsUpdateTime) {
		this.oddsUpdateTime = oddsUpdateTime;
	}

	public String getStopSell() {
		return stopSell;
	}

	public void setStopSell(String stopSell) {
		this.stopSell = stopSell;
	}

	public String getInPlayFlag() {
		return inPlayFlag;
	}

	public void setInPlayFlag(String inPlayFlag) {
		this.inPlayFlag = inPlayFlag;
	}

	public String getAllUpFlag() {
		return allUpFlag;
	}

	public void setAllUpFlag(String allUpFlag) {
		this.allUpFlag = allUpFlag;
	}

	public String getHalfTimeFlag() {
		return halfTimeFlag;
	}

	public void setHalfTimeFlag(String halfTimeFlag) {
		this.halfTimeFlag = halfTimeFlag;
	}

	public String getXt() {
		return xt;
	}

	public void setXt(String xt) {
		this.xt = xt;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemNumberDisplay() {
		return itemNumberDisplay;
	}

	public void setItemNumberDisplay(String itemNumberDisplay) {
		this.itemNumberDisplay = itemNumberDisplay;
	}

//	public List<NFOddsSet> getOddsSets() {
//		return oddsSets;
//	}
//
//	public void setOddsSets(List<NFOddsSet> oddsSets) {
//		this.oddsSets = oddsSets;
//	}

	public Object getOddsSets() {
		return oddsSets;
	}

	public void setOddsSets(Object oddsSets) {
		this.oddsSets = oddsSets;
	}

	public List<NFLegInfo> getLegInfos() {
		return legInfos;
	}

	public void setLegInfos(List<NFLegInfo> legInfos) {
		this.legInfos = legInfos;
	}

	public NFGroups getGroups() {
		return groups;
	}

	public void setGroups(NFGroups groups) {
		this.groups = groups;
	}

	public NFOddsInfo getHomeOdds() {
		return homeOdds;
	}

	public void setHomeOdds(NFOddsInfo homeOdds) {
		this.homeOdds = homeOdds;
	}

	public NFOddsInfo getAwayOdds() {
		return awayOdds;
	}

	public void setAwayOdds(NFOddsInfo awayOdds) {
		this.awayOdds = awayOdds;
	}

	public NFOddsInfo getDrawOdds() {
		return drawOdds;
	}

	public void setDrawOdds(NFOddsInfo drawOdds) {
		this.drawOdds = drawOdds;
	}

	public List<NFOddsInfo> getHomeOddsArr() {
		return homeOddsArr;
	}

	public void setHomeOddsArr(List<NFOddsInfo> homeOddsArr) {
		this.homeOddsArr = homeOddsArr;
	}

	public List<NFOddsInfo> getAwayOddsArr() {
		return awayOddsArr;
	}

	public void setAwayOddsArr(List<NFOddsInfo> awayOddsArr) {
		this.awayOddsArr = awayOddsArr;
	}

	public List<NFOddsInfo> getDrawOddsArr() {
		return drawOddsArr;
	}

	public void setDrawOddsArr(List<NFOddsInfo> drawOddsArr) {
		this.drawOddsArr = drawOddsArr;
	}

	public String getTournamentID() {
		return TournamentID;
	}

	public void setTournamentID(String tournamentID) {
		TournamentID = tournamentID;
	}

	public String getTournamentName() {
		return TournamentName;
	}

	public void setTournamentName(String tournamentName) {
		TournamentName = tournamentName;
	}

	public String getTournamentShortName() {
		return TournamentShortName;
	}

	public void setTournamentShortName(String tournamentShortName) {
		TournamentShortName = tournamentShortName;
	}

	public String getTournamentNumber() {
		return TournamentNumber;
	}

	public void setTournamentNumber(String tournamentNumber) {
		TournamentNumber = tournamentNumber;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	public String getGroupNumber() {
		return GroupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		GroupNumber = groupNumber;
	}

	public String getInvestmentTotal() {
		return InvestmentTotal;
	}

	public void setInvestmentTotal(String investmentTotal) {
		InvestmentTotal = investmentTotal;
	}

	public String getJackpotGenerated() {
		return JackpotGenerated;
	}

	public void setJackpotGenerated(String jackpotGenerated) {
		JackpotGenerated = jackpotGenerated;
	}

	public ArrayList<List<NFOddsInfo>> getOtherLineOdds() {
		return otherLineOdds;
	}

	public void setOtherLineOdds(ArrayList<List<NFOddsInfo>> otherLineOdds) {
		this.otherLineOdds = otherLineOdds;
	}

	public String getSingleFlag() {
		return singleFlag;
	}

	public void setSingleFlag(String singleFlag) {
		this.singleFlag = singleFlag;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFPoolInfo that = (NFPoolInfo) o;

		if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
		if (inplayDelay != null ? !inplayDelay.equals(that.inplayDelay) : that.inplayDelay != null)
			return false;
		if (pool != null ? !pool.equals(that.pool) : that.pool != null) return false;
		if (oddsUpdateTime != null ? !oddsUpdateTime.equals(that.oddsUpdateTime) : that.oddsUpdateTime != null)
			return false;
		if (stopSell != null ? !stopSell.equals(that.stopSell) : that.stopSell != null)
			return false;
		if (inPlayFlag != null ? !inPlayFlag.equals(that.inPlayFlag) : that.inPlayFlag != null)
			return false;
		if (allUpFlag != null ? !allUpFlag.equals(that.allUpFlag) : that.allUpFlag != null)
			return false;
		if (halfTimeFlag != null ? !halfTimeFlag.equals(that.halfTimeFlag) : that.halfTimeFlag != null)
			return false;
		if (xt != null ? !xt.equals(that.xt) : that.xt != null) return false;
		if (itemNumber != null ? !itemNumber.equals(that.itemNumber) : that.itemNumber != null)
			return false;
		if (itemNumberDisplay != null ? !itemNumberDisplay.equals(that.itemNumberDisplay) : that.itemNumberDisplay != null)
			return false;
		if (oddsSets != null ? !oddsSets.equals(that.oddsSets) : that.oddsSets != null)
			return false;
		if (legInfos != null ? !legInfos.equals(that.legInfos) : that.legInfos != null)
			return false;
		if (groups != null ? !groups.equals(that.groups) : that.groups != null) return false;
		if (testString != null ? !testString.equals(that.testString) : that.testString != null)
			return false;
		if (homeOdds != null ? !homeOdds.equals(that.homeOdds) : that.homeOdds != null)
			return false;
		if (awayOdds != null ? !awayOdds.equals(that.awayOdds) : that.awayOdds != null)
			return false;
		if (drawOdds != null ? !drawOdds.equals(that.drawOdds) : that.drawOdds != null)
			return false;
		if (homeOddsArr != null ? !homeOddsArr.equals(that.homeOddsArr) : that.homeOddsArr != null)
			return false;
		if (awayOddsArr != null ? !awayOddsArr.equals(that.awayOddsArr) : that.awayOddsArr != null)
			return false;
		if (drawOddsArr != null ? !drawOddsArr.equals(that.drawOddsArr) : that.drawOddsArr != null)
			return false;
		if (TournamentID != null ? !TournamentID.equals(that.TournamentID) : that.TournamentID != null)
			return false;
		if (TournamentName != null ? !TournamentName.equals(that.TournamentName) : that.TournamentName != null)
			return false;
		if (TournamentShortName != null ? !TournamentShortName.equals(that.TournamentShortName) : that.TournamentShortName != null)
			return false;
		if (TournamentNumber != null ? !TournamentNumber.equals(that.TournamentNumber) : that.TournamentNumber != null)
			return false;
		if (GroupName != null ? !GroupName.equals(that.GroupName) : that.GroupName != null)
			return false;
		if (GroupNumber != null ? !GroupNumber.equals(that.GroupNumber) : that.GroupNumber != null)
			return false;
		if (InvestmentTotal != null ? !InvestmentTotal.equals(that.InvestmentTotal) : that.InvestmentTotal != null)
			return false;
		if (JackpotGenerated != null ? !JackpotGenerated.equals(that.JackpotGenerated) : that.JackpotGenerated != null)
			return false;
		if (otherLineOdds != null ? !otherLineOdds.equals(that.otherLineOdds) : that.otherLineOdds != null)
			return false;
		if (singleFlag != null ? !singleFlag.equals(that.singleFlag) : that.singleFlag != null)
			return false;
		return closed != null ? closed.equals(that.closed) : that.closed == null;

	}

	@Override
	public int hashCode() {
		int result = enabled != null ? enabled.hashCode() : 0;
		result = 31 * result + (inplayDelay != null ? inplayDelay.hashCode() : 0);
		result = 31 * result + (pool != null ? pool.hashCode() : 0);
		result = 31 * result + (oddsUpdateTime != null ? oddsUpdateTime.hashCode() : 0);
		result = 31 * result + (stopSell != null ? stopSell.hashCode() : 0);
		result = 31 * result + (inPlayFlag != null ? inPlayFlag.hashCode() : 0);
		result = 31 * result + (allUpFlag != null ? allUpFlag.hashCode() : 0);
		result = 31 * result + (halfTimeFlag != null ? halfTimeFlag.hashCode() : 0);
		result = 31 * result + (xt != null ? xt.hashCode() : 0);
		result = 31 * result + (itemNumber != null ? itemNumber.hashCode() : 0);
		result = 31 * result + (itemNumberDisplay != null ? itemNumberDisplay.hashCode() : 0);
		result = 31 * result + (oddsSets != null ? oddsSets.hashCode() : 0);
		result = 31 * result + (legInfos != null ? legInfos.hashCode() : 0);
		result = 31 * result + (groups != null ? groups.hashCode() : 0);
		result = 31 * result + (testString != null ? testString.hashCode() : 0);
		result = 31 * result + (homeOdds != null ? homeOdds.hashCode() : 0);
		result = 31 * result + (awayOdds != null ? awayOdds.hashCode() : 0);
		result = 31 * result + (drawOdds != null ? drawOdds.hashCode() : 0);
		result = 31 * result + (homeOddsArr != null ? homeOddsArr.hashCode() : 0);
		result = 31 * result + (awayOddsArr != null ? awayOddsArr.hashCode() : 0);
		result = 31 * result + (drawOddsArr != null ? drawOddsArr.hashCode() : 0);
		result = 31 * result + (TournamentID != null ? TournamentID.hashCode() : 0);
		result = 31 * result + (TournamentName != null ? TournamentName.hashCode() : 0);
		result = 31 * result + (TournamentShortName != null ? TournamentShortName.hashCode() : 0);
		result = 31 * result + (TournamentNumber != null ? TournamentNumber.hashCode() : 0);
		result = 31 * result + (GroupName != null ? GroupName.hashCode() : 0);
		result = 31 * result + (GroupNumber != null ? GroupNumber.hashCode() : 0);
		result = 31 * result + (InvestmentTotal != null ? InvestmentTotal.hashCode() : 0);
		result = 31 * result + (JackpotGenerated != null ? JackpotGenerated.hashCode() : 0);
		result = 31 * result + (otherLineOdds != null ? otherLineOdds.hashCode() : 0);
		result = 31 * result + (singleFlag != null ? singleFlag.hashCode() : 0);
		result = 31 * result + (closed != null ? closed.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFPoolInfo{" +
				"enabled='" + enabled + '\'' +
				", inplayDelay='" + inplayDelay + '\'' +
				", pool='" + pool + '\'' +
				", oddsUpdateTime='" + oddsUpdateTime + '\'' +
				", stopSell='" + stopSell + '\'' +
				", inPlayFlag='" + inPlayFlag + '\'' +
				", allUpFlag='" + allUpFlag + '\'' +
				", halfTimeFlag='" + halfTimeFlag + '\'' +
				", xt='" + xt + '\'' +
				", itemNumber='" + itemNumber + '\'' +
				", itemNumberDisplay='" + itemNumberDisplay + '\'' +
				", oddsSets=" + oddsSets +
				", legInfos=" + legInfos +
				", groups=" + groups +
				", testString='" + testString + '\'' +
				", homeOdds=" + homeOdds +
				", awayOdds=" + awayOdds +
				", drawOdds=" + drawOdds +
				", homeOddsArr=" + homeOddsArr +
				", awayOddsArr=" + awayOddsArr +
				", drawOddsArr=" + drawOddsArr +
				", TournamentID='" + TournamentID + '\'' +
				", TournamentName='" + TournamentName + '\'' +
				", TournamentShortName='" + TournamentShortName + '\'' +
				", TournamentNumber='" + TournamentNumber + '\'' +
				", GroupName='" + GroupName + '\'' +
				", GroupNumber='" + GroupNumber + '\'' +
				", InvestmentTotal='" + InvestmentTotal + '\'' +
				", JackpotGenerated='" + JackpotGenerated + '\'' +
				", otherLineOdds=" + otherLineOdds +
				", singleFlag='" + singleFlag + '\'' +
				", closed='" + closed + '\'' +
				'}';
	}
}
