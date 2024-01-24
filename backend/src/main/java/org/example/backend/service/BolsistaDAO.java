package org.example.backend.service;

import java.util.Collection;
import java.util.Optional;

public class BolsistaDAO implements DAO {
    @Override
    public Optional<T> get(int id) {
        return Optional.empty();
    }
    @Override
    public Collection<T> getAll(){
        return bolsistas.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(Object o) {
        return 0;
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }


}
