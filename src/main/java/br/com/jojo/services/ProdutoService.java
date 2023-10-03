/**
 * 
 */
package br.com.jojo.services;

import br.com.jojo.dao.IProdutoDAO;
import br.com.jojo.domain.Produto;
import br.com.jojo.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
