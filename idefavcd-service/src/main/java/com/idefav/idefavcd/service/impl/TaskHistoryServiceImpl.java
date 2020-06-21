package com.idefav.idefavcd.service.impl;

import com.idefav.idefavcd.entity.TaskHistory;
import com.idefav.idefavcd.mapper.TaskHistoryMapper;
import com.idefav.idefavcd.service.ITaskHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 运行历史 服务实现类
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@Service
public class TaskHistoryServiceImpl extends ServiceImpl<TaskHistoryMapper, TaskHistory> implements ITaskHistoryService {

}
