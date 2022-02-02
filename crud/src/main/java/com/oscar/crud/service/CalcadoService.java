package com.oscar.crud.service;

import java.util.Date;
import java.util.Optional;
import java.util.List;

import com.oscar.crud.model.Calcado;
import com.oscar.crud.repository.CalcadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Regras do Negócio
 * Service
 * banco em memória H2
 */

@Service
public class CalcadoService {
    
    @Autowired
    CalcadoRepository calcadoRepository;
    
    /**
     * Salvar no banco
     */
    @PostMapping
    public String save(@RequestBody Calcado calcado) {
        calcadoRepository.save(calcado);
        return "Calçado salvo com sucesso";
    }

    /**
     * Métodos para Atualizar dados do banco
     * @param id
     * @param nomeNoBanco
     */
    @Transactional
    @PutMapping
    public String updateTamanho(@RequestParam(required = true) int id, @RequestParam(required = true) int tamanho) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateTamanho(id, tamanho);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve seu tamanho atualizado de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updateCategoria(@RequestParam(required = true) int id, @RequestParam(required = true) String categoria) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateCategoria(id, categoria);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve sua categoria atualizada de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updateCor(@RequestParam(required = true) int id, @RequestParam(required = true) String cor) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateCor(id, cor);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve sua cor atualizada de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updatePreco(@RequestParam(required = true) int id, @RequestParam(required = true) double preco) {
        int pre = search(id).getTamanho();
        calcadoRepository.updatePreco(id, preco);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve seu preço atualizado de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updateMarca(@RequestParam(required = true) int id, @RequestParam(required = true) String marca) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateMarca(id, marca);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve sua marca atualizada de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updateDataCadastro(@RequestParam(required = true) int id, @RequestParam(required = true) Date dataCadastro) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateDataCadastro(id, dataCadastro);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve sua data de cadastro atualizada de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updateQuantEstoque(@RequestParam(required = true) int id, @RequestParam(required = true) int quantEstoque) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateQuantEstoque(id, quantEstoque);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve seu preço atualizado de " + pre + " para " + pos;
    }

    @Transactional
    @PutMapping
    public String updateDescricao(@RequestParam(required = true) int id, @RequestParam(required = true) String descricao) {
        int pre = search(id).getTamanho();
        calcadoRepository.updateDescricao(id, descricao);
        int cod = search(id).getId();
        int pos = search(id).getId();
        return "Calçado " + cod + " teve seu preço atualizado de " + pre + " para " + pos;
    }

    /**
     * Exclusão do banco
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public String delete(@RequestParam(required = true) int id) {
        Optional<Calcado> optional = calcadoRepository.findById(id);
		if (optional.isEmpty())
			return "ID inexistente";
		int cod = search(id).getId();
		calcadoRepository.deleteById(id);
		return "Calçado de código " + cod + " foi excluído com sucesso";
    }

    /**
     * Pesquisa no banco pelo código
     * @param id
     * @return
     */
    @GetMapping
    public Calcado search(int id) {
        Optional<Calcado> optional = calcadoRepository.findById(id);
		if(optional.isEmpty())
			return null;
		return optional.get();
    }

    /**
     * Métodos de retorno de dados geral e por atributos do banco
     * @return
     */
    @GetMapping
	public List<Calcado> findAll() {
        return calcadoRepository.findAll();
	}

    
    @GetMapping
    public List<Calcado> findByTamanho(Integer tamanho) {
		return calcadoRepository.findByTamanho(tamanho);
    }

    @GetMapping
    public List<Calcado> findByTamanhoAndCategoria(Integer tamanho, String categoria) {
        return calcadoRepository.findByTamanhoAndCategoria(tamanho, categoria);
    }

    @GetMapping
    public List<Calcado> findByCategoria(String categoria) {
        return calcadoRepository.findByCategoria(categoria);
    }

    @GetMapping
    public List<Calcado> findByCor(String cor) {
        return calcadoRepository.findByCor(cor);
    }

    @GetMapping
    public List<Calcado> findByPreco(double preco) {
        return calcadoRepository.findByPreco(preco);
    }

    @GetMapping
    public List<Calcado> findByMarca(String marca) {
        return calcadoRepository.findByMarca(marca);
    }

    @GetMapping
    public List<Calcado> findByDataCadastro(Date dataCadastro) {
        return calcadoRepository.findByDataCadastro(dataCadastro);
    }

    @GetMapping
    public List<Calcado> findByQuantEstoque(int quantEstoque) {
        return calcadoRepository.findByQuantEstoque(quantEstoque);
    }

    @GetMapping
    public List<Calcado> findByDescricao(String descricao) {
        return calcadoRepository.findByDescricao(descricao);
    }
}
