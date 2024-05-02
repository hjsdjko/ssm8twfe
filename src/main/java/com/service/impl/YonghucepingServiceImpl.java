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


import com.dao.YonghucepingDao;
import com.entity.YonghucepingEntity;
import com.service.YonghucepingService;
import com.entity.vo.YonghucepingVO;
import com.entity.view.YonghucepingView;

@Service("yonghucepingService")
public class YonghucepingServiceImpl extends ServiceImpl<YonghucepingDao, YonghucepingEntity> implements YonghucepingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghucepingEntity> page = this.selectPage(
                new Query<YonghucepingEntity>(params).getPage(),
                new EntityWrapper<YonghucepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghucepingEntity> wrapper) {
		  Page<YonghucepingView> page =new Query<YonghucepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghucepingVO> selectListVO(Wrapper<YonghucepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghucepingVO selectVO(Wrapper<YonghucepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghucepingView> selectListView(Wrapper<YonghucepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghucepingView selectView(Wrapper<YonghucepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
