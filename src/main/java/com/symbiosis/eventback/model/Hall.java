package com.symbiosis.eventback.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity

public class Hall {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    private String hallname,location,contactno,guestcount,invest;
    @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(name="hall_images",joinColumns= {
    		@JoinColumn(name="hall_id")
    },
    inverseJoinColumns= {
    		@JoinColumn(name="image_id")
    }
    )
    private Set<ImageModel> hallImages;
	public Set<ImageModel> getHallImages() {
		return hallImages;
	}
	public void setHallImages(Set<ImageModel> hallImages) {
		this.hallImages = hallImages;
	}
	public Hall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hall(String hallname, String location,String contactno, String guestcount,
			String invest) {
		super();
		this.hallname = hallname;
		this.location = location;
		this.contactno = contactno;
		this.guestcount = guestcount;
		this.invest = invest;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHallname() {
		return hallname;
	}
	public void setHallname(String hallname) {
		this.hallname = hallname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getGuestcount() {
		return guestcount;
	}
	public void setGuestcount(String guestcount) {
		this.guestcount = guestcount;
	}
	public String getInvest() {
		return invest;
	}
	public void setInvest(String invest) {
		this.invest = invest;
	}

    
    
    
    
    
    
}
