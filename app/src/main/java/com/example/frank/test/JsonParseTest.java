package com.example.frank.test;

import com.example.frank.test.model.NFMatchInfo;
import com.example.frank.test.model.NFOddsInfo;
import com.example.frank.test.model.NFOddsSet;
import com.example.frank.test.model.NFPoolInfo;
import com.example.frank.test.model.NFPools;
import com.example.frank.test.model.NFProgress;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * 创建者     frank
 * 创建时间   2017/6/14 20:04
 * 描述	      ${TODO}
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public class JsonParseTest {

    public static NFMatchInfo parseJson(String json) throws Exception {

        JSONObject jsonMatchInfo = new JSONObject(json);

        //对matchinfo的一般field赋值。
        NFMatchInfo matchInfo = new NFMatchInfo();
        matchInfo.setAllUpEnabled(jsonMatchInfo.getString("AllUpEnabled"));
        matchInfo.setAway(jsonMatchInfo.getString("Away"));
        matchInfo.setDate(jsonMatchInfo.getString("Date"));
        matchInfo.setEnabled(jsonMatchInfo.getString("Enabled"));
        matchInfo.setFixedOddsPoolEnabled(jsonMatchInfo.getString("FixedOddsPoolEnabled"));
        matchInfo.setHome(jsonMatchInfo.getString("Home"));
        matchInfo.setInplay(jsonMatchInfo.getString("Inplay"));
        matchInfo.setInplayDelay(jsonMatchInfo.getString("InplayDelay"));
        matchInfo.setLeague(jsonMatchInfo.getString("League"));
        matchInfo.setMLCKickOff(jsonMatchInfo.getString("MLCKickOff"));
        matchInfo.setMatchAbandoned(jsonMatchInfo.getString("MatchAbandoned"));
        matchInfo.setMatchConcluded(jsonMatchInfo.getString("MatchConcluded"));
        matchInfo.setMatchDateTime(jsonMatchInfo.getString("MatchDateTime"));
        matchInfo.setMatchDay(jsonMatchInfo.getString("MatchDay"));
        matchInfo.setMatchID(jsonMatchInfo.getString("MatchID"));
        matchInfo.setMatchNum(jsonMatchInfo.getString("MatchNum"));
        matchInfo.setMatchPoolCloseDate(jsonMatchInfo.getString("MatchPoolCloseDate"));
        matchInfo.setMatchPoolCloseTime(jsonMatchInfo.getString("MatchPoolCloseTime"));
        matchInfo.setOpened(jsonMatchInfo.getString("Opened"));


        //对pools赋值
        NFPools nfPools = new NFPools();
        JSONObject jsonpools = jsonMatchInfo.getJSONObject("Pools");
        JSONArray jsonArrayPoolInfo = jsonpools.getJSONArray("PoolInfo");

        List<NFPoolInfo> nfPoolInfoList = new ArrayList<NFPoolInfo>();
        NFPoolInfo nfPoolInfo;
        for (int i = 0; i < jsonArrayPoolInfo.length(); i++) {

            nfPoolInfo = new NFPoolInfo();
            JSONObject jsonPoolInfo = (JSONObject) jsonArrayPoolInfo.get(i);
            nfPoolInfo.setAllUpFlag(jsonPoolInfo.getString("AllUpFlag"));
            nfPoolInfo.setEnabled(jsonPoolInfo.getString("Enabled"));
            nfPoolInfo.setHalfTimeFlag(jsonPoolInfo.getString("HalfTimeFlag"));
            nfPoolInfo.setInPlayFlag(jsonPoolInfo.getString("InPlayFlag"));
            nfPoolInfo.setInplayDelay(jsonPoolInfo.getString("InplayDelay"));
            nfPoolInfo.setOddsUpdateTime(jsonPoolInfo.getString("OddsUpdateTime"));
            nfPoolInfo.setPool(jsonPoolInfo.getString("Pool"));
            nfPoolInfo.setSingleFlag(jsonPoolInfo.getString("SingleFlag"));
            nfPoolInfo.setStopSell(jsonPoolInfo.getString("StopSell"));
            nfPoolInfo.setXt(jsonPoolInfo.getString("XT"));

            Object jsonOddsSet = jsonPoolInfo.get("OddsSet");
            JSONArray jsonArrayOddsInfo = null;
            if (jsonOddsSet instanceof JSONObject) {
                //oddsset是对象的情况
                JSONObject jsonObject = (JSONObject) jsonOddsSet;
                jsonArrayOddsInfo = jsonObject.getJSONArray("OddsInfo");

                NFOddsSet nfOddsSet = new NFOddsSet();
                List<NFOddsInfo> nfOddsInfoList = new ArrayList<NFOddsInfo>();
                NFOddsInfo nfOddsInfo;

                for (int j = 0; j < jsonArrayOddsInfo.length(); j++) {

                    nfOddsInfo = new NFOddsInfo();
                    JSONObject jsonNfOddsInfo = (JSONObject) jsonArrayOddsInfo.get(j);
                    nfOddsInfo.setEnabled(jsonNfOddsInfo.getString("Enabled"));
                    nfOddsInfo.setNumber(jsonNfOddsInfo.getString("Number"));
                    nfOddsInfo.setOdds(jsonNfOddsInfo.getString("Odds"));
                    nfOddsInfo.setValue(jsonNfOddsInfo.getString("Value"));

                    nfOddsInfoList.add(nfOddsInfo);

                }

                nfOddsSet.setOddsInfos(nfOddsInfoList);
                nfPoolInfo.setOddsSets(nfOddsSet);
                nfPoolInfoList.add(nfPoolInfo);

            } else if (jsonOddsSet instanceof JSONArray) {
                //oddset是数组的情况
                JSONArray jsonArray = (JSONArray) jsonOddsSet;
                List<NFOddsSet> nfOddsSetList = new ArrayList<>();

                for (int k = 0; k < jsonArray.length(); k++) {
                    JSONObject jsonOddsetObj = (JSONObject) jsonArray.get(k);
                    //oddsset是对象的情况
                    JSONObject jsonObject = (JSONObject) jsonOddsetObj;
                    jsonArrayOddsInfo = jsonObject.getJSONArray("OddsInfo");

                    NFOddsSet nfOddsSet = new NFOddsSet();
                    List<NFOddsInfo> nfOddsInfoList = new ArrayList<NFOddsInfo>();
                    NFOddsInfo nfOddsInfo;

                    for (int j = 0; j < jsonArrayOddsInfo.length(); j++) {

                        nfOddsInfo = new NFOddsInfo();
                        JSONObject jsonNfOddsInfo = (JSONObject) jsonArrayOddsInfo.get(j);
                        nfOddsInfo.setEnabled(jsonNfOddsInfo.getString("Enabled"));
                        nfOddsInfo.setNumber(jsonNfOddsInfo.getString("Number"));
                        nfOddsInfo.setOdds(jsonNfOddsInfo.getString("Odds"));
                        nfOddsInfo.setValue(jsonNfOddsInfo.getString("Value"));

                        nfOddsInfoList.add(nfOddsInfo);


                    }
                    nfOddsSet.setOddsInfos(nfOddsInfoList);
                    nfOddsSet.setTag(jsonOddsetObj.getString("Tag"));
                    nfOddsSetList.add(nfOddsSet);
                }

                nfPoolInfo.setOddsSets(nfOddsSetList);
                nfPoolInfoList.add(nfPoolInfo);


            }


        }

        nfPools.setPoolInfos(nfPoolInfoList);
        matchInfo.setPools(nfPools);

        JSONObject jsonprogress = jsonMatchInfo.getJSONObject("Progress");
        NFProgress nfProgress = new NFProgress();
        nfProgress.setCorner(jsonprogress.getString("Corner"));
        nfProgress.setCornerFull(jsonprogress.getString("CornerFull"));
        nfProgress.setMatchProgress(jsonprogress.getString("MatchProgress"));
        nfProgress.setMatchProgressEx(jsonprogress.getString("MatchProgressEx"));
        nfProgress.setResult(jsonprogress.getString("Result"));

        matchInfo.setProgress(nfProgress);

        return matchInfo;
    }


}
