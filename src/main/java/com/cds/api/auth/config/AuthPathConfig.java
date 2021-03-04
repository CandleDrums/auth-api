/**
 * @Project auth-api
 * @Package com.cds.api.auth.config
 * @Class AuthPathConfig.java
 * @Date 2021年3月4日 上午10:51:13
 * @Copyright (c) 2021 CandleDrums.com All Right Reserved.
 */
package com.cds.api.auth.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date 2021年3月4日 上午10:51:13
 */
@Data
@Configuration
@RefreshScope
// @ConditionalOnExpression("!'${auth.path}'.isEmpty()")
@ConfigurationProperties(prefix = "auth.path")
public class AuthPathConfig {
    private List<String> extSkip = new ArrayList<>();

    private List<String> clients = new ArrayList<>();
    public static final String[] DEFAULT_SKIP_PATH = {"/oauth/**", "/doc.html", "/actuator/**", "/login", "/error",
        "/open/api", "/swagger-resources/**", "/**/swagger-ui.html", "/**/v2/api-docs", "/swagger/api-docs",
        "/**/*.css", "/**/*.js", "/**/*.html", "/webjars/**", "/favicon.ico", "/index.html"};
}
