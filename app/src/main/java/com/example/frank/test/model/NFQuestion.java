package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//Done
public class NFQuestion implements Serializable {

	private static final long serialVersionUID = -703749294265735983L;

	@SerializedName("Text")
	private String text;
	@SerializedName("ItemNumber")
	private String itemNumber;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFQuestion that = (NFQuestion) o;

		if (text != null ? !text.equals(that.text) : that.text != null) return false;
		return itemNumber != null ? itemNumber.equals(that.itemNumber) : that.itemNumber == null;

	}

	@Override
	public int hashCode() {
		int result = text != null ? text.hashCode() : 0;
		result = 31 * result + (itemNumber != null ? itemNumber.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "NFQuestion [text=" + text + ", itemNumber=" + itemNumber + "]";
	}
}
