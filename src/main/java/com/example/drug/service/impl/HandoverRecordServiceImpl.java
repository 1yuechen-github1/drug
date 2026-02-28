package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.dto.HandoverRecordDto;
import com.example.drug.entity.*;
import com.example.drug.mapper.*;
import com.example.drug.service.*;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HandoverRecordServiceImpl extends ServiceImpl<HandoverRecordMapper, HandoverRecord> implements HandoverRecordService {

    @Autowired
    private ZhongzhiService zhongzhiService;

    @Autowired
    private ZhiguService zhiguService;

    @Autowired
    private RuanzuzhiService ruanzuzhiService;

    @Autowired
    private ChongxiService chongxiService;

    @Autowired
    private ChaixianService chaixianService;

    @Autowired
    private FirstMedicalMessageService firstMedicalMessageService;

    @Autowired
    private PlanMessageService planMessageService;

    @Autowired
    private PhaseIIMessageService phaseIIMessageService;

    @Autowired
    private ImpressionMessageService impressionMessageService;

    @Autowired
    private TransitMessageService transitMessageService;

    @Autowired
    private CrownMessageService crownMessageService;

    @Autowired
    private SubsequentMessageService subsequentMessageService;

    @Override
    @Transactional
    public void saveHandoverRecordDto(HandoverRecordDto handoverRecordDto){
        this.save(handoverRecordDto);

        Integer handoverRecordId = handoverRecordDto.getId();
        if (handoverRecordDto.getZhongzhiList() != null) {
            for (Zhongzhi zhongzhi : handoverRecordDto.getZhongzhiList()) {
                zhongzhi.setHandoverRecordId(handoverRecordId);
            }
            zhongzhiService.saveBatch(handoverRecordDto.getZhongzhiList());
        }
        if (handoverRecordDto.getZhiguList() != null) {
            for (Zhigu zhigu : handoverRecordDto.getZhiguList()) {
                zhigu.setHandoverRecordId(handoverRecordId);
            }
            zhiguService.saveBatch(handoverRecordDto.getZhiguList());
        }

        if (handoverRecordDto.getRuanzuzhiList() != null) {
            for (Ruanzuzhi ruanzuzhi : handoverRecordDto.getRuanzuzhiList()) {
                ruanzuzhi.setHandoverRecordId(handoverRecordId);
            }
            ruanzuzhiService.saveBatch(handoverRecordDto.getRuanzuzhiList());
        }

        if (handoverRecordDto.getChongxiList() != null) {
            for (Chongxi chongxi : handoverRecordDto.getChongxiList()) {
                chongxi.setHandoverRecordId(handoverRecordId);
            }
            chongxiService.saveBatch(handoverRecordDto.getChongxiList());
        }

        if (handoverRecordDto.getChaixianList() != null) {
            for (Chaixian chaixian : handoverRecordDto.getChaixianList()) {
                chaixian.setHandoverRecordId(handoverRecordId);
            }
            chaixianService.saveBatch(handoverRecordDto.getChaixianList());
        }

        FirstMedicalMessage firstMedicalMessage = handoverRecordDto.getFirstMedicalMessage();
        if (firstMedicalMessage != null) {
            firstMedicalMessage.setHandoverRecordId(handoverRecordId);
            firstMedicalMessageService.save(firstMedicalMessage);
        }

        PlanMessage planMessage = handoverRecordDto.getPlanMessage();
        if (planMessage != null) {
            planMessage.setHandoverRecordId(handoverRecordId);
            planMessageService.save(planMessage);
        }

        List<PhaseIIMessage> phaseIIMessageList = handoverRecordDto.getPhaseIIMessageList();
        if (phaseIIMessageList != null) {
            for(PhaseIIMessage phaseIIMessage : phaseIIMessageList) {
                phaseIIMessage.setHandoverRecordId(handoverRecordId);
            }
            phaseIIMessageService.saveBatch(phaseIIMessageList);
        }

        ImpressionMessage impressionMessage = handoverRecordDto.getImpressionMessage();
        if (impressionMessage != null) {
            impressionMessage.setHandoverRecordId(handoverRecordId);
            impressionMessageService.save(impressionMessage);
        }

        List<TransitMessage> transitMessageList = handoverRecordDto.getTransitMessageList();
        if (transitMessageList != null) {
            for (TransitMessage transitMessage : transitMessageList) {
                transitMessage.setHandoverRecordId(handoverRecordId);
            }
            transitMessageService.saveBatch(transitMessageList);
        }
        List<CrownMessage> crownMessageList = handoverRecordDto.getCrownMessageList();
        if (crownMessageList != null) {
            for (CrownMessage crownMessage : crownMessageList) {
                crownMessage.setHandoverRecordId(handoverRecordId);
            }
            crownMessageService.saveBatch(crownMessageList);
        }
        List<SubsequentMessage> subsequentMessageList = handoverRecordDto.getSubsequentMessageList();
        if (subsequentMessageList != null) {
            for (SubsequentMessage subsequentMessage : subsequentMessageList) {
                subsequentMessage.setHandoverRecordId(handoverRecordId);
            }
            subsequentMessageService.saveBatch(subsequentMessageList);
        }



    }

    @Override
    @Transactional
    public List<HandoverRecordDto> getHandoverRecordDto(Integer patientId, String stage){

        // 查询对应患者的交班记录
        LambdaQueryWrapper<HandoverRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(HandoverRecord::getPatientId, patientId);
        queryWrapper.eq(HandoverRecord::getStage, stage);
        List<HandoverRecord> records = this.list(queryWrapper);

        List<HandoverRecordDto> recordDtos = records.stream().map((item) -> {
            HandoverRecordDto recordDto = new HandoverRecordDto();
            BeanUtils.copyProperties(item, recordDto);
            // 加上二级表内容
            Integer recordId = item.getId();
            if (stage.equals("phaseI")) {
                LambdaQueryWrapper<Zhongzhi> wrapper1 = new LambdaQueryWrapper<>();
                wrapper1.eq(Zhongzhi::getHandoverRecordId, recordId);
                recordDto.setZhongzhiList(zhongzhiService.list(wrapper1));
                LambdaQueryWrapper<Zhigu> wrapper2 = new LambdaQueryWrapper<>();
                wrapper2.eq(Zhigu::getHandoverRecordId, recordId);
                recordDto.setZhiguList(zhiguService.list(wrapper2));
                LambdaQueryWrapper<Ruanzuzhi> wrapper3 = new LambdaQueryWrapper<>();
                wrapper3.eq(Ruanzuzhi::getHandoverRecordId, recordId);
                recordDto.setRuanzuzhiList(ruanzuzhiService.list(wrapper3));
                LambdaQueryWrapper<Chongxi> wrapper4 = new LambdaQueryWrapper<>();
                wrapper4.eq(Chongxi::getHandoverRecordId, recordId);
                recordDto.setChongxiList(chongxiService.list(wrapper4));
                LambdaQueryWrapper<Chaixian> wrapper5 = new LambdaQueryWrapper<>();
                wrapper5.eq(Chaixian::getHandoverRecordId, recordId);
                recordDto.setChaixianList(chaixianService.list(wrapper5));
            } else if (stage.equals("firstMedical")){
                LambdaQueryWrapper<FirstMedicalMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(FirstMedicalMessage::getHandoverRecordId, recordId);
                recordDto.setFirstMedicalMessage(firstMedicalMessageService.getOne(wrapper));
            } else if (stage.equals("plan")) {
                LambdaQueryWrapper<PlanMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(PlanMessage::getHandoverRecordId, recordId);
                recordDto.setPlanMessage(planMessageService.getOne(wrapper));
            } else if (stage.equals("impression")) {
                LambdaQueryWrapper<ImpressionMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(ImpressionMessage::getHandoverRecordId, recordId);
                recordDto.setImpressionMessage(impressionMessageService.getOne(wrapper));
            } else if (stage.equals("phaseII")) {
                LambdaQueryWrapper<PhaseIIMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(PhaseIIMessage::getHandoverRecordId, recordId);
                recordDto.setPhaseIIMessageList(phaseIIMessageService.list(wrapper));
            }else if (stage.equals("transit")) {
                LambdaQueryWrapper<TransitMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(TransitMessage::getHandoverRecordId, recordId);
                recordDto.setTransitMessageList(transitMessageService.list(wrapper));
            }else if (stage.equals("crown")) {
                LambdaQueryWrapper<CrownMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(CrownMessage::getHandoverRecordId, recordId);
                recordDto.setCrownMessageList(crownMessageService.list(wrapper));
            }else if (stage.equals("subsequent")) {
                LambdaQueryWrapper<SubsequentMessage> wrapper = new LambdaQueryWrapper<>();
                wrapper.eq(SubsequentMessage::getHandoverRecordId, recordId);
                recordDto.setSubsequentMessageList(subsequentMessageService.list(wrapper));
            }
            else {
                if (!stage.equals("other")){
                    throw new IllegalArgumentException(stage + "不是合法的阶段");
                }
            }
            return recordDto;
        }).collect(Collectors.toList());





        return recordDtos;
    }

    public List<HandoverRecord> getHandoverRecord(Integer patientId){
        LambdaQueryWrapper<HandoverRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(HandoverRecord::getPatientId, patientId);
        queryWrapper.orderByAsc(HandoverRecord::getRecordDate);
        return this.list(queryWrapper);
    }

}
