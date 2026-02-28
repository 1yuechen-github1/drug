package com.example.drug.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.drug.common.ResultMapUtil;
import com.example.drug.dto.HandoverRecordDto;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.dto.MergeRecordDto;
import com.example.drug.entity.*;
import com.example.drug.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.drug.common.ResultMapUtil.getHashMapDel;
import static com.example.drug.common.ResultMapUtil.getHashMapListResult;

/**
 * 患者管理相关controller
 */

@Slf4j
@Controller
@RequestMapping(value = "/patientManagement")
public class PatientManagementController {
    @Autowired
    private HandoverRecordService handoverRecordService;

    @Autowired
    private IPatientService patientService;

    @Autowired
    private IMedicalRecordService medicalRecordService;

    @Autowired
    private IFirstmedicalService firstmedicalService;

    @Autowired
    private IPlanService planService;

    @Autowired
    private IPhase_iService  phase_iService;

    @Autowired
    private IPhase_iiService phase_iiService;

    @Autowired
    private IImpressionService impressionService;

    @Autowired
    private ITransitService transitService;

   @Autowired
   private ICrownService crownService;

    @Autowired
    private ISubsquentService subsquentService;

   @Autowired
   private IAppointmentService appointmentService;

   @Autowired
   private IMedicalrecordDtoService medicalrecordDtoService;

   @Autowired
   private IMergerecordDtoService mergerecordDtoService;

   @Autowired
   private IIndexService indexService;


    /**
     * 转向测试页面
     */
    @RequestMapping("/test")
    public String test() {
        return "/test";
    }

   /**
    * 转向患者管理首页
    */
    @GetMapping
    public String index() {
        return "/patientManagement/patientList";
    }

    /**
     * 转向患者建档页面
     */
    @RequestMapping("/patientArchiving")
    public String patientArchiving() {
        return "/patientManagement/patientArchiving";
    }

    /**
     * 转向患者列表页面
     */
    @RequestMapping("/patientList")
    public String patientList() {
        return "/patientList";
    }


    /**
     * 转向患者编辑页面
     */
    @RequestMapping("/patientEditByMedicalrecordId")
    public String patientEditByMedicalrecordId(@RequestParam(name = "medicalrecordid", required = true) Integer medicalrecordid, Model model) {
        MedicalRecord medicalRecord = medicalRecordService.queryMedicalRecordById(medicalrecordid);
        model.addAttribute("obj", medicalRecord);
        return "/patientManagement/patientEditNew";
    }

    /**
     * 转向患者编辑页面
     */
    @RequestMapping("/patientEditByPatientId")
    public String patientEditByPatientId(@RequestParam(name = "patientId", required = true) Integer patientId, Model model) {
        model.addAttribute("patientId", patientId);
        return "/patientManagement/patientEditNew";
    }

    /**
     * 转向合并就诊记录页面
     */
    @RequestMapping("/patientRecordMerge")
    public String patientRecordMerge(@RequestParam(name = "patientId", required = true) Integer patientId, Model model) {
        model.addAttribute("patientId", patientId);
        return "/patientManagement/patientRecordMerge";
    }

    /**
     * 转向合并就诊记录测试页面
     */
    @RequestMapping("/patientRecordMergeTest")
    public String patientRecordMergeTest() {
        return "/patientManagement/patientRecordMergeTest";
    }

    /**
     * 转向患者就诊记录页面
     */
    @RequestMapping("/medicalRecord")
    public String medicalRecord(@RequestParam(name = "id", required = true) Integer id, Model model) {
        List<MedicalRecord> medicalRecordList = medicalRecordService.queryMedicalRecordByPatientid(id);
        model.addAttribute("obj", medicalRecordList.get(0));
        return "/patientManagement/medicalRecord";
    }

    /**
     * 转向患者基本信息编辑页面
     */
    @RequestMapping("/patientEdit/basicInf")
    public String patientEditBasicInfById(@RequestParam(name = "patientId", required = true) Integer patientId, Model model) {
        //通过patientId查询患者对象
        Patient patient = patientService.queryPatientById(patientId);
        model.addAttribute("patientBasicInf", patient);
        return "/patientManagement/patientEdit/basicInf";
    }



    /**
     * 转向患者筛选页面
     */
    @RequestMapping("/patientFilter")
    public String patientFilter() {
        return "/patientFilter";
    }

    /**
     * 转向患者就诊记录合并页面
     */
/*    @RequestMapping("/patientRecordMerge")
    public String patientRecordMerge() {
        return "/patientManagement/patientRecordMerge";
    }*/

    /**
     * 分页查询患者列表
     */
    @RequestMapping(value = "/patientQueryPage")
    @ResponseBody
    public Object patientQueryPage(@RequestParam(value = "patientname", required = false) String patientname,
                                   @RequestParam(value = "idcard", required = false) String idcard,
                                   @RequestParam(value = "birthday", required = false) String birthday,
                                   @RequestParam(value = "hospitalcode", required = false) String hospitalcode,
                                   @RequestParam(value = "page", defaultValue = "1") int pageNum,
                                   @RequestParam(value = "limit", defaultValue = "18") int pageSize) {
        try {
            IPage<Patient> iPage = patientService.selectPatientPage(pageNum, pageSize, patientname, idcard,birthday,hospitalcode);
            return ResultMapUtil.getHashMapMysqlPage(iPage);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 查询预约患者列表
     */
    @RequestMapping(value = "/patientAppointmentQueryList")
    @ResponseBody
    public Object patientAppointmentQueryPage(@RequestParam(value = "appointmentdate", required = false) String appointmentdate) {
        try {
            List<Appointment> list = appointmentService.selectPatientAppointmentList(appointmentdate);
            return ResultMapUtil.getHashMapListResult(list);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }
    /**
     * 添加一个患者档案
     */
    @RequestMapping(value = "/patientAdd")
    @ResponseBody
    @Transactional
    public Object patientAdd(Patient patient) {

        /**
         * 添加患者表信息
         * 获取患者表id并添加就诊记录表信息
         * 获取就诊记录表id并添加其他相关表信息
         */

        try {

            MedicalRecord newMedicalRecord = new MedicalRecord();
            Firstmedical firstmedical = new Firstmedical();
            Plan plan = new Plan();
            Phase_i phase_i = new Phase_i();
            Phase_ii phase_ii = new Phase_ii();
            Impression impression = new Impression();
            Transit transit = new Transit();
            Crown crown = new Crown();
            Subsequent subsequent = new Subsequent();
            Index index = new Index();




            //添加患者表信息
            int patientI = patientService.addPatient(patient);

            //获取患者的身份证号
            String idcard = patient.getIdcard();

            //根据身份证查询id的值
            Patient patient1 = patientService.queryPatientByIdcard(idcard);
            int patient1id=patient1.getId();

            //将患者表id添加到就诊记录表对象
            newMedicalRecord.setPatientname(patient1.getPatientname());
            newMedicalRecord.setPatientid(patient1id);

            //添加就诊记录表信息
            int medicalRecordI=medicalRecordService.addMedicalRecord(newMedicalRecord);

            //通过患者id查询就诊记录表id
            List<MedicalRecord> medicalRecordList =medicalRecordService.queryMedicalRecordByPatientid(patient1id);
            int medicalRecordid = medicalRecordList.get(0).getId();


            //将就诊记录表id添加到相关表对象
            firstmedical.setMedicalrecordid(medicalRecordid);
            plan.setMedicalRecordId(medicalRecordid);
            phase_i.setMedicalRecordId(medicalRecordid);
            phase_ii.setMedicalRecordId(medicalRecordid);
            impression.setMedicalRecordId(medicalRecordid);
            transit.setMedicalRecordId(medicalRecordid);
            crown.setMedicalrecordid(medicalRecordid);
            subsequent.setMedicalRecordId(medicalRecordid);
            index.setPatientid(patient1id);


            //添加其他相关表信息
            int firstmedicalI = firstmedicalService.addFirstmedical(firstmedical);
            int planI=planService.addPlan(plan);
            int phase_iI=phase_iService.addPhase_i(phase_i);
            int phase_iiI=phase_iiService.addPhase_ii(phase_ii);
            int impressionI=impressionService.addImpression(impression);
            int transitI=transitService.addTransit(transit);
            int crownI=crownService.addCrown(crown);
            int subsquentI=subsquentService.addSubsquent(subsequent);
            int indexI=indexService.addIndex(index);

            //通过患者记录表id找到其他数据表的id
            int firstmedicalid = firstmedicalService.queryFirstmedicalByMedicalrecordid(medicalRecordid).getId();
            int planid = planService.queryPlanByMedicalrecordid(medicalRecordid).getId();
            int phase_iid = phase_iService.queryPhase_iByMedicalrecordid(medicalRecordid).getId();
            int phase_iiid=phase_iiService.queryPhase_iiByMedicalrecordid(medicalRecordid).getId();
            int impressionid=impressionService.queryImpressionByMedicalrecordid(medicalRecordid).getId();
            int transitid=transitService.queryTransitByMedicalrecordid(medicalRecordid).getId();
            int crownid= crownService.queryCrownByMedicalrecordid(medicalRecordid).getId();
            int subsquentid=subsquentService.querySubsequentByMedicalrecordid(medicalRecordid).getId();

            //将其他数据表的id添加到患者记录表
            newMedicalRecord.setId(medicalRecordid);
            newMedicalRecord.setFirstmedicalid(firstmedicalid);
            newMedicalRecord.setPlanid(planid);
            newMedicalRecord.setPhaseIid(phase_iid);
            newMedicalRecord.setPhaseIIid(phase_iiid);
            newMedicalRecord.setImpressionid(impressionid);
            newMedicalRecord.setTransitid(transitid);
            newMedicalRecord.setCrownid(crownid);
            newMedicalRecord.setSubsequentid(subsquentid);

            int mrid = medicalRecordService.editMedicelRecord(newMedicalRecord);


            if(medicalRecordI!=0 && patientI!=0&& firstmedicalI!=0&& planI!=0&& phase_iI!=0&& phase_iiI!=0&& impressionI!=0&& transitI!=0&& crownI!=0&& subsquentI!=0&&indexI!=0&& mrid!=0){
                return ResultMapUtil.getHashMapSave(1);
            }
            return ResultMapUtil.getHashMapSave(0);

        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 修改患者档案
     */
    @RequestMapping(value = "/patientEditBasic")
    @ResponseBody
    public Object patientEdit(Patient patient) {
        try {
            int i = patientService.editPatient(patient);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }



    /**
     * 通过患者id查询患者就诊记录
     * 患者id
     * Patient ID
     *  @PathVariable("id")String id,
     *
     * @return
     */
    @RequestMapping("/queryMedicalRecordDtoByPatientId")
    @ResponseBody
    public Object queryMedicalRecordByPatientId(@RequestParam(value = "id", required = true) int id) {
        List<MedicalRecordDto> dtoList = medicalrecordDtoService.selectMedicalRecordDtoPage(id);
        HashMap<String, Object> resultMap = getHashMapListResult(dtoList);
        return resultMap;
    }




    /**
     * 转向初诊页面
     * @return
     */
    @RequestMapping("/patientEdit/firstMedical")
    public String firstMedical(@RequestParam(value = "patientId", required = true) Integer patientId,
                               @RequestParam(value = "recordDate", required = false) String recordDate,
                               Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/firstmedical";
    }


    /**
     *初诊提交
     */
    @RequestMapping("/patientFirstmedicalEdit")
    @ResponseBody
    public Object patientFirstmedicalEdit(Firstmedical firstmedical) {
        log.info("{}",firstmedical);
        try {
            int i = firstmedicalService.editFirstmedical(firstmedical);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向谈方案页面
     * @return
     */
    @RequestMapping("/patientEdit/plan")
    public String plan(@RequestParam(value = "patientId", required = true) Integer patientId,
                       @RequestParam(value = "recordDate", required = false) String recordDate,
                       Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/plan";
    }

    /**
     * 编辑谈方案
     */
    @RequestMapping("/patientPlanEdit")
    @ResponseBody
    public Object patientPlanEdit(Plan plan) {
        log.info("{}",plan);
        try {
            int i = planService.editPlan(plan);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }


    /**
     * 转向种植一期
     */
    @RequestMapping("/patientEdit/phaseI")
    public String phaseI(@RequestParam(value = "patientId", required = true) Integer patientId,
                         @RequestParam(value = "recordDate", required = false) String recordDate,
                         Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/phaseI";
    }

    /**
     * 编辑种植一期
     */
    @RequestMapping("/patientPhaseIEdit")
    @ResponseBody
    public Object patientPhaseIEdit(Phase_i phaseI) {
        log.info("{}",phaseI);
        try {
            int i = phase_iService.editPhase_i(phaseI);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 编辑种植二期
     */
    @RequestMapping("/patientPhaseIIEdit")
    @ResponseBody
    public Object patientPhaseIIEdit(Phase_ii phaseII) {
        log.info("{}",phaseII);
        try {
            int i = phase_iiService.editPhase_ii(phaseII);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向种植二期
     */
    @RequestMapping("/patientEdit/phaseII")
    public String phaseII(@RequestParam(value = "patientId", required = true) Integer patientId,
                          @RequestParam(value = "recordDate", required = false) String recordDate,
                          Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/phaseII";
    }

    /**
     * 转向取模
     */
    @RequestMapping("/patientEdit/impression")
    public String impression(@RequestParam(value = "patientId", required = true) Integer patientId,
                             @RequestParam(value = "recordDate", required = false) String recordDate,
                             Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/impression";
    }

    /**
     * 编辑取模
     */
    @RequestMapping("/patientImpressionEdit")
    @ResponseBody
    public Object patientImpressionEdit(Impression impression) {
        log.info("{}",impression);
        try {
            int i = impressionService.editImpression(impression);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }


    /**
     * 转向过渡义齿
     *
     */
    @RequestMapping("/patientEdit/transit")
    public String transit(@RequestParam(value = "patientId", required = true) Integer patientId,
                          @RequestParam(value = "recordDate", required = false) String recordDate,
                          Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/transit";
    }

    /**
     *编辑过渡义齿
     */
    @RequestMapping("/patientTransitEdit")
    @ResponseBody
    public Object patientTransitEdit(Transit transit){
        log.info("{}",transit);
        try {
            int i = transitService.editTransit(transit);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }




    /**
     * 转向戴牙
     *
     */
    @RequestMapping("/patientEdit/crown")
    public String crown(@RequestParam(value = "patientId", required = true) Integer patientId,
                        @RequestParam(value = "recordDate", required = false) String recordDate,
                        Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/crown";
    }

    /**
     *编辑戴牙
     */
    @RequestMapping("/patientCrownEdit")
    @ResponseBody
    public Object patientCrownEdit(Crown crown){
        log.info("{}",crown);
        try {
            int i = crownService.editCrown(crown);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向戴牙后复诊
     *
     */
    @RequestMapping("/patientEdit/subsequent")
    public String subsequent(@RequestParam(value = "patientId", required = true) Integer patientId,
                             @RequestParam(value = "recordDate", required = false) String recordDate,
                             Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/subsequent";
    }

    /**
     * 转向其他
     *
     */
    @RequestMapping("/patientEdit/other")
    public String other(@RequestParam(value = "patientId", required = true) Integer patientId,
                        @RequestParam(value = "recordDate", required = false) String recordDate,
                        Model model){
        model.addAttribute("patientId", patientId);
        if (recordDate != null) {
            model.addAttribute("recordDate", recordDate);
            log.info(recordDate);
        }
        return "/patientManagement/patientEdit/other";
    }

    /**
     *编辑戴牙后复诊
     */
    @RequestMapping("/patientSubsequentEdit")
    @ResponseBody
    public Object patientSubsequentEdit(Subsequent subsequent){
        log.info("{}",subsequent);
        try {
            int i = subsquentService.editSubsequent(subsequent);
            return ResultMapUtil.getHashMapSave(i);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向软硬组织库页面
     * @return
     */
    @RequestMapping("/patientEdit/patientindex")
    public String patientindex(@RequestParam(value = "patientId", required = true) Integer patientId,Model model){
        //通过patientid查询patientindex对象
        Index patientindex = indexService.queryIndexByPatientid(patientId);

        log.info("{}",patientindex);
        model.addAttribute("patientindex",patientindex);
        return "/patientManagement/patientEdit/patientindex";
    }

    /**
     * 转向编辑测试页面
     * @return
     */
    @RequestMapping("/patientEdit/editTest")
    public String editTest(){
        return "/patientManagement/patientEdit/editTest";
    }


    /**
     * 添加一条患者就诊记录
     */
    @RequestMapping(value = "/patientMedicalrecordAdd")
    @ResponseBody
    public Object patientMedicalrecordAdd(@RequestParam Integer patientid) {

        /**
         * 添加患者就诊记录表信息
         * 获取患者表id并添加就诊记录表信息
         * 获取就诊记录表id并添加其他相关表信息
         */

        try {

            Patient patient = patientService.queryPatientById(patientid);
            MedicalRecord newMedicalRecord = new MedicalRecord();
            Firstmedical firstmedical = new Firstmedical();
            Plan plan = new Plan();
            Phase_i phase_i = new Phase_i();
            Phase_ii phase_ii = new Phase_ii();
            Impression impression = new Impression();
            Transit transit = new Transit();
            Crown crown = new Crown();
            Subsequent subsequent = new Subsequent();

            int patient1id=patientid;

            //将患者表id添加到就诊记录表对象
            newMedicalRecord.setPatientname(patient.getPatientname());
            newMedicalRecord.setPatientid(patient1id);

            //添加就诊记录表信息
            int medicalRecordI=medicalRecordService.addMedicalRecord(newMedicalRecord);

            //通过患者id查询就诊记录表id
            List<MedicalRecord> medicalRecordList =medicalRecordService.queryMedicalRecordByPatientid(patient1id);
            int size = medicalRecordList.size();
            int medicalRecordid = medicalRecordList.get(size-1).getId();


            //将就诊记录表id添加到相关表对象
            firstmedical.setMedicalrecordid(medicalRecordid);
            plan.setMedicalRecordId(medicalRecordid);
            phase_i.setMedicalRecordId(medicalRecordid);
            phase_ii.setMedicalRecordId(medicalRecordid);
            impression.setMedicalRecordId(medicalRecordid);
            transit.setMedicalRecordId(medicalRecordid);
            crown.setMedicalrecordid(medicalRecordid);
            subsequent.setMedicalRecordId(medicalRecordid);

            //添加其他相关表信息
            int firstmedicalI = firstmedicalService.addFirstmedical(firstmedical);
            int planI=planService.addPlan(plan);
            int phase_iI=phase_iService.addPhase_i(phase_i);
            int phase_iiI=phase_iiService.addPhase_ii(phase_ii);
            int impressionI=impressionService.addImpression(impression);
            int transitI=transitService.addTransit(transit);
            int crownI=crownService.addCrown(crown);
            int subsquentI=subsquentService.addSubsquent(subsequent);

            //通过患者记录表id找到其他数据表的id
            int firstmedicalid = firstmedicalService.queryFirstmedicalByMedicalrecordid(medicalRecordid).getId();
            int planid = planService.queryPlanByMedicalrecordid(medicalRecordid).getId();
            int phase_iid = phase_iService.queryPhase_iByMedicalrecordid(medicalRecordid).getId();
            int phase_iiid=phase_iiService.queryPhase_iiByMedicalrecordid(medicalRecordid).getId();
            int impressionid=impressionService.queryImpressionByMedicalrecordid(medicalRecordid).getId();
            int transitid=transitService.queryTransitByMedicalrecordid(medicalRecordid).getId();
            int crownid= crownService.queryCrownByMedicalrecordid(medicalRecordid).getId();
            int subsquentid=subsquentService.querySubsequentByMedicalrecordid(medicalRecordid).getId();

            //将其他数据表的id添加到患者记录表
            newMedicalRecord.setId(medicalRecordid);
            newMedicalRecord.setFirstmedicalid(firstmedicalid);
            newMedicalRecord.setPlanid(planid);
            newMedicalRecord.setPhaseIid(phase_iid);
            newMedicalRecord.setPhaseIIid(phase_iiid);
            newMedicalRecord.setImpressionid(impressionid);
            newMedicalRecord.setTransitid(transitid);
            newMedicalRecord.setCrownid(crownid);
            newMedicalRecord.setSubsequentid(subsquentid);

            int mrid = medicalRecordService.editMedicelRecord(newMedicalRecord);


            if(medicalRecordI!=0 && firstmedicalI!=0&& planI!=0&& phase_iI!=0&& phase_iiI!=0&& impressionI!=0&& transitI!=0&& crownI!=0&& subsquentI!=0&& mrid!=0){
                return ResultMapUtil.getHashMapSave(1);
            }
            return ResultMapUtil.getHashMapSave(0);

        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向患者预约页面
     */
    @RequestMapping("/patientAppointment")
    public String patientAppointment() {
        return "/patientManagement/patientAppointmentNew";
    }

    /**
     * 新增预约信息
     */
    @RequestMapping(value = "/addAppointment")
    @ResponseBody
    public Object addAppointment(    @RequestParam("date") String selectedDate,
                                     @RequestParam("idCard") String selectedIdCard,
                                     @RequestParam("timeSlot") String selectedTimeSlot,
                                     @RequestParam("label") String appointmentLabel,
                                     @RequestParam("note") String appointmentNote){
        try {
            Appointment appointment = new Appointment();
            appointment.setAppointmentdate(selectedDate);
            appointment.setAppointmenttime(selectedTimeSlot);
            appointment.setAppointmentlabel(appointmentLabel);
            appointment.setAppointmentnote(appointmentNote);
            Patient patient = patientService.queryPatientByIdcard(selectedIdCard);
            appointment.setBirthday(patient.getBirthday());
            appointment.setPatientname(patient.getPatientname());
            appointment.setSex(patient.getSex());
            appointment.setPatientdoctor(patient.getPatientdoctor());
            appointment.setHospitalcode(patient.getHospitalcode());

            int i = appointmentService.addAppointment(appointment);

            if(i!=0){
                return ResultMapUtil.getHashMapSave(1);
            }
            return ResultMapUtil.getHashMapSave(0);

        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }

    }

    /**
     * 修改患者病历号
     */
    @RequestMapping(value = "/patientEdithospitalcode")
    @ResponseBody
    public void patientEdithospitalcode(
            @RequestParam("value") String value,
            @RequestParam("id") int id) {
        patientService.updateHospitalcodeById(id,value);

    }

    /**
     * 修改患者预约备注
     */
    @RequestMapping(value = "/patientEditAppointment")
    @ResponseBody
    public void patientEditAppointment(
                                        @RequestParam("value") String value,
                                        @RequestParam("id") int id) {
        appointmentService.editAppointment(id,value);

    }

    @GetMapping("/medicalrecordDelById")
    @ResponseBody
    public Object medicalrecordDelById(@RequestParam("id") int id){
        try {
            //
            int i = 0;


            // 返回一个成功的响应
            return getHashMapDel(i);
        }catch (Exception e){
            return ResultMapUtil.getHashMapException(e);
        }
    }

//    @PostMapping("/phaseI/handoverRecordEdit")
//    @ResponseBody
//    public Object phaseIHandoverRecordEdit(@RequestParam("handoverRecord") HandoverRecord handoverRecord,
//                                           @RequestParam("zhongzhiList[]") List<Zhongzhi> zhongzhiList,
//                                           @RequestParam("zhiguList[]") List<Zhigu> zhiguList,
//                                           @RequestParam("ruanzhuzhiList[]") List<Ruanzhuzhi> ruanzhuzhiList,
//                                           @RequestParam("chongxiList[]") List<Chongxi> chongxiList,
//                                           @RequestParam("chaixianList[]") List<Chaixian> chaixianList
//                                           ) {
//
//        System.out.println(handoverRecord);
//        return ResultMapUtil.getHashMapSave(1);
//    }

    /**
     * 保存交班记录表
     * @param handoverRecordDto
     * @return
     */
    // TODO: 改成处理各个阶段的，就不用分这么多接口了
    @PostMapping("/handoverRecordEdit")
    @ResponseBody
    public Object saveHandoverRecord(@RequestBody HandoverRecordDto handoverRecordDto) {
        try {
            handoverRecordService.saveHandoverRecordDto(handoverRecordDto);
            return ResultMapUtil.getHashMapSave(1);
        }catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    @GetMapping("/handoverRecord")
    @ResponseBody
    // TODO: 做统一异常处理，避免每个函数里面都try-catch
    public Object getHandoverRecordDto(@RequestParam Integer patientId, @RequestParam String stage) {
        try {
            List<HandoverRecordDto> recordDtos = handoverRecordService.getHandoverRecordDto(patientId,stage);
            return ResultMapUtil.getHashMapListResult(recordDtos);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    @GetMapping("/allHandoverRecord")
    @ResponseBody
    public Object getHandoverRecord (@RequestParam Integer patientId) {
        try {
            List<HandoverRecord> records = handoverRecordService.getHandoverRecord(patientId);
            return ResultMapUtil.getHashMapListResult(records);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }
}