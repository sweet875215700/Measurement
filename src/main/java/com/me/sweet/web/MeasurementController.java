package com.me.sweet.web;

import com.me.sweet.Response.CharacterResponse;
import com.me.sweet.domain.Measurement;
import com.me.sweet.domain.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weisw.shi on 2017/7/16.
 */

@RestController
public class MeasurementController {


    private static Integer scoreA[] = {2,6,9,14,17,21,27,31,36,38,42,48,50,54,58};

    private static Integer scoreB[] = {4,8,11,16,19,23,25,29,34,40,44,46,52,56,60};

    private static Integer scoreC[] = {1,7,10,13,18,22,26,30,33,39,43,45,49,55,57};

    private static Integer scoreD[] = {3,5,12,15,20,24,28,32,35,37,41,47,51,53,59};


    @RequestMapping("/measurement")
    @ResponseBody
    public CharacterResponse measurement(@RequestBody Measurement measurement){

        if(measurement == null ){
            return CharacterResponse.fail(500,"参数为空");
        }

        if(measurement.getAnswers().size() != 60){
            return CharacterResponse.fail(401,"题目还未做完");
        }

        Integer sA = 0;
        Integer sB = 0;
        Integer sC = 0;
        Integer sD = 0;

        for (Integer index:scoreA) {
            sA += measurement.getAnswers().get(index-1).getSelectScore();
        }

        for (Integer index:scoreB) {
            sB += measurement.getAnswers().get(index-1).getSelectScore();
        }

        for (Integer index:scoreC) {
            sC += measurement.getAnswers().get(index-1).getSelectScore();
        }

        for (Integer index:scoreD) {
            sD += measurement.getAnswers().get(index-1).getSelectScore();
        }

        return CharacterResponse.success(sA,sB,sC,sD,measurement.getName());
    }
}
