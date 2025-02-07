package com.demo.inbox.email;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmailRepository extends CassandraRepository<Email, UUID>  {

}