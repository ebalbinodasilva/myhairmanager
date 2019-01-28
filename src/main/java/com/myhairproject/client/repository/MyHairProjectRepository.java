package com.myhairproject.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.myhairproject.client.dao.MyHairProjectDao;

@Transactional
public interface MyHairProjectRepository extends JpaRepository<MyHairProjectDao,Integer>{

}
