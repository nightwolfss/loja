package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produto;
import entity.Usuario;
import persistence.GenericDao;

/**
 * Servlet implementation class Controle
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GenericDao gd =  new GenericDao();
		
		String var = request.getParameter("cmd");
		
		if(var.equalsIgnoreCase("consultar")) {
			Usuario usuario = gd.consultarUsuarioPorId(Integer.parseInt(request.getParameter("id")));
			System.out.println(usuario);
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		if(var.equalsIgnoreCase("cadusuario")) {
			Usuario usuario = new Usuario();
			usuario.setNome(request.getParameter("nome"));
			usuario.setLogin(request.getParameter("login"));
			usuario.setSenha(request.getParameter("senha"));
			usuario.setTipoUsuario(request.getParameter("tipo"));
			
			String msg = gd.gravarUsuario(usuario);
			
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("usuarios.jsp").forward(request, response);
		}
		
		if(var.equalsIgnoreCase("cadproduto")) {
			Produto produto = new Produto();
			produto.setNomeProduto(request.getParameter("nome"));
			produto.setTipoProduto(request.getParameter("tipo"));
			produto.setValor(Double.parseDouble(request.getParameter("valor")));
			produto.setDescricaoProduto(request.getParameter("descricao"));
			
			String msg = gd.gravarProduto(produto);
			
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("produtos.jsp").forward(request, response);
		}
		
	}

}
