package com.example.message.model;

import com.example.message.entity.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private String message;

    private String createdAt;

    private MessageType type;

    private Integer groupId;

    private Integer fromId;

    private Integer toId;
}
