package com.digitalhouse.obtenerdiploma.utils;

import com.digitalhouse.obtenerdiploma.dto.CertificateDTO;

public class CertificateFactory {
    public static CertificateDTO getCertificate(){
        return CertificateDTO.builder()
                .message("Lucho usted ha conseguido el promedio de 9.0")
                .average(9.0)
                .student(StudentFactory.getStudent())
                .build();
    }

    public static CertificateDTO getCertificateWithAverage(){
        return CertificateDTO.builder()
                .message("¡Felicitaciones Lucas! Usted tiene el gran promedio de 9.5")
                .average(9.5)
                .student(StudentFactory.getStudentWithAverage())
                .build();
    }
}
