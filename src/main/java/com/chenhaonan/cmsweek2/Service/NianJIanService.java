package com.chenhaonan.cmsweek2.Service;

import com.chenhaonan.cmsweek2.entity.NianJian;
import com.chenhaonan.cmsweek2.entity.NianJianVO;
import com.github.pagehelper.PageInfo;

public interface NianJIanService {

	int insert(NianJian n);//添加

	PageInfo<NianJian> selects(NianJianVO nianjianVo, Integer page,//分页
			Integer pageSize);

	NianJian toupdate(Integer id);//回显

	int update(NianJian n);//核审

}
