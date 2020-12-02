package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class})
@ComponentScan(basePackages = {
		"org.zerock.mapper",
		"org.zerock.service",
		"org.zerock.controller"})
public class RootConfig {

}
