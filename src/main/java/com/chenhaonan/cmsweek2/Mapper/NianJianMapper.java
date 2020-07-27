package com.chenhaonan.cmsweek2.Mapper;

import java.util.List;

import com.chenhaonan.cmsweek2.entity.NianJian;
import com.chenhaonan.cmsweek2.entity.NianJianVO;

public interface NianJianMapper {

	int insert(NianJian n);//添加

	List<NianJian> selects(NianJianVO nianjianVo);//分页模糊

	NianJian toupdate(Integer id);//回显

	int update(NianJian n);//修改

}
