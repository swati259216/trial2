package com.zinteract.agent.repos;

import com.zinteract.common.dom.QueryRun;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swati on 21/10/14.
 */
public interface QueryRunRepository extends CrudRepository<QueryRun,Long> {

   //List<QueryRun> findByDatasourceid(Long datasourceid);


}
