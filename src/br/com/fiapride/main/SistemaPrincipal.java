package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.ChaveMoto;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	
    	// Dentro do main...// Fabriquei a primeira (Instância 1)
    	ChaveMoto ChaveRoyal = new ChaveMoto();
    	ChaveRoyal.material = "Ouro";
    	ChaveRoyal.desgastada = true;
    	ChaveRoyal.tipoDeChaveiro = "Redondo";
    	// Fabriquei a segunda (Instância 2)
    	ChaveMoto ChaveHarley = new ChaveMoto();
    	ChaveHarley.material = "Plastico";
    	ChaveHarley.desgastada = false;
    	ChaveHarley.tipoDeChaveiro = "Quadrado";
    	System.out.println("O material da chave da Royal é: " + ChaveRoyal.material);
    	System.out.println("O desgaste da chave da Royal é: " + ChaveRoyal.desgastada);
    	System.out.println("O Tipo de chaveiro da chave da Royal é: " + ChaveRoyal.tipoDeChaveiro);
    	System.out.println("O material da chave da Harley é: " + ChaveHarley.material);
    	System.out.println("O desgaste da chave da Harley é: " +ChaveHarley.desgastada);
    	System.out.println("O Tipo de chaveiro da chave da Harley é: " + ChaveHarley.tipoDeChaveiro);
    	
    }
    }