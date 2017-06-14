package com.example.frank.test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class NFPools implements Serializable {

	private static final long serialVersionUID = -1338598662370180196L;

	@SerializedName("PoolInfo")
	private List<NFPoolInfo> poolInfos;

	public List<NFPoolInfo> getPoolInfos() {
		return poolInfos;
	}

	public void setPoolInfos(List<NFPoolInfo> poolInfos) {
		this.poolInfos = poolInfos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NFPools nfPools = (NFPools) o;

		return poolInfos != null ? poolInfos.equals(nfPools.poolInfos) : nfPools.poolInfos == null;

	}

	@Override
	public int hashCode() {
		return poolInfos != null ? poolInfos.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "NFPools [PoolInfos=" + poolInfos + "]";
	}
}
