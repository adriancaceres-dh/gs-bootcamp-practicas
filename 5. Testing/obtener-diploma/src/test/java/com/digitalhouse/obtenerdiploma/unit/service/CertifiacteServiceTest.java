package com.digitalhouse.obtenerdiploma.unit.service;

import com.digitalhouse.obtenerdiploma.dto.CertificateDTO;
import com.digitalhouse.obtenerdiploma.dto.StudentDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CertifiacteServiceTest {
    @Test
    @DisplayName()
    public CertificateDTO analyzeNotes(StudentDTO notes) {
        CertificateDTO response = new CertificateDTO();
        response.setAverage(calculateAverage(notes));
        response.setMessage(writeDiploma(notes));
        return response;
    }
}
