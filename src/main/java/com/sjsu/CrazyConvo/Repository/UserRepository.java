package com.sjsu.CrazyConvo.Repository;

import com.sjsu.CrazyConvo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
