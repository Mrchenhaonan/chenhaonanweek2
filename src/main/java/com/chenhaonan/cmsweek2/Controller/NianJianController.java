package com.chenhaonan.cmsweek2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chenhaonan.cmsweek2.Service.NianJIanService;
import com.chenhaonan.cmsweek2.entity.NianJian;
import com.chenhaonan.cmsweek2.entity.NianJianVO;
import com.github.pagehelper.PageInfo;

@Controller
public class NianJianController {
	@Autowired
	private NianJIanService service;
	@RequestMapping("list")//分页列表
	public String list(Model model,NianJianVO nianjianVo,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="5") Integer pageSize){
		PageInfo<NianJian> info=service.selects(nianjianVo,page,pageSize);
		model.addAttribute("info", info);
		model.addAttribute("nianjianVo", nianjianVo);
		return "list";
		
	}
	@RequestMapping("toupdate")//回显
	public NianJian toupdate(@RequestParam(defaultValue="1") Integer id){
		NianJian n=service.toupdate(id);
		return n;
		
	}
	@RequestMapping("update")//核审
	public int update(){
		NianJian n=new NianJian();
		int flag=0;
		flag=service.update(n);
		return flag;
		
	}
}
