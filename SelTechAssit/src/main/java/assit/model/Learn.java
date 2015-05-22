package main.java.assit.model;

import java.sql.Date;

public class Learn {
	private long learnId;
	private String tag;
	private String detail;
	private String url;
	private Date data;
	private long planId;
	private long scheduleId;
	private long devId;
	private long issueId;
	
	
	public long getLearnId() {
		return learnId;
	}
	public void setLearnId(long learnId) {
		this.learnId = learnId;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public long getDevId() {
		return devId;
	}
	public void setDevId(long devId) {
		this.devId = devId;
	}
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}

}
