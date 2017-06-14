package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//Done
public class NFOddsInfo implements Serializable{


	private static final long serialVersionUID = 533100818255462593L;
	@SerializedName("Pool")
	private String pool;
	@SerializedName("Enabled")
	private String enabled;
	@SerializedName("Number")
	private String number;
	@SerializedName("Odds")
	private String odds;
	@SerializedName("Condition")
	private String condition;
	@SerializedName("Value")
	private String value;
	@SerializedName("Name")
	private String name;
	@SerializedName("Answer")
	private String answer;

	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOdds() {
		return odds;
	}

	public void setOdds(String odds) {
		this.odds = odds;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFOddsInfo that = (NFOddsInfo) o;

		if (pool != null ? !pool.equals(that.pool) : that.pool != null) return false;
		if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
		if (number != null ? !number.equals(that.number) : that.number != null) return false;
		if (odds != null ? !odds.equals(that.odds) : that.odds != null) return false;
		if (condition != null ? !condition.equals(that.condition) : that.condition != null)
			return false;
		if (value != null ? !value.equals(that.value) : that.value != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		return answer != null ? answer.equals(that.answer) : that.answer == null;

	}

	@Override
	public int hashCode() {
		int result = pool != null ? pool.hashCode() : 0;
		result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
		result = 31 * result + (number != null ? number.hashCode() : 0);
		result = 31 * result + (odds != null ? odds.hashCode() : 0);
		result = 31 * result + (condition != null ? condition.hashCode() : 0);
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (answer != null ? answer.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFOddsInfo [pool=" + pool + ", enabled=" + enabled
				+ ", number=" + number + ", odds=" + odds + ", condition="
				+ condition + ", value=" + value + ", name=" + name
				+ ", answer=" + answer + "]";
	}
}
