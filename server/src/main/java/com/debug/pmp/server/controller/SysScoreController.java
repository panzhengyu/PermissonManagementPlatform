package com.debug.pmp.server.controller;

import com.debug.pmp.common.response.BaseResponse;
import com.debug.pmp.common.response.StatusCode;
import com.debug.pmp.server.annotation.LogAnnotation;
import com.debug.pmp.server.service.SysScoreService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * @author zhouyulei
 * @version v1.0.0
 * @ClassName: SysScoreController
 * @date 2019/9/4 16:25
 * @Description: SysScoreController
 */
@RestController
@RequestMapping("/sys/score")
public class SysScoreController extends AbstractController{

    @Autowired
    private SysScoreService sysScoreService;

    @LogAnnotation("查询")
    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET, produces = "application/json")
    public BaseResponse query(@PathVariable Long id) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        Map<String, Object> resMap = Maps.newHashMap();
        try {
            log.info("接收到数据：{}", id);
            resMap.put("query",sysScoreService.queryByUserId(id));
        } catch (Exception e) {
            response = new BaseResponse(StatusCode.Fail.getCode(), e.getMessage());
        }
        response.setData(resMap);
        return response;
    }
}
