package com.dao;

import com.entity.JiankangxiaotieshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangxiaotieshiVO;
import com.entity.view.JiankangxiaotieshiView;


/**
 * 健康小贴士
 * 
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public interface JiankangxiaotieshiDao extends BaseMapper<JiankangxiaotieshiEntity> {
	
	List<JiankangxiaotieshiVO> selectListVO(@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);
	
	JiankangxiaotieshiVO selectVO(@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);
	
	List<JiankangxiaotieshiView> selectListView(@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);

	List<JiankangxiaotieshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);
	
	JiankangxiaotieshiView selectView(@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);
	
}
