package com.nick.Languages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2, max = 20)
    private String name;
    @Size(min = 2, max = 20)
    private String creator;
    @NotNull
    private Double version;
    
    public Language() {
    	
    }   
    
	public Language(String name, String creator, Double version) {
		super();
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

	public Language(Long id, String name, String creator, Double version) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.version = version;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}
    
}
