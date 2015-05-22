package main.java.assit.model;

import java.sql.Date;

public class Work {
	private long workId;
	private long issueId;
	private long devId;
	private Date date;
	private Tag tag;
	private long learnId;
	private long scheduleId;
	private long planId;
	private long pplId;
	
	public long getWorkId() {
		return workId;
	}
	public void setWorkId(long workId) {
		this.workId = workId;
	}
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}
	public long getDevId() {
		return devId;
	}
	public void setDevId(long devId) {
		this.devId = devId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public long getLearnId() {
		return learnId;
	}
	public void setLearnId(long learnId) {
		this.learnId = learnId;
	}
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public long getPplId() {
		return pplId;
	}
	public void setPplId(long pplId) {
		this.pplId = pplId;
	}

}
