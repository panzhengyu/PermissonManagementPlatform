package com.debug.pmp.server.service;

import com.debug.pmp.model.entity.SysScoreEntity;

public interface SysScoreService {
    SysScoreEntity queryByUserId(Long userId);
}
