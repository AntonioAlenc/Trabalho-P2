
package Controllers;

import dto.DTO;
import java.util.List;

public interface Controller {

    public void salvar(DTO dto) throws Exception;

    public void remover(DTO dto);

    public String[] getTitulosColunas();//colunas matriz

    public String[] getFiltros();//tipos de filtros

    public Object[] getDados(DTO dto);//array matriz

    public List getListaDados();//lista de dados 