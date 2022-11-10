package br.edu.up.micro;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MicroApplicationTests {

  @LocalServerPort
	private int port;

  //Injecão de dependência;
  @Autowired
  private HomeController controller;

  @Test
	public void testeDeInject() throws Exception {
		assertThat(controller).isNotNull();
	}


  @Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testeMicroservico() throws Exception {
    String url = "http://localhost:" + port + "/";
    String texto = "Olá, microserviço!";
		assertThat(this.restTemplate.getForObject(url, String.class)).contains(texto);
	}

}
