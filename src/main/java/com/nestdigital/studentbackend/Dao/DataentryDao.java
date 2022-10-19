package com.nestdigital.studentbackend.Dao;

import com.nestdigital.studentbackend.Model.DataentryModel;
import org.springframework.data.repository.CrudRepository;

public interface DataentryDao extends CrudRepository<DataentryModel,Integer> {
}
