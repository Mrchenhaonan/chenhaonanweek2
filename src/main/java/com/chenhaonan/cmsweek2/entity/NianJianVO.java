package com.chenhaonan.cmsweek2.entity;

import java.sql.Date;

public class NianJianVO {
	private String word;
	private String about;
	private String name;
	private String access;
	private Integer qian;
	private Date date;
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
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "NianJianVO [word=" + word + ", about=" + about + ", name="
				+ name + ", access=" + access + ", qian=" + qian + ", date="
				+ date + "]";
	}
	public NianJianVO(String word, String about, String name, String access,
			Integer qian, Date date) {
		super();
		this.word = word;
		this.about = about;
		this.name = name;
		this.access = access;
		this.qian = qian;
		this.date = date;
	}
	public NianJianVO() {
		super();
	}
	
}
