package com.changgou.oauth.util;

import java.io.Serializable;

/**
 *
 *
 * @param null
 * @author yuanqi
 * @date 2020-03-06 17:13 
 * @return
 */
public class AuthToken implements Serializable{

    //令牌信息 jwt
    String accessToken;
    //刷新token(refresh_token)
    String refreshToken;
    //jwt短令牌
    String jti;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }
}