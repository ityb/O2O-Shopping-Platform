package com.ityb.qugou.dao.system;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ityb.qugou.base.builder.SqlCondition;
import com.ityb.qugou.base.dao.BaseDao;
import com.ityb.qugou.base.mapper.BaseMapper;
import com.ityb.qugou.po.job.ScheduledJob;

/**
 * 搜索关键字dao
 * @author yangbin
 * @copyright 2017-2018.yangbin.All rights reserved.
 */
@Repository
public class ScheduledJobDao extends BaseDao<ScheduledJob>{
	@Autowired
	private BaseMapper baseMapper;

	@Override
	protected BaseMapper getMapper() {
		return baseMapper;
	}

	@Override
	protected Class<?> getModelClass() {
		return ScheduledJob.class;
	}
	
	@Override
	public SqlCondition getCondition(SqlCondition sqlCondition, Map<String, Object> params) {
		sqlCondition.addOrderItem("ctime");
		sqlCondition.addOrderItem("mtime");
		return sqlCondition;
	}
}
