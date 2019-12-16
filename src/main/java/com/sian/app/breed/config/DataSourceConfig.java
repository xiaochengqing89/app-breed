package com.sian.app.breed.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@RefreshScope
@Configuration
public class DataSourceConfig implements Serializable {
    private static final long serialVersionUID = -5894999221361851212L;
    /**
     * 用户名
     */
    @Value("${datasource.data-username}")
    private String username;
    /**
     * 密码
     */
    @Value("${datasource.data-password}")
    private String password;
    /**
     * 驱动类名
     */
    @Value("${datasource.driver-class-name}")
    private String driveClassName;
    /**
     * 数据库连接地址
     */
    @Value("${datasource.url}")
    private String url;
}
