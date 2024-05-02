package com.dao;

import com.entity.TaocanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanxiangmuVO;
import com.entity.view.TaocanxiangmuView;


/**
 * 套餐项目
 * 
 * @author 
 * @email 
 * @date 2021-05-01 11:49:01
 */
public interface TaocanxiangmuDao extends BaseMapper<TaocanxiangmuEntity> {
	
	List<TaocanxiangmuVO> selectListVO(@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);
	
	TaocanxiangmuVO selectVO(@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);
	
	List<TaocanxiangmuView> selectListView(@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);

	List<TaocanxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);
	
	TaocanxiangmuView selectView(@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);
	
}
