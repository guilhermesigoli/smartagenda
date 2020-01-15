package br.com.smartagenda.config;

public class SecurityConstants {
    static final String SECRET = "smartAgenda";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/login/acessar";
    static final long EXPIRATION_TIME = 86400000L;
}
