package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangcepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangcepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangcepingView;


/**
 * 健康测评
 *
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public interface JiankangcepingService extends IService<JiankangcepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangcepingVO> selectListVO(Wrapper<JiankangcepingEntity> wrapper);
   	
   	JiankangcepingVO selectVO(@Param("ew") Wrapper<JiankangcepingEntity> wrapper);
   	
   	List<JiankangcepingView> selectListView(Wrapper<JiankangcepingEntity> wrapper);
   	
   	JiankangcepingView selectView(@Param("ew") Wrapper<JiankangcepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangcepingEntity> wrapper);
   	
}

