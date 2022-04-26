package com.lazaruz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazaruz.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
