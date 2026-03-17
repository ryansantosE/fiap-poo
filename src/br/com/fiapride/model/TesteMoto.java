package br.com.fiapride.model;

import br.com.fiapride.model.ChaveMoto;

public class TesteMoto {

	    public static void main(String[] args) {

	        System.out.println("--- Teste do Meu Projeto Pessoal ---");

	        // 1. Instanciando o objeto (criando o espaço na memória)
	        ChaveMoto minhaChave = new ChaveMoto();

	        // 2. Lendo o estado inicial do objeto
	        System.out.println("Material inicial: " + minhaChave.getMaterial());
	        System.out.println("Está desgastada? " + minhaChave.getDesgastada());
	        System.out.println("Tipo de chaveiro: " + minhaChave.getTipoDeChaveiro());

	        // 3. Testando comportamentos do objeto
	        System.out.println("\nUsando a chave...");
	        minhaChave.usarChave();

	        System.out.println("Alterando material da chave...");
	        minhaChave.alterarMaterial();

	        // 4. Imprimindo o estado final no console
	        System.out.println("\nEstado final da chave:");
	        System.out.println("Material: " + minhaChave.getMaterial());
	        System.out.println("Está desgastada? " + minhaChave.getDesgastada());
	        System.out.println("Tipo de chaveiro: " + minhaChave.getTipoDeChaveiro());
	    }
	}
