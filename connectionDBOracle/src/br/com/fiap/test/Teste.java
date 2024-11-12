package br.com.fiap.test;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();

		Usuario kayky = new Usuario("kayky", "kayky@gmail.com");
		Usuario mateus = new Usuario("mateus", "mateus@gmail.com");
		Usuario maria = new Usuario("maria", "maria@gmail.com");

//		dao.insert(kayky);
//		dao.insert(mateus);
//		dao.insert(maria);

		dao.delete(2);

		Usuario kaykyUpdated = dao.selectById(81);
		kaykyUpdated.setNome("Kayky Gama");
		kaykyUpdated.setEmail("kaykyGama@gmail.com");
		dao.update(kaykyUpdated);

		List<Usuario> lista = new ArrayList<Usuario>();
		lista = dao.selectAll();

		for (Usuario usuario : lista) {
			System.out.println("Id " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Email: " + usuario.getEmail());
			System.out.println("Data de cadastro: " + usuario.getDataCadastro());
		}
	}

}
