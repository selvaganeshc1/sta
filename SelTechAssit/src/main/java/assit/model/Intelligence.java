package main.java.assit.model;

import java.sql.Date;

public class Intelligence {

	private long intelligenceId;
	private String tag;
	private String detail;
	private Date date;
	private long issueId;
	private long learnId;
	public long getIntelligenceId() {
		return intelligenceId;
	}
	public void setIntelligenceId(long intelligenceId) {
		this.intelligenceId = intelligenceId;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}
	public long getLearnId() {
		return learnId;
	}
	public void setLearnId(long learnId) {
		this.learnId = learnId;
	}
}
