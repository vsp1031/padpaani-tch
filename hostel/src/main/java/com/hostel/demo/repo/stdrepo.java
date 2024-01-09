package com.hostel.demo.repo;

import com.hostel.demo.entity.Dtls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface stdrepo extends JpaRepository<Dtls, Integer> {

}
