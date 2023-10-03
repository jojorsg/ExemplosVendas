/**
 * 
 */
package br.com.jojo.dao;

import br.com.jojo.dao.generic.IGenericDAO;
import br.com.jojo.domain.Venda;
import br.com.jojo.exceptions.DAOException;
import br.com.jojo.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
