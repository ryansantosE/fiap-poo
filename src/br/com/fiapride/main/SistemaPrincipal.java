package br.com.fiapride.main;

import br.com.fiapride.model.ChaveMoto;

public class SistemaPrincipal {

    public static void main(String[] args) {

        ChaveMoto chaveRoyal = new ChaveMoto();
        ChaveMoto chaveHarley = new ChaveMoto();

        chaveRoyal.alterarMaterial();
        chaveHarley.alterarMaterial();

        chaveHarley.usarChave();
        chaveHarley.usarChave();

        System.out.println(chaveRoyal.getMaterial());
        System.out.println(chaveRoyal.getDesgastada());
        System.out.println(chaveRoyal.getTipoDeChaveiro());

        System.out.println(chaveHarley.getMaterial());
        System.out.println(chaveHarley.getDesgastada());
        System.out.println(chaveHarley.getTipoDeChaveiro());
    }
}