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


import com.dao.JiankangxiaotieshiDao;
import com.entity.JiankangxiaotieshiEntity;
import com.service.JiankangxiaotieshiService;
import com.entity.vo.JiankangxiaotieshiVO;
import com.entity.view.JiankangxiaotieshiView;

@Service("jiankangxiaotieshiService")
public class JiankangxiaotieshiServiceImpl extends ServiceImpl<JiankangxiaotieshiDao, JiankangxiaotieshiEntity> implements JiankangxiaotieshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangxiaotieshiEntity> page = this.selectPage(
                new Query<JiankangxiaotieshiEntity>(params).getPage(),
                new EntityWrapper<JiankangxiaotieshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangxiaotieshiEntity> wrapper) {
		  Page<JiankangxiaotieshiView> page =new Query<JiankangxiaotieshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangxiaotieshiVO> selectListVO(Wrapper<JiankangxiaotieshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangxiaotieshiVO selectVO(Wrapper<JiankangxiaotieshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangxiaotieshiView> selectListView(Wrapper<JiankangxiaotieshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangxiaotieshiView selectView(Wrapper<JiankangxiaotieshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
