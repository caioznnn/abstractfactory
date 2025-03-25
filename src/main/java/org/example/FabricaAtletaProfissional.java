package org.example;

public class FabricaAtletaProfissional implements FabricaAbstrata{
    @Override
    public Contrato createContrato() {
        return new CotratoAtletaProfissional();
    }

    @Override
    public CertificadoTransferencia createCertificadoTransferencia() {
        return new CertificadoTransferenciaProfissional();
    }
}
