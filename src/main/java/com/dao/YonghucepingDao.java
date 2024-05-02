package com.dao;

import com.entity.YonghucepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghucepingVO;
import com.entity.view.YonghucepingView;


/**
 * 用户测评
 * 
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public interface YonghucepingDao extends BaseMapper<YonghucepingEntity> {
	
	List<YonghucepingVO> selectListVO(@Param("ew") Wrapper<YonghucepingEntity> wrapper);
	
	YonghucepingVO selectVO(@Param("ew") Wrapper<YonghucepingEntity> wrapper);
	
	List<YonghucepingView> selectListView(@Param("ew") Wrapper<YonghucepingEntity> wrapper);

	List<YonghucepingView> selectListView(Pagination page,@Param("ew") Wrapper<YonghucepingEntity> wrapper);
	
	YonghucepingView selectView(@Param("ew") Wrapper<YonghucepingEntity> wrapper);
	
}
