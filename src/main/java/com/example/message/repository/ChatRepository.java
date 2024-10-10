package com.example.message.repository;

import com.example.message.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat,Integer> {
    Chat findByUser1AndUser2(String username1,String username2);
}
