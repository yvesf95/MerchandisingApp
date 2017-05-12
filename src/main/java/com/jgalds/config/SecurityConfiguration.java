package com.jgalds.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Admin on 5/7/2017.
 */

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private AccountUserDetailsService userDetailsService;

    @Autowired
    private RoleBasedSuccessHandler roleBasedSuccessHandler;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()

                .antMatchers("/admin/**")
                    .access("hasRole('ADMIN')")

                .antMatchers("/members/**")
                    .access("hasRole('MEMBER') or hasRole('ADMIN')")

                .antMatchers("/student/**")
                    .access("hasRole('STUDENT') or hasRole('MEMBER') or hasRole('ADMIN')")

                .and().formLogin()
                    .loginPage("/login")
                    .usernameParameter("username")
                    .passwordParameter("password")
                    .successHandler(roleBasedSuccessHandler)

                .and().csrf().disable()

                .logout()

                .and()
                    .exceptionHandling()
                    .accessDeniedPage("/error403");
    }
}
