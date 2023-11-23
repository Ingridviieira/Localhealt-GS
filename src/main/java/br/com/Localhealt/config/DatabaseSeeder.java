package br.com.Localhealt.config;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.Localhealt.models.Diagnostico;
import br.com.Localhealt.models.Doenca;
import br.com.Localhealt.models.Localizacao;
import br.com.Localhealt.models.Medico;
import br.com.Localhealt.repository.DiagnosticoRepository;
import br.com.Localhealt.repository.DoencaRepository;
import br.com.Localhealt.repository.LocalizacaoRepository;
import br.com.Localhealt.repository.MedicoRepository;



@Configuration
public class DatabaseSeeder implements CommandLineRunner{
    
    @Autowired
    DiagnosticoRepository diagnosticoRepository;

    @Autowired
    DoencaRepository doencaRepository;

    @Autowired
    LocalizacaoRepository localizacaoRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public void run(String... args) throws Exception {

        // Crie um médico
        Medico medico1 = Medico.builder().crm("95396").nmMedico("Dr. João").email("medico@gmail.com").senha("senha123").build();
        medicoRepository.save(medico1);

        // Crie uma doença
        Doenca doenca1 = Doenca.builder().nmDoenca("Gripe").dsSintomas("Febre, tosse, dor de cabeça").build();
        doencaRepository.save(doenca1);

        // Crie um diagnóstico associado ao médico e à doença
        Diagnostico diagnostico1 = Diagnostico.builder().nrCep("05773-110").dtDiagnostico(LocalDate.now()).medico(medico1).doenca(doenca1).build();
        diagnosticoRepository.save(diagnostico1);

        // Crie uma localização associada ao diagnóstico
        Localizacao localizacao1 = Localizacao.builder()
                .nmCidade("São Paulo")
                .nmEstado("SP")
                .nmRua("Rua Abc, 347")
                .nmBairro("Parque Regina")
                .diagnostico(diagnostico1)
                .build();
        localizacaoRepository.save(localizacao1);
    }
}