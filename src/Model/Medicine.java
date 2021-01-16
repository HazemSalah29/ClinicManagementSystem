package Model;

public class Medicine {
    private String id;
    private String medicineType;
    private String medicineName;
    private String medicineDesc;
    private float price;
    private int medQuantity;
    
    
	public Medicine() {
		super();
	}
	
	
	
	
	public Medicine(String id, String medicineType, String medicineName, String medicineDesc, float price,
			int medQuantity) {
		super();
		this.id = id;
		this.medicineType = medicineType;
		this.medicineName = medicineName;
		this.medicineDesc = medicineDesc;
		this.price = price;
		this.medQuantity = medQuantity;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMedicineType() {
		return medicineType;
	}
	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getMedicineDesc() {
		return medicineDesc;
	}
	public void setMedicineDesc(String medicineDesc) {
		this.medicineDesc = medicineDesc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getMedQuantity() {
		return medQuantity;
	}
	public void setMedQuantity(int medQuantity) {
		this.medQuantity = medQuantity;
	}
    
}
