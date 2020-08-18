package com.szb.mapper;

import com.szb.entity.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public TblUserRecord login(@Param("username") String username,@Param("password")String password);

}
