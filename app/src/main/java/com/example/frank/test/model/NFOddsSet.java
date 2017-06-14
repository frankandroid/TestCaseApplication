package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

//Done
public class NFOddsSet implements Serializable{

	private static final long serialVersionUID = -666831879991702015L;
	@SerializedName("Tag")
	private String tag;
	@SerializedName("Name")
	private String name;
	@SerializedName("Question")
	private NFQuestion question;
	@SerializedName("OddsInfo")
	private List<NFOddsInfo> oddsInfos;

	@SerializedName("MainLine")
	private String mainLine;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NFQuestion getQuestion() {
		return question;
	}

	public void setQuestion(NFQuestion question) {
		this.question = question;
	}

	public List<NFOddsInfo> getOddsInfos() {
		return oddsInfos;
	}

	public void setOddsInfos(List<NFOddsInfo> oddsInfos) {
		this.oddsInfos = oddsInfos;
	}

	public String getMainLine() {
		return mainLine;
	}

	public void setMainLine(String mainLine) {
		this.mainLine = mainLine;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFOddsSet nfOddsSet = (NFOddsSet) o;

		if (tag != null ? !tag.equals(nfOddsSet.tag) : nfOddsSet.tag != null) return false;
		if (name != null ? !name.equals(nfOddsSet.name) : nfOddsSet.name != null) return false;
		if (question != null ? !question.equals(nfOddsSet.question) : nfOddsSet.question != null)
			return false;
		if (oddsInfos != null ? !oddsInfos.equals(nfOddsSet.oddsInfos) : nfOddsSet.oddsInfos != null)
			return false;
		return mainLine != null ? mainLine.equals(nfOddsSet.mainLine) : nfOddsSet.mainLine == null;

	}

	@Override
	public int hashCode() {
		int result = tag != null ? tag.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (question != null ? question.hashCode() : 0);
		result = 31 * result + (oddsInfos != null ? oddsInfos.hashCode() : 0);
		result = 31 * result + (mainLine != null ? mainLine.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFOddsSet [tag=" + tag + ", name=" + name + ", question="
				+ question + ", oddsInfos=" + oddsInfos + "]";
	}
}
