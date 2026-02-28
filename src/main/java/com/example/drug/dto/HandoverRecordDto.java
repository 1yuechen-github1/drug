package com.example.drug.dto;

import com.example.drug.entity.*;

import java.util.List;

public class HandoverRecordDto extends HandoverRecord {
    private List<Zhongzhi> zhongzhiList;

    private List<Zhigu> zhiguList;

    private List<Ruanzuzhi> ruanzuzhiList;

    private List<Chongxi> chongxiList;

    private List<Chaixian> chaixianList;


    private FirstMedicalMessage firstMedicalMessage;

    private PlanMessage planMessage;

    private List<PhaseIIMessage> phaseIIMessageList;

    private ImpressionMessage impressionMessage;

    private List<TransitMessage> transitMessageList;

    private List<CrownMessage> crownMessageList;

    private List<SubsequentMessage> subsequentMessageList;

    public FirstMedicalMessage getFirstMedicalMessage() {
        return firstMedicalMessage;
    }

    public void setFirstMedicalMessage(FirstMedicalMessage firstMedicalMessage) {
        this.firstMedicalMessage = firstMedicalMessage;
    }

    public PlanMessage getPlanMessage() {
        return planMessage;
    }

    public void setPlanMessage(PlanMessage planMessage) {
        this.planMessage = planMessage;
    }

    public List<PhaseIIMessage> getPhaseIIMessageList() {
        return phaseIIMessageList;
    }

    public void setPhaseIIMessageList(List<PhaseIIMessage> phaseIIMessageList) {
        this.phaseIIMessageList = phaseIIMessageList;
    }

    public ImpressionMessage getImpressionMessage() {
        return impressionMessage;
    }

    public void setImpressionMessage(ImpressionMessage impressionMessage) {
        this.impressionMessage = impressionMessage;
    }

    public List<TransitMessage> getTransitMessageList() {
        return transitMessageList;
    }

    public void setTransitMessageList(List<TransitMessage> transitMessageList) {
        this.transitMessageList = transitMessageList;
    }

    public List<CrownMessage> getCrownMessageList() {
        return crownMessageList;
    }

    public void setCrownMessageList(List<CrownMessage> crownMessageList) {
        this.crownMessageList = crownMessageList;
    }

    public List<SubsequentMessage> getSubsequentMessageList() {
        return subsequentMessageList;
    }

    public void setSubsequentMessageList(List<SubsequentMessage> subsequentMessageList) {
        this.subsequentMessageList = subsequentMessageList;
    }




    public List<Zhongzhi> getZhongzhiList() {
        return zhongzhiList;
    }

    public void setZhongzhiList(List<Zhongzhi> zhongzhiList) {
        this.zhongzhiList = zhongzhiList;
    }

    public List<Zhigu> getZhiguList() {
        return zhiguList;
    }

    public void setZhiguList(List<Zhigu> zhiguList) {
        this.zhiguList = zhiguList;
    }

    public List<Ruanzuzhi> getRuanzuzhiList() {
        return ruanzuzhiList;
    }

    public void setRuanzuzhiList(List<Ruanzuzhi> ruanzuzhiList) {
        this.ruanzuzhiList = ruanzuzhiList;
    }

    public List<Chongxi> getChongxiList() {
        return chongxiList;
    }

    public void setChongxiList(List<Chongxi> chongxiList) {
        this.chongxiList = chongxiList;
    }

    public List<Chaixian> getChaixianList() {
        return chaixianList;
    }

    public void setChaixianList(List<Chaixian> chaixianList) {
        this.chaixianList = chaixianList;
    }
}
