package com.springsecuritydemo.sprinsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {
 @Bean
 public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();	 
 }
 @Bean
 public UserDetailsService userDetailsService() {
	 UserDetails User1=User.withUsername("munazza")
			 .password(passwordEncoder().encode("munazza@1234"))
			 .roles("ADMIN")
			 .build();
	 UserDetails User2=User.withUsername("habiba")
			 .password(passwordEncoder().encode("habiba@1234"))
			 .roles("ADMIN")
			 .build();
	 return new InMemoryUserDetailsManager(User1,User2);
 }
}
