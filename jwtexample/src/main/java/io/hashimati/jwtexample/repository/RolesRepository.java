package io.hashimati.jwtexample.repository;

import io.hashimati.jwtexample.domains.Roles;
import io.micronaut.data.repository.CrudRepository;

public interface RolesRepository  extends CrudRepository<Roles, Long> {

}
