package com.example.frank.test.model;

import java.io.Serializable;
import java.util.List;

public class NFGroups implements Serializable{


    private static final long serialVersionUID = 6293349393089564293L;
    private List<NFGroupInfo> groupInfos;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<NFGroupInfo> getGroupInfos() {
        return groupInfos;
    }

    public void setGroupInfos(List<NFGroupInfo> groupInfos) {
        this.groupInfos = groupInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NFGroups nfGroups = (NFGroups) o;

        return groupInfos != null ? groupInfos.equals(nfGroups.groupInfos) : nfGroups.groupInfos == null;

    }

    @Override
    public int hashCode() {
        return groupInfos != null ? groupInfos.hashCode() : 0;
    }

    @Override
	public String toString() {
		return "NFGroups [groupInfos=" + groupInfos + "]";
	}
}
