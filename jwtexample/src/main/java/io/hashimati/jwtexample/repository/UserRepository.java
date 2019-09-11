package io.hashimati.jwtexample.repository;


import io.hashimati.jwtexample.domains.User;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;


@JdbcRepository(dialect = Dialect.MYSQL)
public interface UserRepository extends CrudRepository<User, String>
{

    public User findUserByUsername(String username);

     public User findUserByUsernameAndPassword(String username, String password);
}
