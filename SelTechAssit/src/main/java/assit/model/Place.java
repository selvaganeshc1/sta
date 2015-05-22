package main.java.assit.model;

import java.util.List;

public class Place {
	
	private long plaveId;
	private String name;
	private Address address;
	private List<People> peoples;
	private Discipline placeDiscipline;
	
	private ImpMemory placeImpMemory;
	public long getPlaveId() {
		return plaveId;
	}
	public void setPlaveId(long plaveId) {
		this.plaveId = plaveId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<People> getPeoples() {
		return peoples;
	}
	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}
	public Discipline getPlaceDiscipline() {
		return placeDiscipline;
	}
	public void setPlaceDiscipline(Discipline placeDiscipline) {
		this.placeDiscipline = placeDiscipline;
	}
	public ImpMemory getPlaceImpMemory() {
		return placeImpMemory;
	}
	public void setPlaceImpMemory(ImpMemory placeImpMemory) {
		this.placeImpMemory = placeImpMemory;
	}
        
	

}
