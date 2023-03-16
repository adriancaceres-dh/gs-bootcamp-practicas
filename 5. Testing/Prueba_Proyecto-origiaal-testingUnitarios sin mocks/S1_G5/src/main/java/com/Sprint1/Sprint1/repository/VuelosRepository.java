package com.Sprint1.Sprint1.repository;

import com.Sprint1.Sprint1.model.VuelosObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Data
@Repository
public class VuelosRepository {

    VuelosObject vuelosObject = new VuelosObject();

    List<VuelosObject> vuelosCargados;

    public VuelosRepository(){
        vuelosCargados = loadDataBase();
    }

    public List<VuelosObject> listaDeVuelos(){
        return vuelosCargados;
    }

    private List<VuelosObject> loadDataBase() {
        List<VuelosObject> vuelos = null;
        File file;

        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                .registerModule(new JavaTimeModule());
        TypeReference<List<VuelosObject>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:JSON/vuelosJSON.json");
            vuelos = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vuelos;
    }
}
