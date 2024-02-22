package cadenas;

public class Ejercicio17 {
	/**
	 * constante con el inicio de un comentario
	 */
	static final String COMENTARIO_INICIO = "/*";
	/**
	 * constante con el fin de un comentario
	 */
	static final String COMENTARIO_FIN = "*/";

	public static void main(String[] args) {
		
		String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		
		System.out.println(cortaComentarios(codigo));

	}
	
	/**
	 * Borra comentarios en los códigos de C
	 * @param codigo codigo que descomenta
	 * @return tipo String con el código descomentado
	 */
	public static String cortaComentarios(String codigo) {
		//copia de codigo que se irá descomentando
		String codigoDescomentado = codigo;
		//número de donde está el comentario abierto
		int abreComentario = 0;
		//número de donde está el comentario cerrado
		int cierraComentario = 0;
		//string auxiliar
		String aux;
		
		//buscan donde empiezan y donde acaban los comentarios
		abreComentario = codigo.indexOf(COMENTARIO_INICIO);
		cierraComentario = codigo.indexOf(COMENTARIO_FIN);
		//si encuentra los comentarios entra en el bucle
		while (abreComentario!= -1 && cierraComentario !=-1) {
			//se usa un auxiliar para guardar una subcadena (el comentario)
			aux = codigoDescomentado.substring(abreComentario,cierraComentario+COMENTARIO_FIN.length());
			//al código descomentado de le sustituye el substring por la cadena vacía
			codigoDescomentado = codigoDescomentado.replace(aux, "");
			//vuelve a buscar comentarios
			abreComentario = codigoDescomentado.indexOf(COMENTARIO_INICIO);
			cierraComentario = codigoDescomentado.indexOf(COMENTARIO_FIN);
		}
		
		return codigoDescomentado;
	}
}
