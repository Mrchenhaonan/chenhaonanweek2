package com.chenhaonan.cmsweek2.Service.Impl;

import java.util.List;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenhaonan.cmsweek2.Mapper.NianJianMapper;
import com.chenhaonan.cmsweek2.Service.NianJIanService;
import com.chenhaonan.cmsweek2.entity.NianJian;
import com.chenhaonan.cmsweek2.entity.NianJianVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class NianJianServiceImpl implements NianJIanService{
	@Autowired
	private NianJianMapper mapper;

	@Override
	public int insert(NianJian n) {//添加
		// TODO Auto-generated method stub
		return mapper.insert(n);
	}

	@Override
	public PageInfo<NianJian> selects(NianJianVO nianjianVo, Integer page,
			Integer pageSize) {//分页
		// TODO Auto-generated method stub
		PageHelper.startPage(page,pageSize);
		List<NianJian> list=mapper.selects(nianjianVo);
		return new PageInfo<NianJian>(list);
	}

	@Override
	public NianJian toupdate(Integer id) {//回显
		// TODO Auto-generated method stub
		return mapper.toupdate(id);
	}

	@Override
	public int update(NianJian n) {//修改
		// TODO Auto-generated method stub
		return mapper.update(n);
	}
}
