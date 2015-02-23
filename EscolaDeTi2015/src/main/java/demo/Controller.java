package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class Controller {
	@RequestMapping(value="/mensagem",method=RequestMethod.GET)
	public String criarMensagem()
	{
		return "TESTE DE METODO GET";
	}
	
	@RequestMapping(value="/mensagem2",method=RequestMethod.GET)
	public String criarMensagem2()
	{
		return "teste de metodoto get 2";
	}
}
