package demo;

import io.undertow.attribute.RequestMethodAttribute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/cadastro")
public class Controller {
	
	@RequestMapping(value="/mensagem",method=RequestMethod.GET)
	public String criarMensagem()
	{
		return "TESTE DE METODO GET";
	}
	
	@RequestMapping (value="/alunos/{ra}",method= RequestMethod.GET)
	public @ResponseBody Aluno getAluno(@PathVariable Integer ra){
		Aluno novo = new Aluno("Aluno Jr." + System.currentTimeMillis(),ra);
		return novo;
	}
	
	@RequestMapping(value="/alunos",method=RequestMethod.POST)
	public String criarAluno(@RequestBody Aluno novo) {
		return "Aluno de nome ["+novo.getNome()+"] recebido com imenso sucesso";
		
	}
	
}

