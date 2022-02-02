package com.oscar.crud.repository;

import java.util.Date;
import java.util.List;

import com.oscar.crud.model.Calcado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository para ligação do banco com aplicação e métodos para retornos com filtros do banco e métodos para atualizações no banco
 */

@Repository
public interface CalcadoRepository extends JpaRepository<Calcado, Integer>{
    
    public List<Calcado> findByTamanho(int tamanho);
    public List<Calcado> findByCategoria(String categoria);
    public List<Calcado> findByCor(String cor);
    public List<Calcado> findByPreco(double preco);
    public List<Calcado> findByMarca(String marca);
    public List<Calcado> findByDataCadastro(Date dataCadastro);
    public List<Calcado> findByQuantEstoque(int quantEstoque);
    public List<Calcado> findByDescricao(String descricao);

    public List<Calcado> findByTamanhoAndCategoria(int tamanho, String categoria);

    @Modifying
    @Query(value = "update calcado set calcado.tamanho = :tamanho where calcado.id = :id", nativeQuery = true)
    public void updateTamanho(@Param(value = "id") int id, @Param(value = "tamanho") int tamanho);

    @Modifying
    @Query(value = "update calcado set calcado.categoria = :categoria where calcado.id = :id", nativeQuery = true)
    public void updateCategoria(@Param(value = "id") int id, @Param(value = "categoria") String categoria);

    @Modifying
    @Query(value = "update calcado set calcado.cor = :cor where calcado.id = :id", nativeQuery = true)
    public void updateCor(@Param(value = "id") int id, @Param(value = "cor") String cor);

    @Modifying
    @Query(value = "update calcado set calcado.preco = :preco where calcado.id = :id", nativeQuery = true)
    public void updatePreco(@Param(value = "id") int id, @Param(value = "preco") double preco);

    @Modifying
    @Query(value = "update calcado set calcado.marca = :marca where calcado.id = :id", nativeQuery = true)
    public void updateMarca(@Param(value = "id") int id, @Param(value = "marca") String marca);

    @Modifying
    @Query(value = "update calcado set calcado.data_cadastro = :dataCadastro where calcado.id = :id", nativeQuery = true)
    public void updateDataCadastro(@Param(value = "id") int id, @Param(value = "dataCadastro") Date dataCadastro);

    @Modifying
    @Query(value = "update calcado set calcado.quant_estoque = :quantEstoque where calcado.id = :id", nativeQuery = true)
    public void updateQuantEstoque(@Param(value = "id") int id, @Param(value = "quantEstoque") int quantEstoque);

    @Modifying
    @Query(value = "update calcado set calcado.descricao = :descricao where calcado.id = :id", nativeQuery = true)
    public void updateDescricao(@Param(value = "id") int id, @Param(value = "descricao") String descricao);
}
