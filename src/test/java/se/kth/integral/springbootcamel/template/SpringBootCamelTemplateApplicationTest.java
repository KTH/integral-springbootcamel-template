package se.kth.integral.springbootcamel.template;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.apache.camel.test.spring.junit5.MockEndpoints;
import org.apache.camel.test.spring.junit5.MockEndpointsAndSkip;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CamelSpringBootTest
@MockEndpoints("stream:out")
@MockEndpointsAndSkip("timer:*")
class SpringBootCamelTemplateApplicationTest {

  @Produce("mock:timer:template")
  private ProducerTemplate timer;

  @EndpointInject("mock:stream:out")
  private MockEndpoint streamOut;

  @Test
  void outputIsHelloWorld() throws InterruptedException {
    streamOut.expectedBodiesReceived("Hello World!");
    timer.sendBody(null);
    streamOut.assertIsSatisfied();
  }
}
