package com.debug.pmp.server.service.impl;

import com.debug.pmp.model.entity.SysScoreEntity;
import com.debug.pmp.model.mapper.SysScoreDao;
import com.debug.pmp.server.service.SysScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouyulei
 * @version v1.0.0
 * @ClassName: SysScoreServiceImpl
 * @date 2019/9/4 15:46
 * @Description: SysScoreServiceImpl
 */
@Service("sysScoreService")
public class SysScoreServiceImpl implements SysScoreService{

    @Autowired
    public SysScoreDao sysScoreDao;

    @Override
    public SysScoreEntity queryByUserId(Long userId) {
        return sysScoreDao.queryByUserId(userId);
    }
}