package projeto.rest.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyTest {
	
	Response response;
	
    @Test
	public void validarLista() {
    	response = RestAssured.get("https://reqres.in/api/users?page=2");
    	assertEquals(200, response.getStatusCode());
	}

}
