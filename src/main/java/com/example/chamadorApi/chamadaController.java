package com.example.chamadorApi;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chamadaController {

	@GetMapping("/chamadaApi")
	public Resposta chamada() {
		ClientConfig clientConfig = new ClientConfig(new FiltroHeaders());
		
		String variavelAmbiente = System.getenv("URL_SERVICO");
		
		//String variavelAmbiente = "http://192.168.15.19:8080/retornaDados";
		
		WebTarget target = ClientBuilder.newClient(clientConfig).target(variavelAmbiente);
		
		Response resposta = target.request().get();
		
		return resposta.readEntity(Resposta.class);
	}
}
