package main.java.assit.model;

import java.sql.Date;

public class Daily {

	private long  dailyId;
	private Date date;
	private long DailyLearnId;
	private long expenceId;
	private String tag;
	private long workId;
	private long planId;
	private long pplId;
	public long getDailyId() {
		return dailyId;
	}
	public void setDailyId(long dailyId) {
		this.dailyId = dailyId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getDailyLearnId() {
		return DailyLearnId;
	}
	public void setDailyLearnId(long dailyLearnId) {
		DailyLearnId = dailyLearnId;
	}
	public long getExpenceId() {
		return expenceId;
	}
	public void setExpenceId(long expenceId) {
		this.expenceId = expenceId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public long getWorkId() {
		return workId;
	}
	public void setWorkId(long workId) {
		this.workId = workId;
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
