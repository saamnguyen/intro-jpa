package com.kitclub.introjpa.responsitory;

import com.kitclub.introjpa.entity.Hang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HangRepository extends JpaRepository<Hang, Integer> {
    List<Hang> findAll();

    Hang findHangByIdOrNameLike(Integer id, String name);

  //  List<Hang> findAllBy(String name);

}
