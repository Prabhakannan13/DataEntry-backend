package com.nestdigital.studentbackend.Controller;

import com.nestdigital.studentbackend.Dao.DataentryDao;
import com.nestdigital.studentbackend.Model.DataentryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataentryController {
    @Autowired
    private DataentryDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/dataentry",consumes = "application/json",produces = "application/json")
    public String dataentry(@RequestBody DataentryModel dataentry){
        System.out.println(dataentry.toString());
        dao.save(dataentry);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewdataentry")
    public List<DataentryModel>viewdataentry(){
        return (List<DataentryModel>) dao.findAll();
    }
}
