package com.debug.pmp.model.mapper;

import com.debug.pmp.model.entity.SysScoreEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author zhouyulei
 * @version v1.0.0
 * @ClassName: SysScoreDao
 * @date 2019/9/4 15:17
 * @Description: TODO
 */
@Mapper
public interface SysScoreDao {
    SysScoreEntity queryByUserId(@Param("id") Long userId);
}
