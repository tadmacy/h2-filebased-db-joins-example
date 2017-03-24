package com.tadmacy.h2.filebased.db.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "occupations")
public class Occupation {
	
    @Id 
    @Column(name="ID", unique=true, updatable=false, nullable=false)
	@GeneratedValue
	private long id;

    @Column(name="category", unique=true, updatable=true, nullable=false)
    private String category;

    @Column(name="title", unique=false, updatable=true, nullable=true)
    private String title;
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoty() {
		return category;
	}

	public void setCategoty(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	   // private Iterable<User> users;
//	@OneToMany(mappedBy = "name", cascade = CascadeType.ALL)
//    public Iterable<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Iterable<User> users) {
//        this.users = users;
//    }
//
//    @Override
//    public String toString() {
//        String result = String.format("Group[id=%d, name='%s']%n", id, name);
//        if (users != null) {
//            for(User user : users) {
//                result += String.format("User[id=%d, name='%s']%n", user.getId(), user.getUsername());
//            }
//        }
//
//        return result;
//    }
    
}