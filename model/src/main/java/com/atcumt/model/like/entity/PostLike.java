package com.atcumt.model.like.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "post_like")
@TypeAlias("PostLike")
public class PostLike {
    @MongoId
    private Long likeId;
    @Indexed
    private String action;
    @Indexed
    private String postType;
    @Indexed
    private Long postId;
    @Indexed
    private String userId;
    @Indexed
    private LocalDateTime createTime;
}