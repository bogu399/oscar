package com.oscar.crud;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oscar.crud.model.Calcado;
import com.oscar.crud.repository.CalcadoRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrudApplicationTests {

	@Autowired
	CalcadoRepository calcadoRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void insertTest() throws ParseException {
		Calcado c = new Calcado();
		c.setId(1);
		c.setTamanho(29);
		c.setCategoria("infantil");
		c.setCor("branco");
		c.setPreco(45.69);
		c.setMarca("Le Foo");
		c.setQuantEstoque(50);
		c.setDescricao("Yaoundé");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataCadastro = formato.parse("23/04/2019");
		c.setDataCadastro(dataCadastro);

		calcadoRepository.save(c);
		assertNotNull(calcadoRepository.findById(1).get());

	}

}
