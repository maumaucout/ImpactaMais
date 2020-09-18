package com.zeroseis.impactamais.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeroseis.impactamais.model.Hospital;
import com.zeroseis.impactamais.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	public Optional<Hospital> findAllBySangueContainingIgnoreCase (String sangue);
	public Optional<Hospital> findAllByCidadeContainingIgnoreCase (String cidade);

}
