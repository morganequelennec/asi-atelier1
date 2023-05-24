package com.cpe.cardgame.repositories;

import com.cpe.cardgame.model.StoreTransaction;
import com.cpe.cardgame.model.UserGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserGame, Integer> {
    // Additional custom methods can be defined here if needed
    Page<UserGame> findAll(Pageable pageable);
}

