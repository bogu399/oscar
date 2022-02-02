package com.oscar.crud.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import com.oscar.crud.model.Calcado;
import com.oscar.crud.service.CalcadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller da API REST para usuário
 * Em @apiNote tem um link de exemplificação
 */

@RestController
@RequestMapping("/oscar")
public class CalcadoController {
    
    @Autowired
    CalcadoService calcadoService;

    /**
     * Salvar
     * @apiNote "http://localhost:3000/oscar"
     */
    @PostMapping
    public String save(@RequestBody Calcado calcado) {
        calcadoService.save(calcado);
        return "Salvo com sucesso";
    }

    /**
     * Apagar
     * @apiNote "http://localhost:3000/oscar/delete?id={id}"
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public String delete(@RequestParam(required = true) int id) {
		return calcadoService.delete(id);
	}

    /**
     * Atualizar
     * @apiNote "http://localhost:3000/oscar/update?id={id}&componente=tamanho&value={value}"
     * @param id
     * @param componente
     * @param value
     * @return
     * @throws ParseException
     */
    @Transactional
    @PutMapping("/update")
    public String updateTamanho(@RequestParam(required = true) Integer id,
                              @RequestParam(required = true) String componente,
                              @RequestParam(required = true) String value) throws ParseException {
        switch(componente){
            case "tamanho":
                int tamanho = Integer.parseInt(value);
                calcadoService.updateTamanho(id, tamanho);
                return id + " Atualizado";
            case "categoria":
                String categoria = value;
                calcadoService.updateCategoria(id, categoria);
                return id + " Atualizado";
            case "cor":
                String cor = value;
                calcadoService.updateCor(id, cor);
                return id + " Atualizado";
            case "preco":
                double preco = Double.parseDouble(value);
                calcadoService.updatePreco(id, preco);
                return id + " Atualizado";
            case "marca":
                String marca = value;
                calcadoService.updateMarca(id, marca);
                return id + " Atualizado";
            case "dataCadastro":
                Date dataCadastro = new SimpleDateFormat("yyyy-MM-dd").parse(value);
                calcadoService.updateDataCadastro(id, dataCadastro);
                return id + " Atualizado";
            case "quantEstoque":
                int quantEstoque = Integer.parseInt(value);
                calcadoService.updateQuantEstoque(id, quantEstoque);
                return id + " Atualizado";
            case "descricao":
                String descricao = value;
                calcadoService.updateDescricao(id, descricao);
                return id + " Atualizado";
            default:
                return "Parâmetro inexistente no banco";

        }
    }

    /**
     * Recuperar dados com filtros
     * @apiNote "http://localhost:3000/oscar?tamanho={value}"
     * @param tamanho
     * @param categoria
     * @param cor
     * @param preco
     * @param marca
     * @param dataCadastro
     * @param quantEstoque
     * @param descricao
     * @return
     */
    @SuppressWarnings({ "unused" })
    @GetMapping
    public List<Calcado> accessing(
        @RequestParam(required=false) Integer tamanho,
        @RequestParam(required=false) String categoria,
        @RequestParam(required=false) String cor,
        @RequestParam(required=false) Double preco,
        @RequestParam(required=false) String marca,
        @RequestParam(required=false) Date dataCadastro,
        @RequestParam(required=false) Integer quantEstoque,
        @RequestParam(required=false) String descricao
    ) {
        List<Calcado> lista;
        if (tamanho != null) {
			lista = calcadoService.findByTamanho(tamanho);
		} else if (tamanho != null && categoria != null) {
			lista = calcadoService.findByTamanhoAndCategoria(tamanho, categoria);
		} else if (categoria != null) {
			lista = calcadoService.findByCategoria(categoria);
		} else if (cor != null) {
			lista = calcadoService.findByCor(cor);
		} else if (preco != null) {
			lista = calcadoService.findByPreco(preco);
		} else if (marca != null) {
			lista = calcadoService.findByMarca(marca);
		} else if (dataCadastro != null) {
			lista = calcadoService.findByDataCadastro(dataCadastro);
		} else if (quantEstoque != null) {
			lista = calcadoService.findByQuantEstoque(quantEstoque);
		} else if (descricao != null) {
			lista = calcadoService.findByDescricao(descricao);
        } else {
			lista = calcadoService.findAll();
		}
        return lista;
    }

    /**
     * Recuperar pelo código do calçado
     * @apiNote "http://localhost:3000/oscar/search?id={id}"
     * @param id
     * @return
     */
    @GetMapping("/search")
    public Calcado getById(@RequestParam(required = true) int id) {
        return calcadoService.search(id);
    }


}
