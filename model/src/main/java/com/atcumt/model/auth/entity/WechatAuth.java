package com.atcumt.model.auth.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WechatAuth {
    @TableId
    private String wechatAuthId;   // 记录ID，由UUID生成
    private String authId;         // 关联auth表的ID
    private String openid;         // 微信OpenID
    private String unionid;        // 微信UnionID（同一开放平台下唯一）
    private LocalDateTime createTime;    // 创建时间
    private LocalDateTime updateTime;    // 更新时间
}
