package org.example;

public class FabricaAtletaBase implements FabricaAbstrata{
    @Override
    public Contrato createContrato() {
        return new ContratoAtletaBase();
    }

    @Override
    public CertificadoTransferencia createCertificadoTransferencia() {
        return new CertificadoTransferenciaBase();
    }
}
