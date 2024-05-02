package com.dao;

import com.entity.JiankangcepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangcepingVO;
import com.entity.view.JiankangcepingView;


/**
 * 健康测评
 * 
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public interface JiankangcepingDao extends BaseMapper<JiankangcepingEntity> {
	
	List<JiankangcepingVO> selectListVO(@Param("ew") Wrapper<JiankangcepingEntity> wrapper);
	
	JiankangcepingVO selectVO(@Param("ew") Wrapper<JiankangcepingEntity> wrapper);
	
	List<JiankangcepingView> selectListView(@Param("ew") Wrapper<JiankangcepingEntity> wrapper);

	List<JiankangcepingView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangcepingEntity> wrapper);
	
	JiankangcepingView selectView(@Param("ew") Wrapper<JiankangcepingEntity> wrapper);
	
}
