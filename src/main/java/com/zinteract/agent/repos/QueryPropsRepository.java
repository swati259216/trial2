package com.zinteract.agent.repos;

import com.zinteract.common.dom.QueryProps;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swati on 28/10/14.
 */

public interface QueryPropsRepository extends CrudRepository<QueryProps,Long> {


    //List<QueryProps> findByQueryid(String queryid);
}
