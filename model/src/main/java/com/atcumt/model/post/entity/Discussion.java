package com.atcumt.model.post.entity;

import com.atcumt.model.common.entity.MediaFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "discussion")
@TypeAlias("Discussion")
public class Discussion {
    @MongoId
    private Long discussionId; // 雪花算法生成ID，自动作为主键，MongoDB会为其创建索引
    @Indexed  // 为authorId创建单字段索引
    private String userId;  // 作者ID
    private String title;  // 帖子标题
    private String content; // 帖子内容
    private List<MediaFile> mediaFiles; // 动态存储附件数据：图片、视频、文档等，每个媒体文件包含文件类型、URL等信息
    @Indexed
    private List<Long> tagIds; // 标签ID
    private Integer likeCount; // 点赞数
    private Integer commentCount; // 评论数
    private Long viewCount;  // 观看量
    @Indexed
    private Integer status;  // 帖子状态（0 - 草稿，1 - 审核中，2 - 已发布，3 - 审核不通过，-1 - 已删除）
    private String rejectReason;  // 帖子审核不通过原因
    @Indexed
    private Double score;  // 帖子评分
    @Indexed
    private LocalDateTime createTime; // 创建时间
    @Indexed
    private LocalDateTime updateTime; // 更新时间
}