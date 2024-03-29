/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jersey.coba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import jersey.service.HelloWorldService;

@Path("/hello")
public class HelloWebapp {
	private static HelloWorldService helloWorldService = new HelloWorldService();
	
	@GET()
	public String hello() {
		return helloWorldService.sayHello();
	}
}