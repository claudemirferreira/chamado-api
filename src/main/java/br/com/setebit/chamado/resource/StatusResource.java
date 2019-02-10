package br.com.setebit.chamado.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.chamado.model.entity.Status;
import br.com.setebit.chamado.service.StatusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/status/")
//@Api(value = "/status", description = "status Profile", produces = "application/json")
public class StatusResource {

	@Autowired
	private StatusService service;

	@ApiOperation(value = "Show Greeting Message")
	@ResponseBody
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public List<Status> findAll() {
		return service.findAll();
	}

	@ApiOperation(value = "Create a new person")
	@ResponseBody
	@RequestMapping(value = "/save",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Status create(@RequestBody Status entity) {
		return service.save(entity);
	}

}
