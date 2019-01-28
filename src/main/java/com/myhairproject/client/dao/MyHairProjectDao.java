package com.myhairproject.client.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name="project")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyHairProjectDao {
	@Id
    @GeneratedValue
    private Integer idCliente;
    private String nomeCliente;
    private String endCliente;
    private String telefoneCliente;
    private String dataNascimentoCliente;

}
