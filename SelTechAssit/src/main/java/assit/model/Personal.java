package main.java.assit.model;

import java.sql.Date;

public class Personal {
	
	private long personalId;
	public long getPersonalId() {
		return personalId;
	}
	public void setPersonalId(long personalId) {
		this.personalId = personalId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getWebPwd() {
		return webPwd;
	}
	public void setWebPwd(String webPwd) {
		this.webPwd = webPwd;
	}
	private Date date;
	private String tag;
	private String name;
	private String detail;
	private String website;
	private String webPwd;

}
