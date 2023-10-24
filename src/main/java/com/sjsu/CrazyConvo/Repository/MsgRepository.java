package com.sjsu.CrazyConvo.Repository;
import com.sjsu.CrazyConvo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRepository extends JpaRepository<Message,Integer> {
}
