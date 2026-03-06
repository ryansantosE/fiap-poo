package br.com.fiapride.model;

public class ChaveMoto {

    public String material;
    public boolean desgastada;
    public String tipoDeChaveiro;

    public ChaveMoto() {
    }

    public void usarChave() {
        if (!desgastada) {
            desgastada = true;
            System.out.println("A chave foi usada e agora está desgastada.");
        } else {
            System.out.println("A chave já está desgastada.");
        }
    }

    public void alterarMaterial(String novoMaterial) {
        if (novoMaterial == null || novoMaterial.trim().isEmpty()) {
            System.out.println("Erro: material inválido.");
            return;
        }
        material = novoMaterial;
        System.out.println("Material alterado para: " + material);
    }
}
