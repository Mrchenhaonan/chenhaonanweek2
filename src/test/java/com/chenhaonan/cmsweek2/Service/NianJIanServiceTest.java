package com.chenhaonan.cmsweek2.Service;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.common.utils.StreamUtil;
import com.bobo.common.utils.StringUtil;
import com.chenhaonan.cmsweek2.Service.Impl.NianJianServiceImpl;
import com.chenhaonan.cmsweek2.entity.NianJian;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class NianJIanServiceTest extends TestCase {
	@Autowired
	private NianJIanService service;
	@Test
	public void testInsert() throws IOException{
		List<NianJian> nian=new ArrayList<NianJian>();//添加
		List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("公司年检.txt"));
		for (String str : list) {
			NianJian n=new NianJian();
			String[] s = str.split("\\	");
			String id0=s[0];
			if(StringUtil.isNumber(id0)){
				n.setId(Integer.valueOf(id0));
			}
			if(StringUtil.hasText(s[1])){
				n.setWord(s[1]);
			}
			if(StringUtil.hasText(s[4])){
				n.setThink(s[4]);
			}
			if(StringUtil.hasText(s[2])){
				n.setAbout(s[2]);
			}
			if(StringUtil.hasText(s[3])){
				n.setName(s[3]);
			}
			if(StringUtil.hasText(s[5])){
				n.setAccess(s[5]);
			}
			if(StringUtil.hasText(s[6])){
				n.setQian(Integer.valueOf(s[6]));
			}
			if(s[7].equals("")){
				s[7]=" ";
				n.setDate(Date.valueOf(s[7]));
			}
			if(StringUtil.hasText(s[8])){
				n.setStartdate(Date.valueOf(s[8]));
			}
			n.setZhuangtai(s[9]);
			n.setBeizu(s[10]);
			int flag=service.insert(n);
		}
	}
}
