package com.cds.api.auth.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.expression.OAuth2WebSecurityExpressionHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * 认证服务bean配置
 *
 * @author ykl
 * @version V1.0
 * @create 2018-08-21 上午10:36
 **/
@Configuration
public class AuthSecurityBeanConfig {

    //jwt signing
    public static String JWT_SIGNING_KEY = "youwe";

    /**
     * resourceServerTokenServices 类的实例，用来实现令牌服务。
     *
     * @return
     */

    /**
     * 令牌解析（JWT 对称加密）
     * 资源服务器和授权服务器不在同一个应用，
     * 则需告诉资源服务器令牌如何存储与解析，
     * 并与授权服务器使用相同的密钥进行解密
     */
    //jwt 令牌
    @Bean
    public TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * 与授权服务器使用共同的密钥进行解析 jwt 拖车
     *
     * @return
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        //密签
        converter.setSigningKey(JWT_SIGNING_KEY);
        return converter;
    }

    //密码处理
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 配置解决 spring-security-oauth问题
     * https://github.com/spring-projects/spring-security-oauth/issues/730
     *
     * @param applicationContext ApplicationContext
     * @return OAuth2WebSecurityExpressionHandler
     */
    @Bean
    public OAuth2WebSecurityExpressionHandler oAuth2WebSecurityExpressionHandler(ApplicationContext applicationContext) {
        OAuth2WebSecurityExpressionHandler expressionHandler = new OAuth2WebSecurityExpressionHandler();
        expressionHandler.setApplicationContext(applicationContext);
        return expressionHandler;
    }

}
