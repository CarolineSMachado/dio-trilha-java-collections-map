package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
			if(numeroPorNome == null) {
				System.out.println("Contato não encontrado na agenda.");
		    }
		}
		return numeroPorNome;
	}

	
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Caroline", 884526);
		agendaContatos.adicionarContato("Ricardo", 899651);
		agendaContatos.adicionarContato("Luís de Montfort", 845216);
		agendaContatos.adicionarContato("Luís IX", 899654);
		
		agendaContatos.exibirContatos();
		agendaContatos.removerContato("Caroline");
		System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Ricardo"));
	}
}
