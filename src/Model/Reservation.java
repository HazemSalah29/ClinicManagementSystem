package Model;

import java.util.Date;
import java.util.List;

public class Reservation {
	private String id;
	private Date reservation;
	private Date createdAt = new Date();
	private String createdBy;
	private String patient;
	private String Doctor;
	private String medicalInfo;

	
	
	public Reservation() {
		super();
	}

    public Reservation(String id, Date reservation, String createdBy, String patient, String Doctor, String medicalInfo) {
        this.id = id;
        this.reservation = reservation;
        this.createdBy = createdBy;
        this.patient = patient;
        this.Doctor = Doctor;
        this.medicalInfo = medicalInfo;
    }

    public String getId() {
        return id;
    }

    public Date getReservation() {
        return reservation;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return Doctor;
    }

    public String getMedicalInfo() {
        return medicalInfo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setReservation(Date reservation) {
        this.reservation = reservation;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public void setMedicalInfo(String medicalInfo) {
        this.medicalInfo = medicalInfo;
    }
	
	



	
	
}
