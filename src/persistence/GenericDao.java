package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Cliente;
import entity.Produto;
import entity.Usuario;

public class GenericDao extends Dao {
	private List listaProdutos;
	private List listaProdutosPorTipo;
	private List listaUsuarios; 
	public String gravarUsuario(Usuario usu) {

		try {
			abrirConexao();
			stmt = con.prepareStatement("insert into usuario (login, senha, nome, tipo) values (?,?,?,?)");
			stmt.setString(1, usu.getLogin());
			stmt.setString(2, usu.getSenha());
			stmt.setString(3, usu.getNome());
			stmt.setString(4, usu.getTipoUsuario());
			stmt.execute();
			fecharConexao();
			System.out.println("Usuario salvo com sucesso!!");
			
			return "Usuario salvo com sucesso!!";
		} catch (SQLException e) {
			System.out.println("Falha ao gravar usuario: " + e.getMessage());
			fecharConexao();
			e.printStackTrace();
			return "Falha ao gravar usuario: " + e.getMessage();
		}

	}

	public Usuario consultarUsuarioPorId(Integer id) {
		abrirConexao();
		Usuario usu = null;
		try {
			stmt = con.prepareStatement("select * from usuario where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next()) {
				usu = new Usuario();
				usu.setIdUsuario(rs.getInt("id"));
				usu.setLogin(rs.getString("login"));
				usu.setNome(rs.getString("nome"));
				usu.setTipoUsuario(rs.getString("tipo"));
			}

			return usu;

		} catch (SQLException e) {
			fecharConexao();
			e.printStackTrace();
			return usu;
		}

	}

	public List<Usuario> consultarTodosUsuarios() {
		abrirConexao();
		Usuario usu = null;
		ArrayList<Usuario> listaUsu = new ArrayList<Usuario>();
		try {
			stmt = con.prepareStatement("select * from usuario");
			rs = stmt.executeQuery();

			while (rs.next()) {
				usu = new Usuario();
				usu.setIdUsuario(rs.getInt("id"));
				usu.setLogin(rs.getString("login"));
				usu.setNome(rs.getString("nome"));
				usu.setTipoUsuario(rs.getString("tipo"));

				listaUsu.add(usu);
			}

		} catch (Exception e) {
			System.out.println("Erro ao gerar lista de usuarios: " + e.getMessage());
		}
		return listaUsu;
	}
	
	public List<Usuario> getListaUsuarios(){
		listaUsuarios = new GenericDao().consultarTodosUsuarios();
		return listaUsuarios;
	}
	
	public String gravarCliente(Cliente cli) {

		try {
			abrirConexao();
			stmt = con.prepareStatement("insert into cliente (nome, endereco, email, telefone, dtNasc) values (?,?,?,?,?)");
			stmt.setString(1, cli.getNome());
			stmt.setString(2, cli.getEndereco());
			stmt.setString(3, cli.getEmail());
			stmt.setString(4, cli.getTelefone());
			stmt.setString(4, cli.getDataNascimento());
			stmt.execute();
			fecharConexao();
			System.out.println("Cliente salvo com sucesso!!");
			return "Cliente salvo com sucesso!!";
		} catch (SQLException e) {
			System.out.println("Falha ao gravar cliente: " + e.getMessage());
			fecharConexao();
			e.printStackTrace();
			return "Falha ao gravar cliente: " + e.getMessage();
		}

	}
	
	public Cliente consultarClientePorId(Integer id) {
		abrirConexao();
		Cliente cli = null;
		try {
			stmt = con.prepareStatement("select * from cliente where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next()) {
				cli = new Cliente();
				cli.setIdCliente(rs.getInt("id"));
				cli.setNome(rs.getString("nome"));
				cli.setEndereco(rs.getString("endereco"));
				cli.setEmail(rs.getString("email"));
				cli.setDataNascimento(rs.getString("dtnasc"));
				
			}

			return cli;

		} catch (SQLException e) {
			fecharConexao();
			e.printStackTrace();
			return cli;
		}

	}

	public List<Cliente> consultarTodosClientes() {
		abrirConexao();
		Cliente cli= null;
		ArrayList<Cliente> listaCli = new ArrayList<Cliente>();
		try {
			stmt = con.prepareStatement("select * from cliente");
			rs = stmt.executeQuery();

			while (rs.next()) {
				cli = new Cliente();
				cli.setIdCliente(rs.getInt("id"));
				cli.setNome(rs.getString("nome"));
				cli.setEndereco(rs.getString("endereco"));
				cli.setEmail(rs.getString("email"));
				cli.setDataNascimento(rs.getString("dtnasc"));
				
				listaCli.add(cli);
			}

		} catch (Exception e) {
			System.out.println("Erro ao gerar lista de usuarios: " + e.getMessage());
		}
		return listaCli;
	}
	
	public String gravarProduto(Produto prod) {

		try {
			abrirConexao();
			stmt = con.prepareStatement("insert into produto (nome, tipo, descricao, valor) values (?,?,?,?)");
			stmt.setString(1, prod.getNomeProduto());
			stmt.setString(2, prod.getTipoProduto());
			stmt.setString(3, prod.getDescricaoProduto());
			stmt.setDouble(4, prod.getValor());
			stmt.execute();
			fecharConexao();

			System.out.println("Produto salvo com sucesso!!");
			
			return "Produto salvo com sucesso!!";
			
		} catch (SQLException e) {
			System.out.println("Falha ao gravar Produto: " + e.getMessage());
			fecharConexao();
			e.printStackTrace();
			
			return "Falha ao gravar Produto: " + e.getMessage();
		}

	}
	
	public Produto consultarProdutoPorId(Integer id) {
		abrirConexao();
		Produto prod = null;
		try {
			stmt = con.prepareStatement("select * from produto where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next()) {
				prod = new Produto();
				prod.setIdProduto(rs.getInt("id"));
				prod.setNomeProduto(rs.getString("nome"));
				prod.setTipoProduto(rs.getString("tipo"));
				prod.setValor(rs.getDouble("valor"));
				prod.setDescricaoProduto(rs.getString("descricao"));
				
			}

			return prod;

		} catch (SQLException e) {
			fecharConexao();
			e.printStackTrace();
			return null;
		}

	}
	

	public List<Produto> consultarTodosProdutosPorTipo(String tipo) {
		abrirConexao();
		Produto prod= null;
		ArrayList<Produto> listaProdPorTipo = new ArrayList<Produto>();
		try {
			stmt = con.prepareStatement("select * from produto where tipo = ?");
			stmt.setString(1, tipo);
			rs = stmt.executeQuery();

			while (rs.next()) {
				prod = new Produto();
				prod.setIdProduto(rs.getInt("id"));
				prod.setNomeProduto(rs.getString("nome"));
				prod.setTipoProduto(rs.getString("tipo"));
				prod.setValor(rs.getDouble("valor"));
				prod.setDescricaoProduto(rs.getString("descricao"));
				
				listaProdPorTipo.add(prod);
			}

		} catch (Exception e) {
			System.out.println("Erro ao gerar lista de usuarios: " + e.getMessage());
		}
		return listaProdPorTipo;
	}
	
	public List<Produto> getListaProdutosPorTipo(){
		listaProdutosPorTipo = new GenericDao().consultarTodosProdutosPorTipo(tipo);
		return listaProdutosPorTipo;
	}
	
	public List<Produto> consultarTodosProdutos() {
		abrirConexao();
		Produto prod= null;
		ArrayList<Produto> listaProd = new ArrayList<Produto>();
		try {
			stmt = con.prepareStatement("select * from produto");
			rs = stmt.executeQuery();

			while (rs.next()) {
				prod = new Produto();
				prod.setIdProduto(rs.getInt("id"));
				prod.setNomeProduto(rs.getString("nome"));
				prod.setTipoProduto(rs.getString("tipo"));
				prod.setValor(rs.getDouble("valor"));
				prod.setDescricaoProduto(rs.getString("descricao"));
				
				listaProd.add(prod);
			}

		} catch (Exception e) {
			System.out.println("Erro ao gerar lista de usuarios: " + e.getMessage());
		}
		return listaProd;
	}
	
	public List<Produto> getListaProdutos(){
		listaProdutos = new GenericDao().consultarTodosProdutos();
		return listaProdutos;
	}
}
