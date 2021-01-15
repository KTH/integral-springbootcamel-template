package se.kth.integral.springbootcamel.template;

import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpringBootCamelTemplateRoute extends EndpointRouteBuilder {

  private final SpringBootCamelTemplateProperties props;

  @Override
  public void configure() throws Exception {
    from(timer("template").fixedRate(true).period(1_000))
        .setBody(constant("Hello World!"))
        .to(stream("out"));
  }
}
