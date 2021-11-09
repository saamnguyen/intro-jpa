package com.kitclub.introjpa.responsitory;

import com.kitclub.introjpa.entity.Hang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangRepository extends JpaRepository<Hang, Integer> {
}
