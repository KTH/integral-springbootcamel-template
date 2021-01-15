package se.kth.integral.springbootcamel.template;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("kth.template")
public class SpringBootCamelTemplateProperties {
  private String message;
}
