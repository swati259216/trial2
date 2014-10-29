package com.zinteract.agent.repos;

import com.zinteract.common.dom.QuerySchedule;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swati on 21/10/14.
 */

public interface QueryScheduleRepository extends CrudRepository<QuerySchedule,Long> {

    //List<QuerySchedule> findByInstallid(Long installid);
}
