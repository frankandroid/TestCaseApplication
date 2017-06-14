package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//Done
public class NFProgress implements Serializable {

	private static final long serialVersionUID = 8613030475584884432L;
	@SerializedName("MatchProgress")
	private String MatchProgress;
	@SerializedName("MatchProgressText")
	private String MatchProgressText;
	@SerializedName("Result")
	private String Result;
	@SerializedName("ResultFull")
	private String ResultFull;
	@SerializedName("Corner")
	private String Corner;
	@SerializedName("CornerFull")
	private String CornerFull;
	@SerializedName("MatchProgressEx")
	private String MatchProgressEx;

	public String getMatchProgressEx() {
		return MatchProgressEx;
	}

	public void setMatchProgressEx(String matchProgressEx) {
		MatchProgressEx = matchProgressEx;
	}

	public String getMatchProgress() {
		return MatchProgress;
	}

	public void setMatchProgress(String matchProgress) {
		MatchProgress = matchProgress;
	}

	public String getMatchProgressText() {
		return MatchProgressText;
	}

	public void setMatchProgressText(String matchProgressText) {
		MatchProgressText = matchProgressText;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public String getResultFull() {
		return ResultFull;
	}

	public void setResultFull(String resultFull) {
		ResultFull = resultFull;
	}
	
	public String getCorner() {
		return Corner;
	}

	public void setCorner(String corner) {
		Corner = corner;
	}
	
	public String getCornerFull() {
		return CornerFull;
	}

	public void setCornerFull(String cornerFull) {
		CornerFull = cornerFull;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFProgress that = (NFProgress) o;

		if (MatchProgress != null ? !MatchProgress.equals(that.MatchProgress) : that.MatchProgress != null)
			return false;
		if (MatchProgressText != null ? !MatchProgressText.equals(that.MatchProgressText) : that.MatchProgressText != null)
			return false;
		if (Result != null ? !Result.equals(that.Result) : that.Result != null) return false;
		if (ResultFull != null ? !ResultFull.equals(that.ResultFull) : that.ResultFull != null)
			return false;
		if (Corner != null ? !Corner.equals(that.Corner) : that.Corner != null) return false;
		if (CornerFull != null ? !CornerFull.equals(that.CornerFull) : that.CornerFull != null)
			return false;
		return MatchProgressEx != null ? MatchProgressEx.equals(that.MatchProgressEx) : that.MatchProgressEx == null;

	}

	@Override
	public int hashCode() {
		int result = MatchProgress != null ? MatchProgress.hashCode() : 0;
		result = 31 * result + (MatchProgressText != null ? MatchProgressText.hashCode() : 0);
		result = 31 * result + (Result != null ? Result.hashCode() : 0);
		result = 31 * result + (ResultFull != null ? ResultFull.hashCode() : 0);
		result = 31 * result + (Corner != null ? Corner.hashCode() : 0);
		result = 31 * result + (CornerFull != null ? CornerFull.hashCode() : 0);
		result = 31 * result + (MatchProgressEx != null ? MatchProgressEx.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFProgress [MatchProgress=" + MatchProgress
				+ ", MatchProgressText=" + MatchProgressText + ", Result="
				+ Result + ", ResultFull=" + ResultFull  + ", Corner=" + Corner  + ", CornerFull=" + CornerFull + "]";
	}
}
