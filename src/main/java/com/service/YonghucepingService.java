package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghucepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghucepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghucepingView;


/**
 * 用户测评
 *
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public interface YonghucepingService extends IService<YonghucepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghucepingVO> selectListVO(Wrapper<YonghucepingEntity> wrapper);
   	
   	YonghucepingVO selectVO(@Param("ew") Wrapper<YonghucepingEntity> wrapper);
   	
   	List<YonghucepingView> selectListView(Wrapper<YonghucepingEntity> wrapper);
   	
   	YonghucepingView selectView(@Param("ew") Wrapper<YonghucepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghucepingEntity> wrapper);
   	
}

