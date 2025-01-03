package com.atcumt.gpt.api.config;

import com.atcumt.common.config.CommonFeignConfiguration;
import com.atcumt.gpt.api.client.fallback.AuthClientFallback;
import com.atcumt.gpt.api.client.fallback.UserClientFallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CommonFeignConfiguration.class)
public class FeignConfiguration {
    @Bean
    UserClientFallback userClientFallback() {
        return new UserClientFallback();
    }

    @Bean
    public AuthClientFallback authClientFallback() {
        return new AuthClientFallback();
    }
}
