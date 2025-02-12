package com.atcumt.model.gpt.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConversationVO {
    private String id;
    private String title;
    private List<MessagePageVO> messages;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
