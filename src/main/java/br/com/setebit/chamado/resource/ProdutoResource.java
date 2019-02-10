package br.com.setebit.chamado.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.chamado.model.entity.Produto;
import br.com.setebit.chamado.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600)
@RestController
@RequestMapping("/produto/")
@Api(value = "/produto/", description = "status Profile", produces = "application/json")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;

	@ApiOperation(value = "Show Greeting Message")
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public List<Produto> findAll() {
		return service.findAll();
	}

	@ApiOperation(value = "Create a new person")
	@ResponseBody
	@RequestMapping(value = "save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Produto create(@RequestBody Produto entity) {
		return service.save(entity);
	}

}