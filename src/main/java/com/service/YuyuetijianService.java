package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuetijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuetijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuetijianView;


/**
 * 预约体检
 *
 * @author 
 * @email 
 * @date 2021-05-01 11:49:01
 */
public interface YuyuetijianService extends IService<YuyuetijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuetijianVO> selectListVO(Wrapper<YuyuetijianEntity> wrapper);
   	
   	YuyuetijianVO selectVO(@Param("ew") Wrapper<YuyuetijianEntity> wrapper);
   	
   	List<YuyuetijianView> selectListView(Wrapper<YuyuetijianEntity> wrapper);
   	
   	YuyuetijianView selectView(@Param("ew") Wrapper<YuyuetijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuetijianEntity> wrapper);
   	
}

