package com.nestdigital.studentbackend.Dao;

import com.nestdigital.studentbackend.Model.DataentryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DataentryDao extends CrudRepository<DataentryModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `dataentry` WHERE `id`=:id",nativeQuery = true)
    void deleteDataById(Integer id);

    @Query(value = "SELECT `id`, `clubcolour`, `clubname`, `moto`, `studentname` FROM `dataentry` WHERE `clubname`=:clubname",nativeQuery = true)
    List<DataentryModel>searchData(String clubname);
}
