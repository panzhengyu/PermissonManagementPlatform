package com.debug.pmp.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.debug.pmp.model.entity.SysScoreEntity;

public interface SysScoreService extends IService<SysScoreEntity> {
    void queryByUserId(Long userId);

}
