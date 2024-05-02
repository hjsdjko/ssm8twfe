package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiankangcepingDao;
import com.entity.JiankangcepingEntity;
import com.service.JiankangcepingService;
import com.entity.vo.JiankangcepingVO;
import com.entity.view.JiankangcepingView;

@Service("jiankangcepingService")
public class JiankangcepingServiceImpl extends ServiceImpl<JiankangcepingDao, JiankangcepingEntity> implements JiankangcepingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangcepingEntity> page = this.selectPage(
                new Query<JiankangcepingEntity>(params).getPage(),
                new EntityWrapper<JiankangcepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangcepingEntity> wrapper) {
		  Page<JiankangcepingView> page =new Query<JiankangcepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangcepingVO> selectListVO(Wrapper<JiankangcepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangcepingVO selectVO(Wrapper<JiankangcepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangcepingView> selectListView(Wrapper<JiankangcepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangcepingView selectView(Wrapper<JiankangcepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
