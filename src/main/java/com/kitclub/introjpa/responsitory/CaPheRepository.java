package com.kitclub.introjpa.responsitory;

import com.kitclub.introjpa.entity.CaPhe;
import com.kitclub.introjpa.respone.CaPheRespone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaPheRepository extends JpaRepository<CaPhe, Integer> {
    @Query("SELECT new com.kitclub.introjpa.respone.CaPheRespone(" +
            "c.id, c.name, c.hang.name) from CaPhe c")
    List<CaPheRespone> customQuery();

    //Tim theo ten
    @Query("SELECT new com.kitclub.introjpa.respone.CaPheRespone(" +
            "c.id, c.name, c.hang.name) from CaPhe c where c.name like %:caPheName%")
    List<CaPheRespone> customQueryKemTen(String caPheName);
}
