package pw.twpi.webControl.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	// Not used yet
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/", "/index").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/index").permitAll().and().logout().permitAll();
		
	}
	
	
	
	
}
