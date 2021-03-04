/**
 * @Project auth-api
 * @Package com.cds.api.auth.api
 * @Class UserPasswordVO.java
 * @Date 2021年2月27日 下午6:56:43
 * @Copyright (c) 2021 CandleDrums.com All Right Reserved.
 */
package com.cds.api.auth.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

/**
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date 2021年2月27日 下午6:56:43
 */
@Data
public class UserAuthVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userNum;
    private String password;
    private String username;
    private String mobile;
    // 是否可用
    private Boolean enabled;
    // 账号是否未过期
    private Boolean accountNonExpired;
    // 账号是否被锁定
    private Boolean accountNonLocked;
    // 密码是否未过期
    private Boolean credentialsNonExpired;
    private Date updateDate;
    private Date createDate;
    private Collection<? extends GrantedAuthority> authorities;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (authorities == null) {
            return new ArrayList<>();
        }
        return authorities;
    }

}