package com.example.message.repository;

import com.example.message.entity.Message;
import com.example.message.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    @Query(value = "select *from message where group_id=:id", nativeQuery = true)
    List<Message> messageList(Integer id);

    List<Message> findByFromAndTo(User from, User to);
}
