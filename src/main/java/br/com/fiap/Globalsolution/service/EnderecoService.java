package br.com.fiap.Globalsolution.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.Globalsolution.model.Endereco;
import br.com.fiap.Globalsolution.repository.EnderecoRepository;

@Service
@Transactional
public class EnderecoService {

    @Autowired
    EnderecoRepository repository;

    public List<Endereco> listAll() {
        return repository.findAll();
    }

    public void save(Endereco endereco) {
        repository.save(endereco);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Endereco> getById(Long id) {
        return repository.findById(id);
    }
}
