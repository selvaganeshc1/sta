package main.java.assit.model;

import java.sql.Date;

public class People {

	private long pplId;
	private String name;
	private Date date;
	private String tag;
	private String detail;
	private long issueId;
	public long getPplId() {
		return pplId;
	}
	public void setPplId(long pplId) {
		this.pplId = pplId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}
	
	
}
