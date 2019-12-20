package one.genchev.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    public void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.inMemoryAuthentication().withUser("test")
//                .password("{noop}test123").authorities("ROLE_USER");
//    }


//    @Autowired
//    DataSource dataSource;

//    @Override
//    public void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//
//        auth.jdbcAuthentication()
//                .dataSource(dataSource);
//    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .withDefaultSchema()
//                .withUser(User.withUsername("user")
//                        .password(passwordEncoder().encode("pass"))
//                        .roles("USER"));
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity)
//            throws Exception {
////        httpSecurity.authorizeRequests()
////                .antMatchers("/h2-console/**")
////                .permitAll()
////                .anyRequest()
////                .authenticated()
////                .and()
////                .formLogin();
//
//        httpSecurity.csrf()
//                .ignoringAntMatchers("/h2-console/**");
//        httpSecurity.headers()
//                .frameOptions()
//                .sameOrigin()
//                .and()
//                .rememberMe().key("verySecretKey").tokenValiditySeconds();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        return new BCryptPasswordEncoder();
//    }
}
