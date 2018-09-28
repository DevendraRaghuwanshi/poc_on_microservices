package com.raml.parser.demo.ramlparserservice;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RamlParserServiceApplication {

	private int maxUploadSizeInMb = 10 * 1024 * 1024;

	public static void main(String[] args) {
		SpringApplication.run(RamlParserServiceApplication.class, args);
	}

	@Bean
	public TomcatServletWebServerFactory tomcatEmbedded() {

		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();

		tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
			if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
				// -1 means unlimited
				((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
			}
		});

		return tomcat;

	}
}
