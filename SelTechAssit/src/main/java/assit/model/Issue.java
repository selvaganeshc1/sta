package main.java.assit.model;

import java.io.File;
import java.sql.Date;

public class Issue {
	
	private long issueId;
	private long tag;
	private long detail;
	private String mistake;
	private String fact;
	private String correction;
	private long learnId;
	private long pplId;
	private Date date;
	private File patchFile;
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}
	public long getTag() {
		return tag;
	}
	public void setTag(long tag) {
		this.tag = tag;
	}
	public long getDetail() {
		return detail;
	}
	public void setDetail(long detail) {
		this.detail = detail;
	}
	public String getMistake() {
		return mistake;
	}
	public void setMistake(String mistake) {
		this.mistake = mistake;
	}
	public String getFact() {
		return fact;
	}
	public void setFact(String fact) {
		this.fact = fact;
	}
	public String getCorrection() {
		return correction;
	}
	public void setCorrection(String correction) {
		this.correction = correction;
	}
	public long getLearnId() {
		return learnId;
	}
	public void setLearnId(long learnId) {
		this.learnId = learnId;
	}
	public long getPplId() {
		return pplId;
	}
	public void setPplId(long pplId) {
		this.pplId = pplId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public File getPatchFile() {
		return patchFile;
	}
	public void setPatchFile(File patchFile) {
		this.patchFile = patchFile;
	}
	
	

}
