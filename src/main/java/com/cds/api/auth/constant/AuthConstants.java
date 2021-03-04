package com.cds.api.auth.constant;

/**
 * 
 * @Description TODO 填写描述信息
 * @Notes 未填写备注
 * @author liming
 * @Date 2021年2月25日 上午9:55:07
 */
public class AuthConstants {

    /**
     * 默认的处理验证码的url前缀
     */
    public static final String DEFAULT_VALIDATE_CODE_URL_PREFIX = "/oauth/code";
    /**
     * 当请求需要身份认证时，默认跳转的url
     *
     */
    public static final String DEFAULT_UNAUTHENTICATION_URL = "/oauth/authentication/require";
    /**
     * 默认的用户名密码登录请求处理url
     */
    public static final String DEFAULT_LOGIN_PROCESSING_URL_FORM = "/oauth/authentication/form";
    /**
     * 验证图片验证码时，http请求中默认的携带图片验证码信息的参数的名称
     */
    public static final String DEFAULT_PARAMETER_NAME_CODE_IMAGE = "imageCode";
    /**
     * 验证短信验证码时，http请求中默认的携带短信验证码信息的参数的名称
     */
    public static final String DEFAULT_PARAMETER_NAME_CODE_SMS = "smsCode";
    /**
     * 发送短信验证码 或 验证短信验证码时，传递手机号的参数的名称
     */
    public static final String DEFAULT_PARAMETER_NAME_MOBILE = "mobile";

    /**
     * 编码
     */
    public static final String UTF8 = "UTF-8";

    /**
     * JSON 资源
     */
    public static final String CONTENT_TYPE = "application/json; charset=utf-8";

    /**
     * 前缀
     */
    public static final String PREFIX = "oauth_";
    /**
     * 项目的license
     */
    public static final String LICENSE = "authentication by cds";

    /**
     * 基础角色
     */
    public static final String BASE_ROLE = "ROLE_USER";
    /**
     * 授权码模式
     */
    public static final String AUTHORIZATION_CODE = "authorization_code";
    /**
     * 密码模式
     */
    public static final String PASSWORD = "password";
    /**
     * 刷新token
     */
    public static final String REFRESH_TOKEN = "refresh_token";

    /**
     * oauth token
     */
    public static final String OAUTH_TOKEN_URL = "/oauth/token";

    /**
     * token-uservo
     */
    public static final String TOKEN_USER_DETAIL = "token-user-detail";

    /**
     * 手机登录URL
     */
    public static final String MOBILE_TOKEN_URL = "/oauth/mobile/token";
    /**
     * 手机号的处理验证码的url前缀
     */
    public static final String MOBILE_VALIDATE_CODE_URL_PREFIX = "/smsCode";

    // /**
    // * sys_oauth_client_details 表的字段，不包括client_id、client_secret
    // */
    // public static final String CLIENT_FIELDS = "client_id, client_secret, resource_ids, scope, "
    // + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
    // + "refresh_token_validity, additional_information, autoapprove";
    //
    // /**
    // * JdbcClientDetailsService 查询语句
    // */
    // public static final String BASE_FIND_STATEMENT = "select " + CLIENT_FIELDS + " from oauth_client_details";
    //
    // /**
    // * 默认的查询语句
    // */
    // public static final String DEFAULT_FIND_STATEMENT = BASE_FIND_STATEMENT + " order by client_id";
    //
    // /**
    // * 按条件client_id 查询
    // */
    // public static final String DEFAULT_SELECT_STATEMENT = BASE_FIND_STATEMENT + " where client_id = ?";

}
