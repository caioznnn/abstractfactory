package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void deveEmitirContratoProfissional() {
        FabricaAbstrata fabrica = new FabricaAtletaProfissional();
        Atleta atleta = new Atleta(fabrica);
        assertEquals(" --- CONTRATO PROFISSIONAL --- ", atleta.emitirContrato());
    }

    @Test
    void deveEmitirContratoBase() {
        FabricaAbstrata fabrica = new FabricaAtletaBase();
        Atleta atleta = new Atleta(fabrica);
        assertEquals(" --- CONTRATO DE DIVISÕES DE BASE --- ", atleta.emitirContrato());
    }

    @Test
    void deveEmitirCertificadoTransferenciaProfissional() {
        FabricaAbstrata fabrica = new FabricaAtletaProfissional();
        Atleta atleta = new Atleta(fabrica);
        assertEquals(" --- CERTIFICADO DE TRANSFERÊNCIA PROFISSIONAL --- ", atleta.emitirCertificadoTransferencia());
    }

    @Test
    void deveEmitirCertificadoTransferenciabase() {
        FabricaAbstrata fabrica = new FabricaAtletaBase();
        Atleta atleta = new Atleta(fabrica);
        assertEquals(" --- CERTIFICADO DE TRANSFERÊNCIA DE DIVISÕES DE BASE --- ", atleta.emitirCertificadoTransferencia());
    }
}