package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Produit;
@Repository
public interface IGestionProduit extends JpaRepository<Produit, Integer> {

}
