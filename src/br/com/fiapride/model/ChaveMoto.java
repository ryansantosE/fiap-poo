package br.com.fiapride.model;

public class ChaveMoto {

    private String material;
    private boolean desgastada;
    private String tipoDeChaveiro;

    public void usarChave() {
        if (!desgastada) {
            desgastada = true;
        }
    }

    public void alterarMaterial() {
        setMaterial("Metal");
    }

    public String getMaterial() {
        return material;
    }

    public boolean getDesgastada() {
        return desgastada;
    }

    public String getTipoDeChaveiro() {
        return tipoDeChaveiro;
    }

    private void setMaterial(String material) {
        if (material != null && !material.trim().isEmpty()) {
            this.material = material;
        }
    }

    private void setTipoDeChaveiro(String tipoDeChaveiro) {
        this.tipoDeChaveiro = tipoDeChaveiro;
    }
}