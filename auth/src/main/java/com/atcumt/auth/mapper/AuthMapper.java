package com.atcumt.auth.mapper;

import com.atcumt.model.auth.entity.UserAuth;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper extends BaseMapper<UserAuth> {
}
