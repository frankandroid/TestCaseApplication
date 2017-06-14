package com.example.frank.test.model;

import java.io.Serializable;
import java.util.List;

public class NFGroupInfo implements Serializable{
	private static final long serialVersionUID = 4172528858124358558L;

	private String name;
	private String inplay;
	private String inplayDelay;
	private String stopSell;
	private String groupNumber;
	private String enabled;
	private String singleFlag;

	private String allUpFlag;

	private List<NFOddsSet> oddsSets;
	private String sell;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInplay() {
		return inplay;
	}

	public void setInplay(String inplay) {
		this.inplay = inplay;
	}

	public String getInplayDelay() {
		return inplayDelay;
	}

	public void setInplayDelay(String inplayDelay) {
		this.inplayDelay = inplayDelay;
	}

	public String getStopSell() {
		return stopSell;
	}

	public void setStopSell(String stopSell) {
		this.stopSell = stopSell;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getSingleFlag() {
		return singleFlag;
	}

	public void setSingleFlag(String singleFlag) {
		this.singleFlag = singleFlag;
	}

	public String getAllUpFlag() {
		return allUpFlag;
	}

	public void setAllUpFlag(String allUpFlag) {
		this.allUpFlag = allUpFlag;
	}

	public List<NFOddsSet> getOddsSets() {
		return oddsSets;
	}

	public void setOddsSets(List<NFOddsSet> oddsSets) {
		this.oddsSets = oddsSets;
	}

	public String getSell() {
		return sell;
	}

	public void setSell(String sell) {
		this.sell = sell;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFGroupInfo that = (NFGroupInfo) o;

		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (inplay != null ? !inplay.equals(that.inplay) : that.inplay != null) return false;
		if (inplayDelay != null ? !inplayDelay.equals(that.inplayDelay) : that.inplayDelay != null)
			return false;
		if (stopSell != null ? !stopSell.equals(that.stopSell) : that.stopSell != null)
			return false;
		if (groupNumber != null ? !groupNumber.equals(that.groupNumber) : that.groupNumber != null)
			return false;
		if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
		if (singleFlag != null ? !singleFlag.equals(that.singleFlag) : that.singleFlag != null)
			return false;
		if (allUpFlag != null ? !allUpFlag.equals(that.allUpFlag) : that.allUpFlag != null)
			return false;
		if (oddsSets != null ? !oddsSets.equals(that.oddsSets) : that.oddsSets != null)
			return false;
		return sell != null ? sell.equals(that.sell) : that.sell == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (inplay != null ? inplay.hashCode() : 0);
		result = 31 * result + (inplayDelay != null ? inplayDelay.hashCode() : 0);
		result = 31 * result + (stopSell != null ? stopSell.hashCode() : 0);
		result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
		result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
		result = 31 * result + (singleFlag != null ? singleFlag.hashCode() : 0);
		result = 31 * result + (allUpFlag != null ? allUpFlag.hashCode() : 0);
		result = 31 * result + (oddsSets != null ? oddsSets.hashCode() : 0);
		result = 31 * result + (sell != null ? sell.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFGroupInfo{" +
				"name='" + name + '\'' +
				", inplay='" + inplay + '\'' +
				", inplayDelay='" + inplayDelay + '\'' +
				", stopSell='" + stopSell + '\'' +
				", groupNumber='" + groupNumber + '\'' +
				", enabled='" + enabled + '\'' +
				", singleFlag='" + singleFlag + '\'' +
				", allUpFlag='" + allUpFlag + '\'' +
				", oddsSets=" + oddsSets +
				", sell='" + sell + '\'' +
				'}';
	}
}
