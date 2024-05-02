package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangxiaotieshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangxiaotieshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangxiaotieshiView;


/**
 * 健康小贴士
 *
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public interface JiankangxiaotieshiService extends IService<JiankangxiaotieshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangxiaotieshiVO> selectListVO(Wrapper<JiankangxiaotieshiEntity> wrapper);
   	
   	JiankangxiaotieshiVO selectVO(@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);
   	
   	List<JiankangxiaotieshiView> selectListView(Wrapper<JiankangxiaotieshiEntity> wrapper);
   	
   	JiankangxiaotieshiView selectView(@Param("ew") Wrapper<JiankangxiaotieshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangxiaotieshiEntity> wrapper);
   	
}

