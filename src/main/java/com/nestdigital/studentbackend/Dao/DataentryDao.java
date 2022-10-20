package com.nestdigital.studentbackend.Dao;

import com.nestdigital.studentbackend.Model.DataentryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DataentryDao extends CrudRepository<DataentryModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `dataentry` WHERE `id`=:id",nativeQuery = true)
    void deleteDataById(Integer id);
}
