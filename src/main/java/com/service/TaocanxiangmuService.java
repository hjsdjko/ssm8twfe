package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanxiangmuView;


/**
 * 套餐项目
 *
 * @author 
 * @email 
 * @date 2021-05-01 11:49:01
 */
public interface TaocanxiangmuService extends IService<TaocanxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanxiangmuVO> selectListVO(Wrapper<TaocanxiangmuEntity> wrapper);
   	
   	TaocanxiangmuVO selectVO(@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);
   	
   	List<TaocanxiangmuView> selectListView(Wrapper<TaocanxiangmuEntity> wrapper);
   	
   	TaocanxiangmuView selectView(@Param("ew") Wrapper<TaocanxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanxiangmuEntity> wrapper);
   	
}

