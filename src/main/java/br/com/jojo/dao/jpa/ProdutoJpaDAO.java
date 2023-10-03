/**
 * 
 */
package br.com.jojo.dao.jpa;

import br.com.jojo.dao.generic.jpa.GenericJpaDAO;
import br.com.jojo.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
