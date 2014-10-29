package com.zinteract.agent.repos;

import com.zinteract.common.dom.ZDataSource;
import org.springframework.data.repository.CrudRepository;


public interface DataSourceRepository extends CrudRepository<ZDataSource,Long> {
    //List<DataSource> findByType(String type);
}
