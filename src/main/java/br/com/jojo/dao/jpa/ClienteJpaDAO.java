/**
 * 
 */
package br.com.jojo.dao.jpa;

import br.com.jojo.dao.generic.jpa.GenericJpaDAO;
import br.com.jojo.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
