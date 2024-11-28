package com.atcumt.common.enums;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum DisableEnum {
    ACCOUNT(PermModule.ACCOUNT, PermAction.DISABLE, PermAction.UNTIE_DISABLE),
    QUESTION(PermModule.QUESTION, PermAction.DISABLE, PermAction.UNTIE_DISABLE),
    ANSWER(PermModule.ANSWER, PermAction.DISABLE, PermAction.UNTIE_DISABLE),
    COMMENT(PermModule.COMMENT, PermAction.DISABLE, PermAction.UNTIE_DISABLE),
    ARTICLE(PermModule.ARTICLE, PermAction.DISABLE, PermAction.UNTIE_DISABLE);

    private final PermModule module;
    private final PermAction disableAction;
    private final PermAction untieDisableAction;

    DisableEnum(PermModule module, PermAction disableAction, PermAction untieDisableAction) {
        this.module = module;
        this.disableAction = disableAction;
        this.untieDisableAction = untieDisableAction;
    }

    // 获取所有的服务名称列表
    public static List<String> getAllServices() {
        return Arrays.stream(values())
                .map(service -> service.module.getValue())
                .toList();
    }

    // 根据服务名称查找对应的枚举
    public static DisableEnum fromService(String serviceName) {
        return Arrays.stream(values())
                .filter(service -> StrUtil.equals(service.module.getValue(), serviceName, true))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("服务不存在"));
    }
}