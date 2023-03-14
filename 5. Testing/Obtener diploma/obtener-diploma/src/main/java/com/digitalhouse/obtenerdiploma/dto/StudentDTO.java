package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
    private String name;
    private List<SubjectDTO> subjects;

    public StudentDTO() {
    }

    public String getName() {
        return name;
    }

    //public void setName(String name) {
//        this.name = name;
//    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

   // public void setSubjects(List<SubjectDTO> subjects) {
      //  this.subjects = subjects;
   // }

}
