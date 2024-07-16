package entities;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	protected Iphone() {

	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número: "+numero);

	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página de url: "+url);

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");

	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: "+musica);

	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");

	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");

	}

}
