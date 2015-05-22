package main.java.assit.model;

import java.sql.Date;
import java.util.List;

public class ImpMemory {

	private long impMemoryId;
	private Date date;
	private List<People> peoples;
	private String aboutMem;
	private Tag tag;
	private Schedule schedule;
	
	
	public long getImpMemoryId() {
		return impMemoryId;
	}
	public void setImpMemoryId(long impMemoryId) {
		this.impMemoryId = impMemoryId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<People> getPeoples() {
		return peoples;
	}
	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}
	public String getAboutMem() {
		return aboutMem;
	}
	public void setAboutMem(String aboutMem) {
		this.aboutMem = aboutMem;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	
}
