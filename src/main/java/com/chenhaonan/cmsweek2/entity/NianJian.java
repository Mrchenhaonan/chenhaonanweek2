package com.chenhaonan.cmsweek2.entity;

import java.math.BigInteger;
import java.util.Date;

public class NianJian {
	private Integer id;//编号
	private String word;//关键字
	private String about;//描述
	private String name;//公司名称
	private String think;//主营产品
	private String access;//地址
	private Integer qian;//注册资金
	private Date startdate;//成立时间
	private Date date;//年检日期
	private String zhuangtai;//年检状态
	private String beizu;//备注
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param integer the id to set
	 */
	public void setId(Integer integer) {
		this.id = integer;
	}
	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}
	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}
	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the think
	 */
	public String getThink() {
		return think;
	}
	/**
	 * @param think the think to set
	 */
	public void setThink(String think) {
		this.think = think;
	}
	/**
	 * @return the access
	 */
	public String getAccess() {
		return access;
	}
	/**
	 * @param access the access to set
	 */
	public void setAccess(String access) {
		this.access = access;
	}
	/**
	 * @return the qian
	 */
	public Integer getQian() {
		return qian;
	}
	/**
	 * @param qian the qian to set
	 */
	public void setQian(Integer qian) {
		this.qian = qian;
	}
	/**
	 * @return the startdate
	 */
	public Date getStartdate() {
		return startdate;
	}
	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the zhuangtai
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * @param zhuangtai the zhuangtai to set
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * @return the beizu
	 */
	public String getBeizu() {
		return beizu;
	}
	/**
	 * @param beizu the beizu to set
	 */
	public void setBeizu(String beizu) {
		this.beizu = beizu;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "NianJian [id=" + id + ", word=" + word + ", about=" + about
				+ ", name=" + name + ", think=" + think + ", access=" + access
				+ ", qian=" + qian + ", startdate=" + startdate + ", date="
				+ date + ", zhuangtai=" + zhuangtai + ", beizu=" + beizu + "]";
	}
	public NianJian(Integer id, String word, String about, String name,
			String think, String access, Integer qian, Date startdate,
			Date date, String zhuangtai, String beizu) {
		super();
		this.id = id;
		this.word = word;
		this.about = about;
		this.name = name;
		this.think = think;
		this.access = access;
		this.qian = qian;
		this.startdate = startdate;
		this.date = date;
		this.zhuangtai = zhuangtai;
		this.beizu = beizu;
	}
	public NianJian() {
		super();
	}
	
}
