package com.kitclub.introjpa.responsitory;

import com.kitclub.introjpa.entity.CaPhe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaPheRepository extends JpaRepository<CaPhe, Integer> {
}
