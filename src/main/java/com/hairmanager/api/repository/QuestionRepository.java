package com.hairmanager.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hairmanager.api.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
