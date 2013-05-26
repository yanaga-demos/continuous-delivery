package br.com.yanaga.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.yanaga.Pessoa;

@ManagedBean
public class PessoaController implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa = new Pessoa();

	public void salvar() {
		throw new IllegalArgumentException("Ih, errei...");
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

}
