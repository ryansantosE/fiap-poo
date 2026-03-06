package br.com.fiapride.main;

import br.com.fiapride.model.ChaveMoto;

public class SistemaPrincipal {
    public static void main(String[] args) {

        ChaveMoto chaveRoyal = new ChaveMoto();
        chaveRoyal.material = "Ouro";
        chaveRoyal.desgastada = true;
        chaveRoyal.tipoDeChaveiro = "Redondo";

        ChaveMoto chaveHarley = new ChaveMoto();
        chaveHarley.material = "Plastico";
        chaveHarley.desgastada = false;
        chaveHarley.tipoDeChaveiro = "Quadrado";

        System.out.println("O material da chave da Royal é: " + chaveRoyal.material);
        System.out.println("O desgaste da chave da Royal é: " + chaveRoyal.desgastada);
        System.out.println("O tipo de chaveiro da chave da Royal é: " + chaveRoyal.tipoDeChaveiro);

        System.out.println("O material da chave da Harley é: " + chaveHarley.material);
        System.out.println("O desgaste da chave da Harley é: " + chaveHarley.desgastada);
        System.out.println("O tipo de chaveiro da chave da Harley é: " + chaveHarley.tipoDeChaveiro);

        System.out.println("--- Testes: usarChave() ---");
        chaveHarley.usarChave();
        chaveHarley.usarChave();

        System.out.println("--- Testes: alterarMaterial(String) ---");
        chaveRoyal.alterarMaterial("Aço");
        chaveRoyal.alterarMaterial("");
        chaveRoyal.alterarMaterial(null);

        System.out.println("--- Estado final ---");
        System.out.println("Royal -> material: " + chaveRoyal.material + ", desgastada: " 
                + chaveRoyal.desgastada + ", chaveiro: " + chaveRoyal.tipoDeChaveiro);
        System.out.println("Harley -> material: " + chaveHarley.material + ", desgastada: " 
                + chaveHarley.desgastada + ", chaveiro: " + chaveHarley.tipoDeChaveiro);
    }   // <-- fecha o main
}       // <-- fecha a classex		