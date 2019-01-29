package com.hairmanager.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	@Id
    @GeneratedValue(generator = "login_generator")
    @SequenceGenerator(
            name = "login_generator",
            sequenceName = "login_sequence",
            initialValue = 1000
    )
    private Long id;
	 @Column(columnDefinition = "user")
	    private String user;
	 @Column(columnDefinition = "password")
	    private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
