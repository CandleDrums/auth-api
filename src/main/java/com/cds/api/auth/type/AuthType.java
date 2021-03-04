package com.cds.api.auth.type;

import com.cds.api.auth.constant.AuthConstants;

/**
 * description: 认证方式
 * 
 * @author ykl
 * @date 2018/10/9 下午2:48
 * @version V1.0
 */
public enum AuthType {
    /**
     * 用户名认证
     */
    USERNAME("1", AuthConstants.OAUTH_TOKEN_URL),

    /**
     * 手机号认证
     */
    MOBILE("2", AuthConstants.MOBILE_TOKEN_URL);

    private String value;

    private String url;

    AuthType(String value, String url) {
        this.value = value;
        this.url = url;
    }

    public String getValue() {
        return this.value;
    }

    public String getUrl() {
        return url;
    }

    public boolean equals(AuthType authType) {
        return this.value.equals(authType.getValue());
    }

}
