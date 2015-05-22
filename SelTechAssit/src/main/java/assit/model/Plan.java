package main.java.assit.model;

import java.sql.Date;

public class Plan {
	private long planId;
	private String tag;
	private String detail;
	private String name;
	private Date date;
	private Date dueDate;
	private long devId;
	private long learnId;
	private long scheduleId;
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
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
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public long getDevId() {
		return devId;
	}
	public void setDevId(long devId) {
		this.devId = devId;
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
	

}
