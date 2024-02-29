package projeto.rest.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PesquisarListaTest {
	
	Response response;
	
    @Test
	public void validarLista() {
    	response = RestAssured.get("https://reqres.in/api/users?page=2");
    	assertEquals(response.getStatusCode(), 200);
	}

}
	