package principal;

import java.text.SimpleDateFormat;
import java.util.Date;

import dominio.Categoria;
import repositorio.CategoriaRepositorio;

public class Programa {

	public static void main(String[] args) {
		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
		//categoriaServicoInserir(repo);
		//categoriaServicoListar(repo);
		
		//categoriaServicoExcluir(repo);
		//categoriaServicoListar(repo);
		
		//categoriaServicoObter(repo);
		//repo.dispose();
		
		categoriaServicoAlterar(repo, 20);
		categoriaServicoObter(repo, 20);
		repo.dispose();
	}

	private static void categoriaServicoListar(CategoriaRepositorio repo) {	
		for (Categoria cat : repo.readAll()) {
			System.out.println(cat);
		}
	}
	
	private static void categoriaServicoObter(CategoriaRepositorio repo, int id) {	
		Categoria c = repo.read(id);
		System.out.println(c);
		}
	

	private static void categoriaServicoInserir(CategoriaRepositorio repo) {
		Categoria c = new Categoria(null, "teste", new Date());		
		repo.create(c);
		System.out.println(c);
	}
	
	private static void categoriaServicoExcluir(CategoriaRepositorio repo, int id) {
		repo.delete(id);
	}
	private static void categoriaServicoAlterar(CategoriaRepositorio repo, int id) {
	Categoria c = new Categoria(id, "outro Teste", new Date());
	repo.update(c);
	}
}