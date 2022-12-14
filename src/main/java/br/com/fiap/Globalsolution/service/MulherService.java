package br.com.fiap.Globalsolution.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.Globalsolution.model.Mulher;
import br.com.fiap.Globalsolution.repository.LocalEscolhidoRepository;
import br.com.fiap.Globalsolution.repository.MulherRepository;

@Service
@Transactional
public class MulherService {

    @Autowired
    MulherRepository repository;

    @Autowired
    LocalEscolhidoRepository localRepository;

    public void save(Mulher mulher) {
        repository.save(mulher);
    }

    public List<Mulher> listAll() {
        return repository.findAll();
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Mulher> getById(Long id) {
        return repository.findById(id);
    }

}
