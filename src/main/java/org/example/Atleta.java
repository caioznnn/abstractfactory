package org.example;

public class Atleta {

    private Contrato contrato;
    private CertificadoTransferencia certificadoTransferencia;

    public Atleta (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.certificadoTransferencia = fabrica.createCertificadoTransferencia();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirCertificadoTransferencia() {
        return this.certificadoTransferencia.emitir();
    }
}
