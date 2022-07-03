/*
- Os atributos desse modelo foram gerados automaticamente pelo site
jsonscheme2pojo.org, para isso, usamos o JSON de retorna da API DO viaCEP.

@see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
@see <a href="https://viacep.com.br">ViaCEP</a>
@see <a href="http://www.cidades.ibge.gov.br/">Origem IBGE</a>
@see <a href="https://portal.fazenda.sp.gov.br/servicos/gia/Downloads/pre_formatado_ngia_v0210_gia0801.pdf">Origem GIA/ICMS (somente SP)</a>
@see <a href="https://www.anatel.gov.br/legislacao/resolucoes/16-2001/383-resolucao-263">Origem DDD</a>
@see <a href="http://www.tesourotransparente.gov.br/ckan/dataset/lista-de-municipios-do-siafi">Origem SIAFI</a>

 */

package main.java.com.spring.desafiotecnicogft.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
}

