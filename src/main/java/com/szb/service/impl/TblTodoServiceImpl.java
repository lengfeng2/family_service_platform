package com.szb.service.impl;

import com.szb.entity.TblTodo;
import com.szb.mapper.TblTodoMapper;
import com.szb.service.base.ITblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements ITblTodoService {

}
