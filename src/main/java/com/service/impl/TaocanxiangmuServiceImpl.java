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


import com.dao.TaocanxiangmuDao;
import com.entity.TaocanxiangmuEntity;
import com.service.TaocanxiangmuService;
import com.entity.vo.TaocanxiangmuVO;
import com.entity.view.TaocanxiangmuView;

@Service("taocanxiangmuService")
public class TaocanxiangmuServiceImpl extends ServiceImpl<TaocanxiangmuDao, TaocanxiangmuEntity> implements TaocanxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanxiangmuEntity> page = this.selectPage(
                new Query<TaocanxiangmuEntity>(params).getPage(),
                new EntityWrapper<TaocanxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanxiangmuEntity> wrapper) {
		  Page<TaocanxiangmuView> page =new Query<TaocanxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocanxiangmuVO> selectListVO(Wrapper<TaocanxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanxiangmuVO selectVO(Wrapper<TaocanxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanxiangmuView> selectListView(Wrapper<TaocanxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanxiangmuView selectView(Wrapper<TaocanxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
