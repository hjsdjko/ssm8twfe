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


import com.dao.YuyuetijianDao;
import com.entity.YuyuetijianEntity;
import com.service.YuyuetijianService;
import com.entity.vo.YuyuetijianVO;
import com.entity.view.YuyuetijianView;

@Service("yuyuetijianService")
public class YuyuetijianServiceImpl extends ServiceImpl<YuyuetijianDao, YuyuetijianEntity> implements YuyuetijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuetijianEntity> page = this.selectPage(
                new Query<YuyuetijianEntity>(params).getPage(),
                new EntityWrapper<YuyuetijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuetijianEntity> wrapper) {
		  Page<YuyuetijianView> page =new Query<YuyuetijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuetijianVO> selectListVO(Wrapper<YuyuetijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuetijianVO selectVO(Wrapper<YuyuetijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuetijianView> selectListView(Wrapper<YuyuetijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuetijianView selectView(Wrapper<YuyuetijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
