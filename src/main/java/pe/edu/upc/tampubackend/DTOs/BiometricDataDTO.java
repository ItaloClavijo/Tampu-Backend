package pe.edu.upc.tampubackend.DTOs;

import lombok.Data;
import pe.edu.upc.tampubackend.Entities.BiometricData;
import pe.edu.upc.tampubackend.Entities.Users;

import java.time.LocalDateTime;

@Data
public class BiometricDataDTO {
    private Users user;
    private double heartRate;
    private double bloodPressure;
    private double spo2;
    private LocalDateTime date;
    private double stressLevel;     // Nivel de estrés (escala del smartwatch)
    private double sleepScore;
}


