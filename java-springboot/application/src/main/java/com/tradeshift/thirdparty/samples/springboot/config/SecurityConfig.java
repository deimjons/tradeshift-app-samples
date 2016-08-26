package com.tradeshift.thirdparty.samples.springboot.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     * Allow to change security configuration
     *
     * Disable default security configuration
     * Disable csrf protection
     * Disable default header frame options
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http
                .httpBasic().disable().csrf().disable()
                .headers().frameOptions().disable();

    }

}