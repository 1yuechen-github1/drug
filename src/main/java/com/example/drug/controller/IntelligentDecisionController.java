package com.example.drug.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.drug.common.ResultMapUtil;
import com.example.drug.entity.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

@Controller
@Slf4j
@RequestMapping("/intelligentDecision")
public class IntelligentDecisionController {

    @RequestMapping("/upperAnteriorTeeth")
    public String upperAnteriorTeeth() {
        return "/intelligentDecision/upperAnteriorTeeth";
    }

    @RequestMapping("/upperPosteriorTeeth")
    public String upperPosteriorTeeth() {
        return "/intelligentDecision/upperPosteriorTeeth";
    }

    @RequestMapping("/processingCBCT/3DTo2D")
    public String _3DTo2D() {
        return "/intelligentDecision/processingCBCT/3DTo2D";
    }

    @RequestMapping("/uploadCBCTScreenshots")
    public String uploadCBCTScreenshots() {
        return "/intelligentDecision/uploadCBCTScreenshots";
    }

//    @RequestMapping("/upperAnteriorTeethList")
//    @ResponseBody
//    public Object upperAnteriorTeethList(@RequestParam(value = "patientName", required = false) String patientName,
//                                   @RequestParam(value = "fileName", required = false) String fileName) {
//        try {
//            HashMap<String,Object> resultMap = new HashMap<>();
//            resultMap.put("code",0);
//            resultMap.put("msg","");
//            resultMap.put("count",object.getTotal());
//            resultMap.put("data",object.getRecords());
//            return resultMap
//        } catch (Exception e) {
//            return ResultMapUtil.getHashMapException(e);
//        }
//    }


}
