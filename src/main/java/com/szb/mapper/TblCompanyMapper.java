package com.szb.mapper;

import com.szb.entity.TblCompany;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 企业档案 Mapper 接口
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
public interface TblCompanyMapper extends BaseMapper<TblCompany> {

    /**
     * 查询
     * @return
     */
    public List<TblCompany> selectByCompany();

}
