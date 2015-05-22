package main.java.assit.model;

public class Discipline {

	private long disciplineId;
	private Moral moral;
	private String name;
	private String impact;
	private String futureGain;
	public long getDisciplineId() {
		return disciplineId;
	}
	public void setDisciplineId(long disciplineId) {
		this.disciplineId = disciplineId;
	}
	public Moral getMoral() {
		return moral;
	}
	public void setMoral(Moral moral) {
		this.moral = moral;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getFutureGain() {
		return futureGain;
	}
	public void setFutureGain(String futureGain) {
		this.futureGain = futureGain;
	}
	
}
