package com.zinteract.agent.repos;

import com.zinteract.common.dom.PatternMatch;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swati on 21/10/14.
 */

public interface PatternMatchRepository extends CrudRepository<PatternMatch,Long>{

    //List<PatternMatch> findByTenantid(String tenantid);

}
