package com.hairmanager.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "customer")
public class Customer extends HairManagerModel{
	@Id
	@GeneratedValue(generator = "customer_generator")
	@SequenceGenerator(
			name = "customer_generator",
			sequenceName = "customer_sequence",
			initialValue = 1000
			)
	private Long id;
	
	@Column(columnDefinition = "cpf")
	@UniqueElements
	private String cpf;
	
	@Column(columnDefinition = "nome")
	private String nome;
	
	@Column(columnDefinition = "endereco")
	private String endereco;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



}
