package com.zinteract.agent.repos;

import com.zinteract.common.dom.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swati on 21/10/14.
 */

public interface QueryRepository extends CrudRepository<Query,Long> {

   // List<Query> findByDefinition(String definition);





}
