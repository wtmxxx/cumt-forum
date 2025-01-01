package com.atcumt.model.comment.entity;

import com.atcumt.model.common.entity.MediaFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "comment")
@TypeAlias("Comment")
@CompoundIndexes({
        @CompoundIndex(name = "postId_score_commentId_idx", def = "{'postId': 1, 'score': -1, 'commentId': -1}"),  // 为 postId、score 和 commentId 创建复合索引
        @CompoundIndex(name = "postId_createTime_commentId_idx", def = "{'postId': 1, 'createTime': -1, 'commentId': -1}"),  // 为 postId、createTime 和 commentId 创建复合索引
        @CompoundIndex(name = "userId_createTime_commentId_idx", def = "{'userId': 1, 'createTime': -1, 'commentId': -1}")  // 为 userId、createTime 和 commentId 创建复合索引
})
public class Comment {
    @MongoId
    private Long commentId;
    private Long postId;
    @Indexed
    private String postType;
    @Indexed
    private String commentToUserId;
    private String userId;
    private String content;
    private List<MediaFile> mediaFiles;
    private Integer likeCount;
    private Integer dislikeCount;
    private Integer replyCount;
    @Indexed(direction = IndexDirection.DESCENDING)
    private Double score;
    @Indexed
    private LocalDateTime createTime;
}
